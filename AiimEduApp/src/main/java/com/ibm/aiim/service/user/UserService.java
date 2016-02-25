package com.ibm.aiim.service.user;

import java.util.List;

import com.ibm.aiim.ui.model.Application;
import com.ibm.aiim.ui.model.PersonalInfo;
import com.ibm.aiim.ui.model.User;



public interface UserService {
	
	
	
	PersonalInfo findByEmailId(String name);
	Application login(PersonalInfo user);
	String saveUser(PersonalInfo user);
	
	List<PersonalInfo>  findAllUsers();
	boolean resetRequest(PersonalInfo user);
	
	boolean activateId(String id);
	
	
	
	public boolean isUserExist(PersonalInfo user);
	
}
