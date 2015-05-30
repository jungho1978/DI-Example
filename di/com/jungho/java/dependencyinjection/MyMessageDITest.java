package com.jungho.java.dependencyinjection;

public class MyMessageDITest {
	public static void main(String[] args) {
		String msg = "Hi, How are you?";
		String email = "jungho@abc.com";
		String phone = "01012341234";
		MessageServiceInjector injector = null;
		Consumer app = null;
		
		// Send email
		injector = new EmailServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, email);
		
		// Send SMS
		injector = new SMSServiceInjector();
		app = injector.getConsumer();
		app.processMessage(msg, phone);
	}
}
