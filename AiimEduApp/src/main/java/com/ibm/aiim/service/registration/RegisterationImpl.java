package com.ibm.aiim.service.registration;


import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.ibm.aiim.db.model.Tbltemp;
import com.ibm.aiim.payment.model.Transaction;
import com.ibm.aiim.ui.model.Activity;
import com.ibm.aiim.ui.model.AdditionalInfo;
import com.ibm.aiim.ui.model.AdmissionTest;
import com.ibm.aiim.ui.model.Application;
import com.ibm.aiim.ui.model.EductionalInfo;
import com.ibm.aiim.ui.model.Employment;
import com.ibm.aiim.ui.model.Gd;
import com.ibm.aiim.ui.model.Highschool;
import com.ibm.aiim.ui.model.Language;
import com.ibm.aiim.ui.model.PersonalInfo;
import com.ibm.aiim.ui.model.Pg;
import com.ibm.aiim.ui.model.Pq;
import com.ibm.aiim.ui.model.School;
import com.ibm.aiim.ui.model.WorkInfo;
import com.ibm.aiim.util.DateUtil;

@Service("regService")

public class RegisterationImpl implements RegisterationService{



	private static final AtomicLong counter = new AtomicLong();


	public boolean saveTransaction(Transaction tran){
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		EntityTransaction updateTransaction = entitymanager.getTransaction();
		updateTransaction.begin();

		Query query = entitymanager.createQuery("UPDATE Tbltemp apdb SET apdb.tran_id = "+tran.getBank_txn()

				+ " WHERE apdb.email= :id");

		String id= tran.getUdf2();

		query.setParameter("id", id);
		int updateCount = query.executeUpdate();

		if (updateCount > 0) {

			System.out.println("Activate the key Done for .."+ id );

		}

		updateTransaction.commit();


		entitymanager.close( );
		emfactory.close( );

		return true;
	}
	
	
	public List<Application> retAllCmplApps(String status , String emailId , String startDate, String endDate) {
		// TODO Auto-generated method stub
		Application appl = null;
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );
		entitymanager.getTransaction( ).begin( );
		Query query =null;
		String format ="EEE MMM dd yyyy HH:mm:ss";

		if (status!=null){
			SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ENGLISH);
			try{
			Date stDate = sdf.parse(startDate);
			Date  enDate= sdf.parse(endDate);
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sqlQuery ="SELECT c FROM Tbltemp c  WHERE  c.terms ='" +status+"' AND  c.dtCheck  BETWEEN  '"+ formatter.format(stDate) +"' AND '"+ formatter.format(enDate)+"'"   ;
			query = entitymanager.createQuery(sqlQuery);
			}catch(Exception e){
				e.printStackTrace();
			}
			
		}
		else if 
		(emailId!=null){
			String sqlQuery ="SELECT c FROM Tbltemp c  WHERE  c.email ='" +emailId+"' "  ;
			query = entitymanager.createQuery(sqlQuery);
			
		}else if (startDate!= null && endDate!=null ){
			SimpleDateFormat sdf = new SimpleDateFormat(format, Locale.ENGLISH);
			try{
			Date stDate = sdf.parse(startDate);
			Date  enDate= sdf.parse(endDate);
			
			Format formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String sqlQuery = "SELECT c FROM Tbltemp c WHERE c.dtCheck  BETWEEN  '"+ formatter.format(stDate) +"' AND '"+ formatter.format(enDate)+"'";
					
			query = entitymanager.createQuery(sqlQuery);
			}catch(Exception e){
				e.printStackTrace();
			}
			
			
		}else{
			
			query = entitymanager.createQuery("SELECT c FROM Tbltemp c WHERE c.terms='A'" );
			
		}
		
		RegisterationImpl  regService = new RegisterationImpl();			
		List<Application> appls =  new ArrayList<Application>();		
				 List<Tbltemp> resultsApp = query.getResultList();
				 if (resultsApp!=null && resultsApp.size()>0){
					for (Tbltemp applTable : resultsApp){ 
					appl = new Application();
					regService.retriveApplication(appl, applTable);
					appls.add(appl);
					}
				 }
				
				
		
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );
		return appls;


	}
	
	
	
	
	
	

	public void retriveApplication(Application appl, Tbltemp applicationTable ) {
		//Personal Info 
		PersonalInfo personInfo = new PersonalInfo();
		personInfo.setFName(applicationTable.getFirstName());
		personInfo.setMName(applicationTable.getMiddleName());
		personInfo.setLName(applicationTable.getLastName());
		personInfo.setDob(DateUtil.formatToUIDate(applicationTable.getDateOfBirth()));
		personInfo.setNationality("Indian");
		personInfo.setCategory(applicationTable.getCategory());
		personInfo.setEmailId(applicationTable.getEmail());
		appl.setApp_rw_id(String.valueOf(applicationTable.getId()));
		personInfo.setGender(applicationTable.getSex());
		personInfo.setMobileNumber(applicationTable.getPhoneMobile());
		if (applicationTable.getPhoneHome()!=null){
			if ( applicationTable.getPhoneHome().contains("-")){
				String phone[] = applicationTable.getPhoneHome().split("-");
				if (phone.length>1){
					personInfo.setStdCode(phone[0]);
					personInfo.setNumber(phone[1]);
				}
			}else{
				personInfo.setNumber(applicationTable.getPhoneHome());
			}
		}
		personInfo.setAd1(applicationTable.getAddress1());
		personInfo.setAd2(applicationTable.getAddress2());
		personInfo.setCity(applicationTable.getCity());
		personInfo.setCountry(applicationTable.getCountry());
		personInfo.setPincode(applicationTable.getPincode());
		personInfo.setState(applicationTable.getState());
		personInfo.setRegno(applicationTable.getRegno());



		personInfo.setNumber(applicationTable.getPhoneHome());
		int mstatus = applicationTable.getMaritalStatus();
		personInfo.setMaritalStatus(String.valueOf(mstatus));
		if (applicationTable.getPhotograph()!=null ){
			personInfo.setPhoto(applicationTable.getPhotograph());
		}
		//TO DO //applicationTable.setMailingAddr(appl.getPersonalInfo().getAd1() +", "+appl.getPersonalInfo().getAd2() +", "+ appl.getPersonalInfo().getCity() +", "+ appl.getPersonalInfo().getCountry()+", "+ appl.getPersonalInfo().getPincode());
		//TO DO //applicationTable.setPhoneHome(appl.getPersonalInfo().getStdCode() + appl.getPersonalInfo().getNumber());
		List<Language>  languages = new ArrayList<Language>();
		Language lang = new Language();
		if (applicationTable.getLang1()!=null){
			lang.setId(0);
			lang.setValue(applicationTable.getLang1());
			
		}
		languages.add(lang);
		if (applicationTable.getLang2()!=null){
			lang = new Language();
			lang.setId(1);
			lang.setValue(applicationTable.getLang2());
			languages.add(lang);

		}
		if (applicationTable.getLang3()!=null){
			lang = new Language();
			lang.setId(2);
			lang.setValue(applicationTable.getLang3());
			languages.add(lang);
		}
		if (applicationTable.getLang4()!=null){
			lang = new Language();
			lang.setId(3);
			lang.setValue(applicationTable.getLang4());
			languages.add(lang);
		}
		personInfo.setLanguages(languages);

		appl.setPersonalInfo(personInfo);


		EductionalInfo educationInfo = new  EductionalInfo();
		appl.setEductionalInfo(educationInfo);

		School school = new School();
		school.setSchoolName(applicationTable.getSchool10());
		school.setStdDivision(applicationTable.getSchool10ClassDiv());
		if (applicationTable.getSchool10Passing()!=null){
			String date[] = applicationTable.getSchool10Passing().split("-");
			school.setPassingMonth(date[0]);
			school.setPassingYear(date[1]);
		}
		school.setPercentage(applicationTable.getSchool10Percentage());
		educationInfo.setSchool(school);

		Highschool highSchool = new Highschool();
		highSchool.setSchoolName(applicationTable.getSchool12());
		highSchool.setStreamName(applicationTable.getSchool12Major1());
		highSchool.setStd12Division(applicationTable.getSchool12ClassDiv());
		if (applicationTable.getSchool10Passing()!=null){
			String date[] = applicationTable.getSchool12Passing().split("-");
			if (date.length>1){
				highSchool.setPassingMonth(date[0]);
				highSchool.setPassingYear(date[1]);
			}
		}
		highSchool.setStd12Percentage(applicationTable.getSchool12Percentage());
		educationInfo.setHighschool(highSchool);

		//Grad details. 

		Gd graduate =  new Gd();
		graduate.setObtained(applicationTable.getBachDeg1());
		graduate.setSubject(applicationTable.getBachSub1());
		graduate.setCollege(applicationTable.getBachCollege1());
		graduate.setDivision(applicationTable.getBachLetGrade1());
		graduate.setUniversity(applicationTable.getBachUniv1());

		if (applicationTable.getBachFrm11()!=null){
			String date[] = applicationTable.getBachFrm11().split("-");
			if (date.length>1){
			graduate.setFromMonth(date[0]);
			graduate.setFromYear(date[1]);
			}

		}
		if (applicationTable.getBachTo11()!=null){
			String date[] = applicationTable.getBachTo11().split("-");
			if (date.length>1){
			graduate.setToMonth(date[0]);
			graduate.setToYear(date[1]);
			}
		}

		graduate.setMarks(applicationTable.getBachMarks11());
		graduate.setMaxmarks(applicationTable.getBachMarks11());


		educationInfo.setGd(graduate);

		//Addl grad details 
		List<Gd> addlGd= new ArrayList<Gd>();
		//Grad details. 
		if (applicationTable.getBachDeg2()!=null){
			graduate =  new Gd();
			graduate.setObtained(applicationTable.getBachDeg2());
			graduate.setSubject(applicationTable.getBachSub2());
			graduate.setCollege(applicationTable.getBachCollege2());
			graduate.setUniversity(applicationTable.getBachUniv2());
			if (applicationTable.getBachFrm21()!=null){
				String date[] = applicationTable.getBachFrm21().split("-");
				if (date.length>1){
				graduate.setFromMonth(date[0]);
				graduate.setFromYear(date[1]);
				}
			}
			if (applicationTable.getBachTo21()!=null){
			
				String date[] = applicationTable.getBachTo21().split("-");
				if (date.length>1){
				graduate.setToMonth(date[0]);
				graduate.setToYear(date[1]);
				}
			}
			graduate.setMarks(applicationTable.getBachMarks21());
			graduate.setMaxmarks(applicationTable.getBachMarks21());

			addlGd.add(graduate);
		}
		if (applicationTable.getBachDeg3()!=null){
			graduate =  new Gd();
			graduate.setObtained(applicationTable.getBachDeg3());
			graduate.setSubject(applicationTable.getBachSub3());
			graduate.setCollege(applicationTable.getBachCollege3());
			graduate.setUniversity(applicationTable.getBachUniv3());

			if (applicationTable.getBachFrm31()!=null){
				String date[] = applicationTable.getBachFrm31().split("-");
				if (date.length>1){
				graduate.setFromMonth(date[0]);
				graduate.setFromYear(date[1]);
				}

			}
			if (applicationTable.getBachTo31()!=null){
				String date[] = applicationTable.getBachTo31().split("-");
				if (date.length>1){
				graduate.setToMonth(date[0]);
				graduate.setToYear(date[1]);
				}
			}
			graduate.setMarks(applicationTable.getBachMarks31());
			graduate.setMaxmarks(applicationTable.getBachMarks31());
			addlGd.add(graduate);
		}
		educationInfo.setGdAdd(addlGd);


		//Grad details. 

		Pg pg =  new Pg();
		pg.setObtained(applicationTable.getMstrDeg1());
		pg.setSubject(applicationTable.getMstrSub1());
		pg.setCollege(applicationTable.getMstrCollege1());
		pg.setUniversity(applicationTable.getMstrUniv1());

		if (applicationTable.getMstrFrm11()!=null){
			String date[] = applicationTable.getMstrFrm11().split("-");
			if (date.length>1){
			pg.setFromMonth(date[0]);
			pg.setFromYear(date[1]);
			}

		}
		if (applicationTable.getMstrTo11()!=null){
			String date[] = applicationTable.getMstrTo11().split("-");
			if (date.length>1){
			pg.setToMonth(date[0]);
			pg.setToYear(date[1]);
			}
		}
		educationInfo.setPg(pg);	

		//Addl grad details 
		List<Pg> addlPg= new ArrayList<Pg>();



		if (applicationTable.getMstrDeg2()!=null){
			pg =  new Pg();
			pg.setObtained(applicationTable.getMstrDeg2());
			pg.setSubject(applicationTable.getMstrSub2());
			pg.setCollege(applicationTable.getMstrCollege2());
			pg.setUniversity(applicationTable.getMstrUniv2());

			if (applicationTable.getMstrFrm21()!=null){
				String date[] = applicationTable.getMstrFrm21().split("-");
				if (date.length>1){
				pg.setFromMonth(date[0]);
				pg.setFromYear(date[1]);
				}

			}
			if (applicationTable.getMstrTo21()!=null){
				String date[] = applicationTable.getMstrTo21().split("-");
				if (date.length>1){
				pg.setToMonth(date[0]);
				pg.setToYear(date[1]);
				}
			}

			addlPg.add(pg);
		}

		if (applicationTable.getMstrDeg3()!=null){
			pg =  new Pg();
			pg.setObtained(applicationTable.getMstrDeg3());
			pg.setSubject(applicationTable.getMstrSub3());
			pg.setCollege(applicationTable.getMstrCollege3());
			pg.setUniversity(applicationTable.getMstrUniv3());

			if (applicationTable.getMstrFrm31()!=null){
				String date[] = applicationTable.getMstrFrm31().split("-");
				if (date.length>1){
				pg.setFromMonth(date[0]);
				pg.setFromYear(date[1]);
				}

			}
			if (applicationTable.getMstrTo31()!=null){
				String date[] = applicationTable.getMstrTo31().split("-");
				if (date.length>1){
				pg.setToMonth(date[0]);
				pg.setToYear(date[1]);
				}
			}

			addlPg.add(pg);
		}
		educationInfo.setPgAdd(addlPg);




		//List of Addition pg  -End 
		Pq pq = new Pq();
		educationInfo.setPq(pq);
		pq.setObtained(applicationTable.getProfDeg1());
		pg.setCollege(applicationTable.getProfInst1());
		pq.setMarks(applicationTable.getProfMarks1());
		if (applicationTable.getProfMnth1()!=null && applicationTable.getProfMnth1().contains("-")){
			String date[] = applicationTable.getProfMnth1().split("-");
			if (date.length>1){
			pq.setFrom_month(date[0]);
			pq.setFrom_year(date[1]);
			}

		}	
		pq.setDivision(applicationTable.getProfPcnt1())	;
		educationInfo.setPq(pq);
		//Addl grad details 
		List<Pq> addlPq= new ArrayList<Pq>();

		
		
		if (applicationTable.getProfDeg2()!=null){
			pq = new Pq();
			pq.setObtained(applicationTable.getProfDeg2());
			pg.setCollege(applicationTable.getProfInst2());
			pq.setMarks(applicationTable.getProfMarks2());
					if (applicationTable.getProfMnth2()!=null && applicationTable.getProfMnth2().contains("-")){
						String date[] = applicationTable.getProfMnth2().split("-");
						if (date.length>1){
						pq.setFrom_month(date[0]);
						pq.setFrom_year(date[1]);
						}
			
					}	
				pq.setDivision(applicationTable.getProfPcnt2())	;	
	
				addlPq.add(pq);
		}
		if (applicationTable.getProfDeg3()!=null){
			pq = new Pq();
			pq.setObtained(applicationTable.getProfDeg3());
			pg.setCollege(applicationTable.getProfInst3());
			pq.setMarks(applicationTable.getProfMarks3());
					if (applicationTable.getProfMnth3()!=null && applicationTable.getProfMnth3().contains("-")){
						String date[] = applicationTable.getProfMnth3().split("-");
						if (date.length>1){
						pq.setFrom_month(date[0]);
						pq.setFrom_year(date[1]);
						}
			
					}	
				pq.setDivision(applicationTable.getProfPcnt3())	;	
	
				addlPq.add(pq);
		}
	


		educationInfo.setpqAdd(addlPq);

		AdmissionTest admisTest =new AdmissionTest();
		admisTest.setAdmTestName(applicationTable.getAdmissiontest());
		admisTest.setDoe(applicationTable.getAdmissiontestdate());
		admisTest.setRegnumber(applicationTable.getRegister_no());
		admisTest.setAdmScore(applicationTable.getScore());
		admisTest.setAdmPercentage(applicationTable.getPecentile());
		educationInfo.setAdmissionTest(admisTest);

		//Work Experience 

		WorkInfo workDetails  = new WorkInfo();
		appl.setWorkInfo(workDetails);
		workDetails.setTotalWexp(applicationTable.getTotExp());
		List<Employment> exp =  new ArrayList<Employment>();
		workDetails.setExperience(exp);
		Employment work = new Employment();			
		if (applicationTable.getFrmDt1()!=null){	

			String date[] = applicationTable.getFrmDt1().split("-");
			if (date.length>1){
			work.setWeFromMonth(date[0]);
			work.setWeFromYear(date[1]);
			}

		}	
		if (applicationTable.getToDt1()!=null){	

			String date[] = applicationTable.getToDt1().split("-");
			if (date.length>1){
			work.setWeToMonth(date[0]);
			work.setWeToYear(date[1]);
			}
		}

		work.setTotalMonths(applicationTable.getNumMnths1());
		work.setCmpName(applicationTable.getNameEmp1());
		//applicationTable.setAddrEmp1(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
		work.setDesignation(applicationTable.getDesigEmp1());
		work.setRoles(applicationTable.getRoleEmp1());
		work.setCtc(applicationTable.getSalaryEmp1());
		exp.add(work);

		work = new Employment();			
		if (applicationTable.getFrmDt2()!=null){	

			String date[] = applicationTable.getFrmDt2().split("-");
			if (date.length>1){
			work.setWeFromMonth(date[0]);
			work.setWeFromYear(date[1]);
			}

		}	
		if (applicationTable.getToDt2()!=null){	

			String date[] = applicationTable.getToDt2().split("-");
			if (date.length>1){
			work.setWeToMonth(date[0]);
			work.setWeToYear(date[1]);
			}
		}

		work.setTotalMonths(applicationTable.getNumMnths2());
		work.setCmpName(applicationTable.getNameEmp2());
		//applicationTable.setAddrEmp1(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
		work.setDesignation(applicationTable.getDesigEmp2());
		work.setRoles(applicationTable.getRoleEmp2());
		work.setCtc(applicationTable.getSalaryEmp2());	
		exp.add(work);	

		work = new Employment();			
		if (applicationTable.getFrmDt3()!=null){	

			String date[] = applicationTable.getFrmDt3().split("-");
			if (date.length>1){
			work.setWeFromMonth(date[0]);
			work.setWeFromYear(date[1]);
			}

		}	
		if (applicationTable.getToDt3()!=null){	

			String date[] = applicationTable.getToDt3().split("-");
			if (date.length>1){
			work.setWeToMonth(date[0]);
			work.setWeToYear(date[1]);
			}
		}

		work.setTotalMonths(applicationTable.getNumMnths3());
		work.setCmpName(applicationTable.getNameEmp3());
		//applicationTable.setAddrEmp1(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
		work.setDesignation(applicationTable.getDesigEmp3());
		work.setRoles(applicationTable.getRoleEmp3());
		work.setCtc(applicationTable.getSalaryEmp3());	
		exp.add(work);					
		AdditionalInfo  additionalInfo =  new AdditionalInfo();

		appl.setAdditionalInfo(additionalInfo);
		if (applicationTable.getTerms() !=null && applicationTable.getTerms().equals("A")){
			additionalInfo.setDecleration("1");

		}
		Activity activity = new Activity();
		activity.setType(applicationTable.getExtAct());
		activity.setDuration(applicationTable.getExtDuration());
		activity.setNature(applicationTable.getExtNature());
		additionalInfo.setActivity(activity);
		additionalInfo.setDescription(applicationTable.getAddInfo());
		additionalInfo.setPref1(applicationTable.getPref1());
		additionalInfo.setPref2(applicationTable.getPref2());
		
		String addSrc = applicationTable.getAdd_src();
		List<String> addList = new ArrayList<String>();
		if (addSrc!=null){
		String addSrcA[] = addSrc.split(",");
				if (addSrcA.length>1){
				
					for (String add : addSrcA){
						addList.add(add);
					}
				}
		}
		additionalInfo.setSrcTags(addList);
		
		appl.setTranId(applicationTable.getTran_id());
		
		appl.setAcceptedDate(DateUtil.formatToUIDate(applicationTable.getDtCheck()));
		appl.setPageNo(String.valueOf(applicationTable.getPageNo()));



	}

	public String uploadImage(Application appl, String imageType) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );	
		entitymanager.getTransaction( ).begin( );
		String returnString ="";
		Tbltemp applicationTable =null;
		if (appl.getApp_rw_id()!=null && !appl.getApp_rw_id().equals("NULL")){
			applicationTable = entitymanager.find(Tbltemp.class, Integer.parseInt(appl.getApp_rw_id()));	
		}else{
			Query query  = entitymanager.createQuery("SELECT c FROM Tbltemp c  WHERE  c.email ='" +appl.getPersonalInfo().getEmailId()+"' "  );
			List<Tbltemp> resultsApp = query.getResultList();
			if (resultsApp!=null && resultsApp.size()>0){
				applicationTable = 	 resultsApp.get(0);
			}
		}

		if (imageType!=null && imageType.equalsIgnoreCase("scoreCard")){
			applicationTable.setGmatScorecard(appl.getPersonalInfo().getPhoto());
			applicationTable.setGmatReg("viewcard");
			if (appl.getPersonalInfo().getPhoto()!=null){
				applicationTable.setGmatsize(String.valueOf(appl.getPersonalInfo().getPhoto().length));
			}
			
			
		}else{
			applicationTable.setPhotograph(appl.getPersonalInfo().getPhoto());
			if (appl.getPersonalInfo().getPhoto()!=null){
				applicationTable.setPhotosize(appl.getPersonalInfo().getPhoto().length);
				applicationTable.setPhototype(appl.getPersonalInfo().getPhotoType());
			}
		}

		entitymanager.merge(applicationTable) ;
		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );

		return returnString;


	}

	public PersonalInfo  retriveImage(String emailId ,String appRowdId,  String imageType) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );	
		entitymanager.getTransaction( ).begin( );
	
		Tbltemp applicationTable =null;
		if (appRowdId!=null && !appRowdId.equals("NULL")){
			applicationTable = entitymanager.find(Tbltemp.class, Integer.parseInt(appRowdId));	
		}else{
			Query query  = entitymanager.createQuery("SELECT c FROM Tbltemp c  WHERE  c.email ='" +emailId+"' "  );
			List<Tbltemp> resultsApp = query.getResultList();
			if (resultsApp!=null && resultsApp.size()>0){
				applicationTable = 	 resultsApp.get(0);
			}
		}
		PersonalInfo personalInfo = new PersonalInfo();
		if (imageType!=null && imageType.equals("scoreCard")){
			personalInfo.setPhoto(applicationTable.getGmatScorecard());
		}else{
			personalInfo.setPhoto(applicationTable.getPhotograph());
				
		}
		
		personalInfo.setPhotoType(applicationTable.getPhototype());

		entitymanager.getTransaction( ).commit( );
		entitymanager.close( );
		emfactory.close( );

		return personalInfo;


	}
	public String saveApplication(Application appl,  boolean create) {

		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "AiimDB" );
		EntityManager entitymanager = emfactory.createEntityManager( );	
		entitymanager.getTransaction( ).begin( );
		Tbltemp applicationTable =null;
		if (create){
			applicationTable = new Tbltemp();
		}else{

			if (appl.getApp_rw_id()!=null && !appl.getApp_rw_id().equals("NULL")){

				applicationTable = entitymanager.find(Tbltemp.class, Integer.parseInt(appl.getApp_rw_id()));	

			}else{
				Query query  = entitymanager.createQuery("SELECT c FROM Tbltemp c  WHERE  c.email ='" +appl.getPersonalInfo().getEmailId()+"' "  );
				List<Tbltemp> resultsApp = query.getResultList();
				if (resultsApp!=null && resultsApp.size()>0){
					applicationTable = 	 resultsApp.get(0);

				}
			}

		}



		//Personal Info 
		applicationTable.setFirstName(appl.getPersonalInfo().getFName());
		applicationTable.setLastName(appl.getPersonalInfo().getLName());
		applicationTable.setMiddleName(appl.getPersonalInfo().getMName());
		applicationTable.setDateOfBirth(DateUtil.formatToDBDate(appl.getPersonalInfo().getDob()));
		applicationTable.setNationality("99");
		applicationTable.setCategory(appl.getPersonalInfo().getCategory());
		applicationTable.setEmail(appl.getPersonalInfo().getEmailId());
		applicationTable.setSex(appl.getPersonalInfo().getGender());
		applicationTable.setPhoneMobile(appl.getPersonalInfo().getMobileNumber());

		if (appl.getPersonalInfo().getMaritalStatus()!=null){
			applicationTable.setMaritalStatus(Integer.parseInt(appl.getPersonalInfo().getMaritalStatus()));
		}


		

		applicationTable.setMailingAddr(appl.getPersonalInfo().getAd1() +", "+appl.getPersonalInfo().getAd2() +", "+ appl.getPersonalInfo().getCity() +", "+ appl.getPersonalInfo().getCountry()+", "+ appl.getPersonalInfo().getPincode());

		if (appl.getPersonalInfo().getStdCode() !=null && appl.getPersonalInfo().getNumber()!=null){
			applicationTable.setPhoneHome(appl.getPersonalInfo().getStdCode() + "-" + appl.getPersonalInfo().getNumber());
		}else{
			applicationTable.setPhoneHome(appl.getPersonalInfo().getNumber());
		}

		applicationTable.setAddress1(appl.getPersonalInfo().getAd1());
		applicationTable.setAddress2(appl.getPersonalInfo().getAd2());
		applicationTable.setCountry(appl.getPersonalInfo().getCountry());
		applicationTable.setPincode(appl.getPersonalInfo().getPincode());
		applicationTable.setState(appl.getPersonalInfo().getState());
		applicationTable.setCity(appl.getPersonalInfo().getCity());


		List<Language>  languages = appl.getPersonalInfo().getLanguages(); 
		int i=0;
		for (Language language :  languages){
			if (language != null && language.getValue()!=""){
				if (i==0){
					applicationTable.setLang1(language.getValue()) ;
				}else if (i==1){
					applicationTable.setLang2(language.getValue()) ;
				}else if (i==2){
					applicationTable.setLang3(language.getValue()) ;
				}else if (i==3){
					applicationTable.setLang4(language.getValue()) ;
				}else if (i==4){
					applicationTable.setLang5(language.getValue()) ;
				}
				i =i+1;

			}  
		}

		if (appl.getEductionalInfo()!=null){
			//Eduction Details Info 10th 
			School school = appl.getEductionalInfo().getSchool();
			if (school!=null){
				applicationTable.setSchool10(school.getSchoolName());
				applicationTable.setSchool10ClassDiv(school.getStdDivision());
				if (school.getPassingMonth()!=null &&  school.getPassingYear()!=null ){
					applicationTable.setSchool10Passing(school.getPassingMonth() + "-" + school.getPassingYear() );
				}
				if (school.getPercentage()!=null){
					applicationTable.setSchool10Percentage(school.getPercentage());
				}
			}
			//Eduction Details Info 12th 
			Highschool highSchool = appl.getEductionalInfo().getHighschool();	
			if (highSchool!=null){	
				applicationTable.setSchool12(highSchool.getSchoolName());
				applicationTable.setSchool12Major1(highSchool.getStreamName());

				applicationTable.setSchool12ClassDiv(highSchool.getStd12Division());
				if (highSchool.getPassingMonth()!=null &&  highSchool.getPassingYear()!=null ){
					applicationTable.setSchool12Passing(highSchool.getPassingMonth() +"-"+ highSchool.getPassingYear());
				}
				if (highSchool.getStd12Percentage()!=null){
					applicationTable.setSchool12Percentage(highSchool.getStd12Percentage());
				}
			}

			Gd graduate = appl.getEductionalInfo().getGd();
			if (graduate!=null && graduate.getObtained()!=null){
				//Eduction Details Info Bachelors
				applicationTable.setBachDeg1(graduate.getObtained());
				applicationTable.setBachSub1(graduate.getSubject());
				applicationTable.setBachCollege1(graduate.getCollege());
				applicationTable.setBachUniv1(graduate.getUniversity());
				if (graduate.getFromMonth() !=null && graduate.getFromYear()!=null){	
					applicationTable.setBachFrm11(graduate.getFromMonth() +"-"+ graduate.getFromYear());
				}
				applicationTable.setBachMarks11(graduate.getMarks());
				applicationTable.setBachMaxMarks11(graduate.getMaxmarks());
				applicationTable.setBachLetGrade1(graduate.getDivision());
				if (graduate.getToMonth() !=null && graduate.getToYear() !=null){	
					applicationTable.setBachTo11(graduate.getToMonth() +"-" + graduate.getToYear() );
				}
			}
			//List of Addition grads  -Start 

			List <Gd> addGrads = appl.getEductionalInfo().getGdAdd();

			if (addGrads!=null && !addGrads.isEmpty()){

				for (int index=0 ; index< addGrads.size(); index ++ ){
					Gd gd = addGrads.get(index);
					if (index == 0){
						applicationTable.setBachDeg2(gd.getObtained());
						applicationTable.setBachSub2(gd.getSubject());
						applicationTable.setBachCollege2(gd.getCollege());
						applicationTable.setBachUniv2(gd.getUniversity());
						if (gd.getFromMonth() !=null && gd.getFromYear()!=null){	
							applicationTable.setBachFrm21(gd.getFromMonth() +"-"+ gd.getFromYear());
						}
						applicationTable.setBachMarks21(gd.getMarks());
						applicationTable.setBachMaxMarks21(gd.getMaxmarks());
						applicationTable.setBachLetGrade2(gd.getDivision());
						if (gd.getToMonth() !=null && gd.getToYear() !=null){	
							applicationTable.setBachTo21(gd.getToMonth() +"-" + gd.getToYear() );
						}
					}
					if (index == 1){
						applicationTable.setBachDeg3(gd.getObtained());
						applicationTable.setBachSub3(gd.getSubject());
						applicationTable.setBachCollege3(gd.getCollege());
						applicationTable.setBachUniv3(gd.getUniversity());
						if (gd.getFromMonth() !=null && gd.getFromYear()!=null){	
							applicationTable.setBachFrm31(gd.getFromMonth() +"-"+ gd.getFromYear());
						}
						applicationTable.setBachMarks31(gd.getMarks());
						applicationTable.setBachMaxMarks31(gd.getMaxmarks());
						applicationTable.setBachLetGrade3(gd.getDivision());
						if (gd.getToMonth() !=null && gd.getToYear() !=null){	
							applicationTable.setBachTo31(gd.getToMonth() +"-" + gd.getToYear() );
						}
					}
				}
			}
			//List of Addition grads  -End 
			//List of Addition pg  -Start 
			Pg pg = appl.getEductionalInfo().getPg();
			if (pg!=null ){
				//Eduction Details Info Bachelors
				applicationTable.setMstrDeg1(pg.getObtained());
				applicationTable.setMstrSub1(pg.getSubject());
				applicationTable.setMstrCollege1(pg.getCollege());
				applicationTable.setMstrUniv1(pg.getUniversity());
				applicationTable.setMstrMarks11(pg.getMaxmarks());
				if (pg.getFromMonth()!=null && pg.getFromYear()!=null){	
					applicationTable.setMstrFrm11(pg.getFromMonth()+"-"+pg.getFromYear());
				}
				applicationTable.setMstrMarks11(pg.getMarks());
				applicationTable.setMstrLetGrade1(pg.getDivision());
				if (pg.getToMonth()!=null &&pg.getToYear()!=null){	
					applicationTable.setMstrTo11(pg.getToMonth()+"-"+pg.getToYear());
				}
			}

			List <Pg> addpgs = appl.getEductionalInfo().getPgAdd();
			if (addpgs!=null && !addpgs.isEmpty()){
				for (int index=0 ; index< addpgs.size(); index ++ ){
					Pg pgA = addpgs.get(index);
					if (index == 0){
						applicationTable.setMstrDeg2(pgA.getObtained());
						applicationTable.setMstrSub2(pgA.getSubject());
						applicationTable.setMstrCollege2(pgA.getCollege());
						applicationTable.setMstrUniv2(pgA.getUniversity());
						applicationTable.setMstrMarks21(pgA.getMaxmarks());
						if (pg.getFromMonth()!=null && pgA.getFromYear()!=null){	
							applicationTable.setMstrFrm21(pgA.getFromMonth()+"-"+pgA.getFromYear());
						}
						applicationTable.setMstrMarks21(pgA.getMarks());
						applicationTable.setMstrLetGrade2(pgA.getDivision());
						if (pgA.getToMonth()!=null &&pgA.getToYear()!=null){	
							applicationTable.setMstrTo21(pgA.getToMonth()+"-"+pgA.getToYear());
						}
					}
					if (index == 1){
						applicationTable.setMstrDeg3(pgA.getObtained());
						applicationTable.setMstrSub3(pgA.getSubject());
						applicationTable.setMstrCollege3(pgA.getCollege());
						applicationTable.setMstrUniv3(pgA.getUniversity());
						applicationTable.setMstrMarks31(pgA.getMaxmarks());
						if (pg.getFromMonth()!=null && pgA.getFromYear()!=null){	
							applicationTable.setMstrFrm31(pgA.getFromMonth()+"-"+pgA.getFromYear());
						}
						applicationTable.setMstrMarks31(pgA.getMarks());
						applicationTable.setMstrLetGrade3(pgA.getDivision());
						if (pgA.getToMonth()!=null &&pgA.getToYear()!=null){	
							applicationTable.setMstrTo31(pgA.getToMonth()+"-"+pgA.getToYear());
						}
					}
				}
			}
			//List of Addition pg  -End 
			Pq pq = appl.getEductionalInfo().getPq();

			if (pq!=null ){
				applicationTable.setProfDeg1(pq.getObtained());
				applicationTable.setProfInst1(pg.getCollege());
				applicationTable.setProfMarks1(pq.getMarks());
				if (pq.getFrom_month()!=null && pq.getFrom_year() !=null){
					applicationTable.setProfMnth1(pq.getFrom_month()+"-"+pq.getFrom_year());
				}
				applicationTable.setProfPcnt1(pq.getDivision());
			}


			List<Pq> pqAdList = appl.getEductionalInfo().getPqAdd();
			if (pqAdList!=null && !pqAdList.isEmpty()){
				for (int index =0 ; index < pqAdList.size() ; index++){
					pq =pqAdList.get(index); 
					if (index ==0){
						applicationTable.setProfDeg2(pq.getObtained());
						applicationTable.setProfInst2(pg.getCollege());
						applicationTable.setProfMarks2(pq.getMarks());
						if (pq.getFrom_month()!=null && pq.getFrom_year() !=null){
							applicationTable.setProfMnth2(pq.getFrom_month()+"-"+pq.getFrom_year());
						}
						applicationTable.setProfPcnt2(pq.getDivision());

					}else if (index ==1){
						applicationTable.setProfDeg3(pq.getObtained());
						applicationTable.setProfInst3(pg.getCollege());
						applicationTable.setProfMarks3(pq.getMarks());
						if (pq.getFrom_month()!=null && pq.getFrom_year() !=null){
							applicationTable.setProfMnth3(pq.getFrom_month()+"-"+pq.getFrom_year());
						}
						applicationTable.setProfPcnt3(pq.getDivision());

					}
				}
			}





			EductionalInfo eduInfo = appl.getEductionalInfo();
			AdmissionTest admisTest =eduInfo.getAdmissionTest();
			if (admisTest!=null){
				applicationTable.setAdmissiontest(admisTest.getAdmTestName());
				applicationTable.setAdmissiontestdate(admisTest.getDoe());
				applicationTable.setRegister_no(admisTest.getRegnumber());
				applicationTable.setScore(admisTest.getAdmScore());
				applicationTable.setPecentile(admisTest.getAdmPercentage());
			}
			//Work Experience 

		}


		WorkInfo workDetails  = appl.getWorkInfo();

		if (appl.getWorkInfo()!=null){
			applicationTable.setTotExp(workDetails.getTotalWexp());


			List<Employment> exp =  workDetails.getExperience();

			if (exp !=null && !exp.isEmpty()){

				for (int indx =0 ;indx<exp.size();indx++ ){

					Employment work =  exp.get(indx);

					if (indx == 0){
						if (work.getWeFromMonth()!=null && work.getWeFromYear()!=null){	
							applicationTable.setFrmDt1(work.getWeFromMonth() +"-"+ work.getWeFromYear());
						}
						if (work.getWeToMonth()!=null && work.getWeToYear()!=null){	
							applicationTable.setToDt1(work.getWeToMonth() +"-"+work.getWeToYear() );
						}
						applicationTable.setNumMnths1(work.getTotalMonths());
						applicationTable.setNameEmp1(work.getCmpName());
						applicationTable.setAddrEmp1(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
						applicationTable.setDesigEmp1(work.getDesignation());
						applicationTable.setRoleEmp1(work.getRoles());
						applicationTable.setSalaryEmp1(work.getCtc());
					}else if (indx == 1){
						if (work.getWeFromMonth()!=null && work.getWeFromYear()!=null){	
							applicationTable.setFrmDt2(work.getWeFromMonth() +"-"+ work.getWeFromYear());
						}
						if (work.getWeToMonth()!=null && work.getWeToYear()!=null){	
							applicationTable.setToDt2(work.getWeToMonth() +"-"+work.getWeToYear() );
						}
						applicationTable.setNumMnths2(work.getTotalMonths());
						applicationTable.setNameEmp2(work.getCmpName());
						applicationTable.setAddrEmp2(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
						applicationTable.setDesigEmp2(work.getDesignation());
						applicationTable.setRoleEmp2(work.getRoles());
						applicationTable.setSalaryEmp2(work.getCtc());
					}else{

						if (work.getWeFromMonth()!=null && work.getWeFromYear()!=null){	
							applicationTable.setFrmDt3(work.getWeFromMonth() +"-"+ work.getWeFromYear());
						}
						if (work.getWeToMonth()!=null && work.getWeToYear()!=null){	
							applicationTable.setToDt3(work.getWeToMonth() +"-"+work.getWeToYear() );
						}
						applicationTable.setNumMnths3(work.getTotalMonths());
						applicationTable.setNameEmp3(work.getCmpName());
						applicationTable.setAddrEmp3(work.getCmpAd1() +", " +work.getCmpAd2() +", "+work.getCmpCity()+ "," + work.getCmpState() +", " + work.getCmpPinCode());
						applicationTable.setDesigEmp3(work.getDesignation());
						applicationTable.setRoleEmp3(work.getRoles());
						applicationTable.setSalaryEmp2(work.getCtc());

					}

				}

			}
		}



		AdditionalInfo  additionalInfo =  appl.getAdditionalInfo();
		if (additionalInfo!=null){
			String declaration = additionalInfo.getDecleration();
			if (declaration!=null && declaration.equals("1")){
				applicationTable.setTerms("A");
				Date date = new Date();
				Timestamp timestamp = new Timestamp(date.getTime());
				applicationTable.setDtCheck(new Date());
				applicationTable.setPageNo(7);
				applicationTable.setLevel(2);
				applicationTable.setCycleNo("1");

			}
			if (additionalInfo.getActivity()!=null){
				applicationTable.setExtAct(additionalInfo.getActivity().getType());
				applicationTable.setExtDuration(additionalInfo.getActivity().getDuration());
				applicationTable.setExtNature(additionalInfo.getActivity().getNature());
			}
			applicationTable.setAddInfo(additionalInfo.getDescription());
			applicationTable.setPref1(additionalInfo.getPref1());
			applicationTable.setPref2(additionalInfo.getPref2());
			List<String>srcTags = additionalInfo.getSrcTags();
			
			if (srcTags!=null && !srcTags.isEmpty()){
				  StringBuilder commaBuilder = new StringBuilder();
				for (String tag :srcTags ){
					commaBuilder.append(tag +",");
				}
				applicationTable.setAdd_src(commaBuilder.toString());
			}
		}
		if (appl.getPageNo()!=null){
			applicationTable.setPageNo(Integer.parseInt(appl.getPageNo()));
		}



		String returnString ="";
		if (create){
			
			applicationTable.setRegno(appl.getPersonalInfo().getRegno());
			entitymanager.persist(applicationTable);
			entitymanager.getTransaction( ).commit( );
			System.out.println("Application table record created for the new user " + applicationTable.getId());


			Query query = entitymanager.createNativeQuery("SELECT id FROM tbltemp app  WHERE app.email ='"+applicationTable.getEmail()+"'" );
			List<String> results = query.getResultList();
			String regNo = null;
			if (results!=null && results.size()>0){
				returnString =String.valueOf(results.get(0));
			}	
		}else{
			entitymanager.merge(applicationTable) ;
			entitymanager.getTransaction( ).commit( );
		}

		entitymanager.close( );
		emfactory.close( );

		return returnString;


	}



}
