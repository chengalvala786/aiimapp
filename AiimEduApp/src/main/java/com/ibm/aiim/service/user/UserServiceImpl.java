package com.ibm.aiim.service.user;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.aiim.db.model.Tbltemp;
import com.ibm.aiim.db.model.Tbluser;
import com.ibm.aiim.service.mail.MailService;
import com.ibm.aiim.service.registration.RegisterationImpl;
import com.ibm.aiim.ui.model.Application;
import com.ibm.aiim.ui.model.PersonalInfo;
import com.ibm.aiim.ui.model.User;
import com.ibm.aiim.util.DateUtil;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{

	private static final AtomicLong counter = new AtomicLong();



	public List<PersonalInfo> findAllUsers() {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
	
		List<PersonalInfo> users = new ArrayList<PersonalInfo>();
		PersonalInfo user =null;
		Query query = entitymanager.createQuery("SELECT c FROM Tbluser c" );
		List<Tbluser> results = query.getResultList();
	
		
		if (results!=null && results.size()>0){
			for (Tbluser userObj : results){
				user = new PersonalInfo();
				
				
						if (userObj.getFirstName()!=null){
								user.setFName(userObj.getFirstName());
								user.setLName(userObj.getLastName());
								user.setMName(userObj.getMiddleName());
								user.setEmailId(userObj.getEmail());
								user.setRegno(userObj.getRegno());
								user.setGender(userObj.getSex());
								user.setMobileNumber(userObj.getMobileNo());
								user.setDob(DateUtil.formatToUIDate(userObj.getDateOfBirth()));
								user.setStatus(userObj.getStatus());
								user.setDt_created(DateUtil.formatToUIDate(userObj.getDtCreated()));
						users.add(user);
						
						
						}
						
			}
		}
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
		return users;
	}
	

	public PersonalInfo findByEmailId(String emailId) {
		return null;

	}

	public boolean activateId(String id) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		EntityTransaction updateTransaction = entitymanager.getTransaction();
		updateTransaction.begin();

		Query query = entitymanager.createQuery("UPDATE Tbluser user SET user.status = 'T' "

				                            + "WHERE user.activationkey= :id");

		query.setParameter("id",id);
		int updateCount = query.executeUpdate();

		if (updateCount > 0) {

			System.out.println("Activate the key Done for .."+ id );

		}

		updateTransaction.commit();
		entitymanager.close( );
		emfactory.close( );
			return true;
	}

	public String saveUser(PersonalInfo user) {
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		Tbluser userTable = new Tbluser();
		//Personal Info 
		Random rnd = new Random();
		int n = 100000 + rnd.nextInt(900000);
		String actKey =String.valueOf(n);
		Query query = entitymanager.createNativeQuery("SELECT regno FROM tblusers user  WHERE user.regno IS NOT NULL ORDER BY user.id DESC LIMIT 1" );




		List<String> results = query.getResultList();
		String regNo = null;
		int newRegNo = 0;
		if (results!=null && results.size()>0){
			for (String userObj : results){
				regNo = userObj;
				int regInt = Integer.parseInt(regNo);
				newRegNo= regInt+1;
				
				
				userTable.setRegno(String.valueOf(newRegNo));		
			}

		}	
		userTable.setActivationkey(actKey);
		userTable.setFirstName(user.getFName());
		userTable.setCycleYear( new Date().getMonth() +"-"+ new Date().getYear());
		userTable.setDtCreated(new Date());;
		userTable.setLastName(user.getLName());
		userTable.setMiddleName(user.getMName());
		userTable.setEmail(user.getEmailId());
		userTable.setSex(user.getGender());
		userTable.setMobileNo(user.getMobileNumber());
		userTable.setDateOfBirth(DateUtil.formatToDBDate(user.getDob()));
		userTable.setCycleYear("2016-17");
		userTable.setPasswd(user.getPassword());
		
		//logging an application Application Table
		RegisterationImpl regService = new RegisterationImpl();
		Application appl = new Application();
		
		
		user.setRegno(String.valueOf(newRegNo));
		appl.setPersonalInfo(user);
		
		boolean create = true;
		String rowId = regService.saveApplication(appl ,create );
		userTable.setApp_rw_id(rowId);
		userTable.setStatus("F");
		entitymanager.persist(userTable);
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
		MailService.sendMail(user, actKey);

		return "";
	}

	public boolean isUserExist(PersonalInfo user) {
		// TODO Auto-generated method stub
		return false;
	}

	public Application login(PersonalInfo user) {
		// TODO Auto-generated method stub
		Application appl = null;
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		Tbluser userTable = new Tbluser();

		Query query = entitymanager.createQuery("SELECT c FROM Tbluser c  WHERE  c.email ='" +user.getEmailId()+"' "+ "AND c.passwd = '" + user.getPassword()+"'"  );
		List<Tbluser> results = query.getResultList();
		if (results!=null && results.size()>0){
			for (Tbluser userObj : results){
				//UseRr created after Feb-07-2016 will have to activate the user. 
				Date dateCreated  = userObj.getDtCreated();
				Date demarkDate = (new GregorianCalendar(2016, Calendar.FEBRUARY, 6)).getTime();
				if (dateCreated.after(demarkDate) && userObj.getStatus().equalsIgnoreCase("F")){
					return appl;
				}
				if (userObj.getApp_rw_id()!=null && !userObj.getApp_rw_id().equals("NULL")){
				
				 query = entitymanager.createQuery("SELECT c FROM Tbltemp c  WHERE  c.email ='" +user.getEmailId()+"' "+ "AND c.id = " + Integer.parseInt(userObj.getApp_rw_id())  );
				}else{
					
				 query = entitymanager.createQuery("SELECT c FROM Tbltemp c  WHERE  c.email ='" +user.getEmailId()+"' "  );
							
				}
				 
				 List<Tbltemp> resultsApp = query.getResultList();
						
				 if (resultsApp!=null && resultsApp.size()>0){
					 Tbltemp applTable = 	 resultsApp.get(0);
					RegisterationImpl  regService = new RegisterationImpl();
					appl = new Application();
					String rowId = userObj.getApp_rw_id();
					appl.setApp_rw_id(rowId);
					regService.retriveApplication(appl, applTable);
					}
				
				}
		}
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
		return appl;


	}
}
