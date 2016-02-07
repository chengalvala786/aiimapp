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
		String subject = "Welcome to Adani Institute of Infrastructure Management";
		Properties props = new Properties();
		boolean isAuthenticationRequire = false;
		props.put("mail.smtp.ehlo", "false");
		props.put("mail.smtp.auth", isAuthenticationRequire);
		props.put("mail.smtp.starttls.enable", "false");
		String body=  "<p> Dear " +user.getFName()  + "  " + user.getLName()+ "</p>";
		body =  body + "<p> &nbsp; </p>";	
		body = body+ "<p>Thank you for your interest in PGDM in Infrastructure Management Programme at Adani Institute of Infrastructure Management.</p>"; 
		body = body+ "<p>Please <a href='http://www.aiim.ac.in/AiimEduApp/confirm?key=" + actKey+ "'>click here</a>  to activate your registration and complete online application.</p>"; 
		body = body+"<p> Please feel free to get in touch with Admission office in case you have any questions or clarifications about the programme and/or application process. </p>";
		body =body + "<p>With best wishes,</p>";
		body = body+ "<p>From the Admission office</p>";
		body = body+ "<p>Admission Committee</p>";
		//body = + "Business Head-Industry Relations <br />";
		body =body + "Adani Institute of Infrastructure Management<br />";
		body =body + "Phone: +91 &#45; 79 &#45;2555 6592<br />";
		body =body + "Mobile: +91 &#45;90990 55650<br />";
		body =body + "Email: <a href=mailto:' admissions@aiim.ac.in'>admissions@aiim.ac.in</a>";
		
		String sender = "Administrator";
		String sender_mail = "admissions@aiim.ac.in";
		final String host = "117.240.210.234";
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
			message.setFrom(new InternetAddress(sender_mail , sender));
			message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(user.getEmailId()));
			message.setSubject(subject);
			message.setContent(body, "text/html");
			System.out.println(body);
			Transport transport = session.getTransport("smtp");	
			transport.send(message);
			System.out.println("Message Sent");
			
			
		} catch (MessagingException e) {
			System.out.println("===================================== mail send error");
			System.out.println(e.getMessage());
			System.out.println("===================================== mail send error");
			e.printStackTrace();
			
		
		}
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		System.err.println("Error sending email" + e.getMessage());
		
	}
	
	return "";
	
}

}
