
package com.ibm.aiim.controllers;

import java.io.IOException;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.util.UriComponentsBuilder;

import com.ibm.aiim.payment.model.MMP;
import com.ibm.aiim.payment.model.Transaction;
import com.ibm.aiim.service.captcha.CaptchaService;
import com.ibm.aiim.service.payment.PaymentService;
import com.ibm.aiim.service.registration.RegisterationService;
import com.ibm.aiim.service.user.UserService;
import com.ibm.aiim.ui.model.Application;
import com.ibm.aiim.ui.model.PersonalInfo;

@RestController
public class AiimRestController {

	@Autowired
	RegisterationService regService;  //Service which will do all data retrieval/manipulation work
	@Autowired
	UserService userService;


	//-------------------Create a Application--------------------------------------------------------
	@RequestMapping(value = "/register", method = RequestMethod.POST)

	public ResponseEntity<Void> createApplication(@RequestBody Application application,    UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + application.getPersonalInfo().getFName());
		regService.saveApplication(application ,false);
		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	//-------------------Create a USer--------------------------------------------------------

	@RequestMapping(value = "/createUser", method = RequestMethod.POST)
	public ResponseEntity<Void> createUser(@RequestBody PersonalInfo user,    UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + user.getFName());
		userService.saveUser(user);
		if (userService.isUserExist(user)) {
			System.out.println("A User with name " + user.getEmailId() + " already exist");
			return new ResponseEntity<Void>(HttpStatus.CONFLICT);
		}

		// userService.saveUser(user);

		HttpHeaders headers = new HttpHeaders();
		// headers.setLocation(ucBuilder.path("/user/{id}").buildAndExpand(user.getId()).toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
	}

	//-------------------Create a USer--------------------------------------------------------

	@RequestMapping(value = "/reqPswdReset", method = RequestMethod.POST)
	public void passwordReset(@RequestBody PersonalInfo user,    UriComponentsBuilder ucBuilder, HttpServletResponse response) {
		try {
			System.out.println("Password Reset Request for email  " + user.getEmailId());
			userService.resetRequest(user);
			MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
			params.add("as", "T");
			response.sendRedirect("/AiimEduApp/#/?as=T" );
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	//-------------------Get All the Users--------------------------------------------------------

	//-------------------Retrieve All Users--------------------------------------------------------

	@RequestMapping(value = "/listAllUsers", method = RequestMethod.GET)
	public ResponseEntity<List<PersonalInfo>> listAllUsers() {
		List<PersonalInfo> users= userService.findAllUsers();
		if(users.isEmpty()){
			return new ResponseEntity<List<PersonalInfo>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<PersonalInfo>>(users, HttpStatus.OK);
	}
	//-------------------Retrieve All Completed Applications Users--------------------------------------------------------

	@RequestMapping(value = "/listCompltedApps", method = RequestMethod.GET)
	public ResponseEntity<List<Application>> listCompltedApps(@RequestParam(name = "status" ,required = false) String status, @RequestParam(name = "emailId" ,required = false ) String emailId,  @RequestParam(name = "starDate" ,required = false) String starDate,@RequestParam(name = "endDate" ,required = false) String endDate  ) {
		List<Application> appls= regService.retAllCmplApps(status,emailId ,starDate , endDate);
		if(appls.isEmpty()){
			return new ResponseEntity<List<Application>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
		}
		return new ResponseEntity<List<Application>>(appls, HttpStatus.OK);
	}


	@RequestMapping(value = "/validateCapcha", method = RequestMethod.POST)
	public void validateCapcha(@RequestParam(name = "response" ,required = false) String recaptchaResponse, HttpServletResponse response  ) throws IOException {
		String output= CaptchaService.validateCaptcha(recaptchaResponse);
		response.setContentType("application/json");
		response.setContentLength( output.length());
		response.setStatus(HttpServletResponse.SC_OK);

		response.getWriter().write(output);
		response.getWriter().flush();
		response.getWriter().close();

	}	


	//-------------------Create a Application--------------------------------------------------------

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<Application> login(@RequestBody PersonalInfo user,    UriComponentsBuilder ucBuilder) {
		System.out.println("Creating User " + user.getFName());
		Application userResponse = userService.login(user);
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<Application>(userResponse, HttpStatus.OK);
	}


	//------------------- Activate User --------------------------------------------------------

	@RequestMapping(value = "/confirm", method = RequestMethod.GET)
	public void  updateUser(@RequestParam(name = "key" ,required = false) String id, UriComponentsBuilder ucBuilder, HttpServletResponse response) throws IOException {
		System.out.println("Updating User " + id);

		boolean actStatus = userService.activateId(id);

		if (!actStatus) {
			System.out.println("ACT Key with id " + id + " not found");

		}else{
			System.out.println("ACT Key with id " + id + " Activated");

		}
		HttpHeaders headers = new HttpHeaders();
		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("as", "T");

		response.sendRedirect("/AiimEduApp/#/?as=T" );




	}




	@RequestMapping(value="/upload", method=RequestMethod.POST)
	public @ResponseBody String handleFileUpload(@RequestParam("email") String email,@RequestParam("rowId") String row_id,@RequestParam(name = "imageType" ,required = false) String imageType,
			@RequestParam("file") MultipartFile file){
		if (!file.isEmpty()) {
			try {
				byte[] bytes = file.getBytes();
				Application  appl = new Application();
				appl.setApp_rw_id(row_id);
				PersonalInfo personalInfo = new PersonalInfo();
				personalInfo.setEmailId(email);
				personalInfo.setPhotoType(file.getContentType());
				personalInfo.setPhoto(bytes);
				appl.setPersonalInfo(personalInfo);
				regService.uploadImage(appl, imageType);
				return "You successfully uploaded " + appl.getPersonalInfo().getEmailId() + "!";
			} catch (Exception e) {
				return "You failed to upload " ;
			}
		} else {
			return "You failed to upload " ;
		}
	}

	@RequestMapping(value = "/getImg" , method=RequestMethod.GET)
	public void getFile(HttpServletRequest request, @RequestParam("email") String email,@RequestParam("rowId") String row_id , @RequestParam(name = "imageType" ,required = false) String imageType , HttpServletResponse response) throws IOException {
		PersonalInfo personalInfo =  regService.retriveImage(email, row_id , imageType);
		if (personalInfo!=null){
			response.setContentType(personalInfo.getPhotoType());
			response.setContentLength((int) personalInfo.getPhoto().length);
			response.setStatus(HttpServletResponse.SC_OK);
			OutputStream os = response.getOutputStream();
			os.write(personalInfo.getPhoto());
		}

	}

	//------------------- Update a User --------------------------------------------------------

	@RequestMapping(value = "/createToken", method = RequestMethod.POST)
	public ResponseEntity<MMP>  createToken(@RequestBody PersonalInfo user , UriComponentsBuilder ucBuilder) {
		System.out.println("Generating Token for email" + user.getEmailId());

		MMP mmp = PaymentService.genToken(user);

		if (mmp!=null && mmp.getMERCHANT()!=null) {
			System.out.println("User " + user.getEmailId() +"MMP TOKEN"+ mmp.getMERCHANT().getRESPONSE().getUrl());

		}
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<MMP>(mmp, HttpStatus.OK);
	}
	//------------------- Update a User --------------------------------------------------------

	@RequestMapping(value = "/createCardToken", method = RequestMethod.POST)
	public ResponseEntity<MMP>  createCardToken(@RequestBody PersonalInfo user , UriComponentsBuilder ucBuilder) {
		System.out.println("Generating Token for email" + user.getEmailId());

		MMP mmp = PaymentService.creditCardToken(user);

		if (mmp!=null && mmp.getMERCHANT()!=null) {
			System.out.println("User " + user.getEmailId() +"MMP TOKEN"+ mmp.getMERCHANT().getRESPONSE().getUrl());

		}
		HttpHeaders headers = new HttpHeaders();
		return new ResponseEntity<MMP>(mmp, HttpStatus.OK);
	}




	@RequestMapping(value = "/saveAndExit", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity<Void> saveAndExit(@RequestBody Application application,  UriComponentsBuilder ucBuilder){	            	

		regService.saveApplication(application ,false);
		HttpHeaders headers = new HttpHeaders();

		headers.setLocation(ucBuilder.path("/").buildAndExpand("").toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.FOUND);
	}

	@RequestMapping(value = "/tranResult", method = RequestMethod.POST )
	@ResponseBody
	public ResponseEntity<Void> tranResult(
			@RequestParam(value="f_code", required=false) String f_code, 
			@RequestParam(value="bank_txn", required=false) String bank_txn, 
			@RequestParam(value="udf2", required=false) String udf2 , UriComponentsBuilder ucBuilder){	            	
		Transaction tranObject = new Transaction();
		tranObject.setF_code(f_code);
		tranObject.setBank_txn(bank_txn);
		tranObject.setUdf2(udf2);
		System.out.println("f_code" + f_code );
		System.out.println("bank_txn" + bank_txn );
		System.out.println("udf2" + udf2 );
		regService.saveTransaction(tranObject);

		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("transactionId", tranObject.getBank_txn());
		params.add("status", "Ok");



		HttpHeaders headers = new HttpHeaders();

		headers.setLocation(ucBuilder.path("/").queryParams(params).buildAndExpand("").toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.FOUND);
	}

	@RequestMapping(value = "/tranResult", method = RequestMethod.GET )
	@ResponseBody
	public ResponseEntity<Void> tranCardResult(
			@RequestParam(value="vpc_SecureHash", required=false) String hashCode, 
			@RequestParam(value="auth_trans_ref_no", required=false) String auth_trans_ref_no, 
			@RequestParam(value="bill_trans_ref_no", required=false) String bill_trans_ref_no ,
			@RequestParam(value="vpc_MerchTxnRef", required=false) String tranRef ,
			@RequestParam(value="req_reference_number", required=false) String req_reference_number ,
			@RequestParam(value="transaction_id", required=false) String transaction_id ,

			@RequestParam(value="message", required=false) String message ,
			@RequestParam(value="auth_time", required=false) String auth_time ,
			UriComponentsBuilder ucBuilder){	            	
		Transaction tranObject = new Transaction();
		Application appl =null; 
		if (StringUtils.isEmpty(tranRef)){
			appl = regService.retAppByHash(req_reference_number);
		}else{
			appl = regService.retAppByHash(tranRef);
		}
		if (StringUtils.isEmpty(auth_trans_ref_no)){
			tranObject.setBank_txn(transaction_id);
		}else{
			tranObject.setBank_txn(auth_trans_ref_no);
		}

		tranObject.setUdf2(appl.getPersonalInfo().getEmailId());

		System.out.println("----Start Card Payment Info---");
		System.out.println("vpc_SecureHash" + hashCode );
		System.out.println("auth_trans_ref_no" + auth_trans_ref_no );
		System.out.println("email id" + appl.getPersonalInfo().getEmailId() );
		System.out.println("message" +message );
		System.out.println("bill_trans_ref_no" + bill_trans_ref_no );
		System.out.println("udf2" + appl.getPersonalInfo().getEmailId() );
		System.out.println("----End Card Payment Info---");

		System.out.println("----Saving Start---");
		regService.saveTransaction(tranObject);
		System.out.println("----Saving End---");

		MultiValueMap<String, String> params = new LinkedMultiValueMap<String, String>();
		params.add("transactionId", tranObject.getBank_txn());
		params.add("status", "Ok");
		HttpHeaders headers = new HttpHeaders();

		headers.setLocation(ucBuilder.path("/").queryParams(params).buildAndExpand("").toUri());
		return new ResponseEntity<Void>(headers, HttpStatus.FOUND);
	}

}