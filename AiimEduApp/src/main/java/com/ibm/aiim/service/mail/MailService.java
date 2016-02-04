package com.ibm.aiim.service.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import com.ibm.aiim.ui.model.PersonalInfo;

public class MailService {

public static String sendMail(PersonalInfo user, String actKey){
	
	try {
		
		
		// Recipient's email ID needs to be mentioned.
	      String to = "arvindsrinivas786@gmail.com";

	      // Sender's email ID needs to be mentioned
	      String from = "admissions@aiim.ac.in";

	      // Assuming you are sending email from localhost
	      String host = "mail.adani.com";

	      // Get system properties
	      Properties properties = System.getProperties();

	      // Setup mail server
	      properties.setProperty("mail.smtp.host", host);
	      properties.put("mail.smtp.port", "25");

	      // Get the default Session object.
	      Session session = Session.getDefaultInstance(properties);

	      try{
	         // Create a default MimeMessage object.
	         MimeMessage message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	         // Set Subject: header field
	         message.setSubject("This is the Subject Line!");

	         // Now set the actual message
	         message.setText("This is actual message");

	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully...$Arvind.");
	      }catch (MessagingException mex) {
	    	  System.out.println("++++++++++++++++++++++ "+mex.getMessage());
	         mex.printStackTrace();
	      }
		
		
		
		
		/*String subject = "Welcome to Adani Institute of Infrastructure Management";
	
		Properties props = new Properties();
		boolean isAuthenticationRequire = true;
		props.put("mail.smtp.ehlo", "false");
		props.put("mail.smtp.auth", isAuthenticationRequire);
		props.put("mail.smtp.starttls.enable", "false");
		String body=  "<p> Dear " +user.getFName()  + "  " + user.getLName()+ "</p>";
		body =  body + "<p> &nbsp; </p>";
		body = body+ "<p>Thank you for your online registration and interest in attending PGDM in Infrastructure Management Program at Adani Institute of Infrastructure Management.</p>"; 
		body = body+ "<p>Please click on the link below to activate your registration to complete online application.</p>"; 
		body = body+ "<p>Please <a href='http://www.aiim.ac.in/AiimEduApp/confirm?key= " + actKey+ "'>click here</a> to complete your registration.</p>";
		body = body+"<p>Please let us know if you have any questions about our programs and application process. </p>";
		body =body + "<p>With best wishes,</p>";
		body = body+ "<p>From the Admission office</p>";
		body = body+ "<p>Admission Committee</p>";
		//body = + "Business Head-Industry Relations <br />";
		body =body + "Adani Institute of Infrastructure Management Ahmedabad<br />";
		body =body + "Phone: +91 – 79 –2555 6153/2555 6592 (O), 90990 55650/ +91 –9825079646 (Mobile)<br />";
		body =body + "Email: <a href=mailto:' admissions@aiim.ac.in'>admissions@aiim.ac.in</a>";
		String sender = "Administrator";
		String sender_mail = "admissions@aiim.ac.in";
		
		final String host = "mail.adani.com";
		if ( host.equals("in") ) {
			host = "mail1.adani.in";
		}
		else{
			host = "mail.adani.com" ; //getServletConfig().getInitParameter("smtp.host");
		}
		props.put("mail.smtp.host", host);
		props.put("mail.smtp.port", "25");
		props.put("mail.debug", true);
 
		
		Session session;
		
		if ( isAuthenticationRequire ) {
			session = Session.getInstance(props,
					new javax.mail.Authenticator() {
						protected PasswordAuthentication getPasswordAuthentication() {
							return new PasswordAuthentication("generic.aiim@adani.com", "password");
						}
					});
		}	
		else{
			session = Session.getInstance(props);
		}
		
		System.out.println("Session Created");
		try {
			Message message = new MimeMessage(session);
			message.setFrom(new InternetAddress("generic.aiim@adani.com"));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmailId()));
			message.setSubject(subject);
			message.setText(body);
				System.out.println();
			Transport transport = session.getTransport("smtp");	
			transport.send(message);
			System.out.println("Message Sent");
			
			
		} catch (MessagingException e) {
			System.out.println("===================================== mail send error");
			System.out.println(e.getMessage());
			System.out.println("===================================== mail send error");
			e.printStackTrace();
			
		
		}
		
		*/
		
		
		
		
		
		
		
		
		
		
		
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("Error sending email" + e.getMessage());
		
	}
	
	return "";
	
}


public static void main(String[] args) {
	PersonalInfo user = new PersonalInfo();
	
	user.setFName("Aravind");
	user.setLName("Chen");
	user.setEmailId("arvindsrinivas786@gmail.com");
	
	
	sendMail( user, "test");
}


}
