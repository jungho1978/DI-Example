package com.jungho.java.legacy;

public class MyApplication {
	private EmailService email = new EmailService();
	
	public void processMessage(String msg, String rec) {
		this.email.sendEmail(msg, rec);
	}
}
