package com.ibm.aiim.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	public static String formatToUIDate(Date orgnialDt) {
		String newFormat ="";
		if (orgnialDt!=null ){
			
			String patternFrom = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
			SimpleDateFormat format = new SimpleDateFormat(patternFrom);
			try {
				newFormat = format.format(orgnialDt);
				System.out.println("To UI Format date "+ newFormat);
			

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("newFormat"+ newFormat);
		return newFormat;

	}
	
	public static String formatToPaymentDate(Date orgnialDt) {
		String newFormat ="";
		if (orgnialDt!=null ){
			
			String patternFrom = "MM/dd/yyyy";
			SimpleDateFormat format = new SimpleDateFormat(patternFrom);
			try {
				newFormat = format.format(orgnialDt);
				System.out.println("To UI Format date "+ newFormat);
			

			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		System.out.println("newFormat"+ newFormat);
		return newFormat;

	}
	 public static Date formatToDBDate(String orgnialDt) {
		 	String newFormat ="";
		 	 Date date=null;
		 	if (orgnialDt!=null && orgnialDt.trim()!= ""){
		 		
	 		String patternFrom = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
		    SimpleDateFormat format = new SimpleDateFormat(patternFrom);
		    try {
		       date = format.parse(orgnialDt);
		      
			 	
		    } catch (ParseException e) {
		      e.printStackTrace();
		    }
		 	}
		    System.out.println("newFormat"+ newFormat);
		    return date;
		  
	 }

}

