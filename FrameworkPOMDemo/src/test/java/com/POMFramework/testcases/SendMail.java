package com.POMFramework.testcases;

import java.util.Properties;

import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;

public class SendMail {
	public static void main(String[] args) {
		

		// Create object of Property file
		Properties props = new Properties();
 
		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");
 
		// set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");
 
		// set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
 
		// set the authentication to true
		props.put("mail.smtp.auth", "true");
 
		// set the port of SMTP server
		props.put("mail.smtp.port", "465");
 
		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,
 
				new javax.mail.Authenticator() {
 
					protected PasswordAuthentication getPasswordAuthentication() {
 
					return new PasswordAuthentication("add your email", "add your password");
 
					}
 
				});
 
		try {
 
			// Create object of MimeMessage class
			Message message = new MimeMessage(session);
 
			// Set the from address
			message.setFrom(new InternetAddress("snehlu.agrawal@gmail.com"));
 
			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("snehlu.agrawal@gmail.com"));
            
                        // Add the subject link
			message.setSubject("Testing Subject");
 
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
 
			// Set the body of email
			messageBodyPart1.setText("This is message body");
 
			// finally send the email
			Transport.send(message);
 
			System.out.println("=====Email Sent=====");
		 
				} catch (MessagingException e) {
		 
					throw new RuntimeException(e);
		 
				}

}
}
