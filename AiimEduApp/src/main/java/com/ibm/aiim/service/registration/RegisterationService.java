package com.ibm.aiim.service.registration;

import java.util.List;

import com.ibm.aiim.db.model.Tbltemp;
import com.ibm.aiim.payment.model.Transaction;
import com.ibm.aiim.ui.model.Application;
import com.ibm.aiim.ui.model.PersonalInfo;



public interface RegisterationService {
	
	
	String saveApplication(Application appl , boolean create);
	
	boolean saveTransaction(Transaction tran);
	
	void retriveApplication(Application appl, Tbltemp applicationTable );
	
	String uploadImage(Application appl  , String imageType);
	
	Application retAppByHash(String hashKey);
	
	PersonalInfo retriveImage(String emailId, String rowId , String imageType );
	
	List<Application> retAllCmplApps(String status , String emailId, String startDate, String endDate);
	
	
	
}
