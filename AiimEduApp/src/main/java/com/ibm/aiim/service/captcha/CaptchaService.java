package com.ibm.aiim.service.captcha;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;

import com.ibm.aiim.payment.model.MMP;



public class CaptchaService {
	private static String SECRET_KEY="6LfjqhYTAAAAAA6GLmbBCOTlTJRuI5ybAQBZzYCO";
	private static String  captchaUrl ="https://www.google.com/recaptcha/api/siteverify";
	
 	public static String validateCaptcha(String captchResponse){
 		 
 		StringBuffer result = new StringBuffer();
		
		 
		 
		
	    try
		    {
	    	
	    	
	    	
	    		HttpClient client = new DefaultHttpClient();
	    		HttpPost httppost = new HttpPost(captchaUrl);
	    		ArrayList<NameValuePair> postParameters = new ArrayList<NameValuePair>();
	    	    postParameters.add(new BasicNameValuePair("secret", SECRET_KEY));
	    	    postParameters.add(new BasicNameValuePair("response", captchResponse));

	    	    httppost.setEntity(new UrlEncodedFormEntity(postParameters));
	    		
	    		HttpResponse response = client.execute(httppost);

	    		System.out.println("Response Code : " 
	    	                + response.getStatusLine().getStatusCode());
	    		BufferedReader rd = new BufferedReader(
	    				new InputStreamReader(response.getEntity().getContent()));

	    			 result = new StringBuffer();
	    			String line = "";
	    			while ((line = rd.readLine()) != null) {
	    				result.append(line);
	    			}
		      
		         
		    }catch(Exception e){
		    	e.printStackTrace();
		    }
		    finally
		    {
		        //Important: Close the connect
		        //httpClient.getConnectionManager().shutdown();
		    }
		 
				 
		 return result.toString();
		
	}
	
	
 
	   
	   
	   
	   

}
