package com.ibm.aiim.service.payment;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Random;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.ibm.aiim.payment.model.MMP;
import com.ibm.aiim.ui.model.PersonalInfo;
import com.ibm.aiim.util.DateUtil;




public class PaymentService {
	private static String login="14377";
	private static String passWrd="ADANI@123";
	private static String type="NBFundTransfer";
	private static String prodid="ADANI";
	private static String amt="700";
	
 	public static MMP genToken(PersonalInfo user){
 		 String  firstUrl ="https://payment.atomtech.in/paynetz/epi/fts?login=-login-&pass=-pass-&ttype=NBFundTransfer&prodid=-prodid-&amt=-amt-&txncurr=INR&txnscamt=0&clientcode=922&txnid=-txn_id-&date=-date-&custacc=1234567890&udf1=-name-&udf2=-email-&udf3=-mobile-&udf4=-addr-&ru=-return_url-";
		 Date date = new Date();
		 String udf1 =  user.getFName()+user.getLName();
		 String udf2 =  user.getEmailId();
		 String udf3 =  user.getMobileNumber();
		 String udf4 =  user.getAd1()  ;
		 String ru = "http://www.aiim.ac.in/AiimEduApp/tranResult";
		 int randomInt=0;
		 Random randomGenerator = new Random();
		    for (int idx = 1; idx <= 10; ++idx){
		       randomInt = randomGenerator.nextInt(100);
		      ;
		    }
		
		 
		 
		MMP mmp =null;
	    try
		    {
	    	
	    	 firstUrl= firstUrl.replace("-login-", login);
			 firstUrl= firstUrl.replace("-pass-", passWrd);
			 firstUrl= firstUrl.replace("-prodid-", prodid);
			 firstUrl= firstUrl.replace("-amt-", amt);
			 firstUrl= firstUrl.replace("-date-", DateUtil.formatToPaymentDate(date));
			
			 firstUrl= firstUrl.replace("-name-", URLEncoder.encode(udf1, "UTF-8"));
			 
			 firstUrl= firstUrl.replace("-email-", udf2);		 
			 firstUrl= firstUrl.replace("-mobile-", udf3);
			 
			 if(udf4 !=null && !udf4.isEmpty()){
				 firstUrl= firstUrl.replace("-addr-", URLEncoder.encode(udf4, "UTF-8"));;
			 }
			 
			 firstUrl= firstUrl.replace("-return_url-", ru);
			 firstUrl= firstUrl.replace("-txn_id-",String.valueOf(randomInt));
			 
			 System.out.println("firstUrl"+ firstUrl);
	    	
	    		HttpClient client = new DefaultHttpClient();
	    		HttpGet request = new HttpGet(firstUrl);
	    		HttpResponse response = client.execute(request);

	    		System.out.println("Response Code : " 
	    	                + response.getStatusLine().getStatusCode());
	    		BufferedReader rd = new BufferedReader(
	    				new InputStreamReader(response.getEntity().getContent()));

	    			StringBuffer result = new StringBuffer();
	    			String line = "";
	    			while ((line = rd.readLine()) != null) {
	    				result.append(line);
	    			}
		        //Lets see what we got from API
		       // System.out.println(apiOutput); //<user id="10"><firstName>demo</firstName><lastName>user</lastName></user>
		         
		        //In realtime programming, you will need to convert this http response to some java object to re-use it.
		        //Lets see how to jaxb unmarshal the api response content
		        JAXBContext jaxbContext = JAXBContext.newInstance(MMP.class);
		        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
		        mmp = (MMP) jaxbUnmarshaller.unmarshal(new StringReader(result.toString()));
		         
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
		    finally
		    {
		        //Important: Close the connect
		        //httpClient.getConnectionManager().shutdown();
		    }
		 
				 
		 return mmp;
		
	}
	
	
 
	   
	   
	   
	   

}
