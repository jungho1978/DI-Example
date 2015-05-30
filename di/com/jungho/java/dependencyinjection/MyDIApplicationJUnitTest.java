package com.jungho.java.dependencyinjection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MyDIApplicationJUnitTest {
	private MessageServiceInjector injector;
	
	@Before
	public void setUp() {
		// mock the injector with anonymous class
		injector = new MessageServiceInjector() {
			
			@Override
			public Consumer getConsumer() {
				return new MyDIApplication(new MessageService() {
					
					@Override
					public void sendMessage(String msg, String rec) {
						// TODO Auto-generated method stub
						System.out.println("Mock Message Service implementation");
					}
				});
			}
		};
	}
	
	@Test
	public void test() {
		Consumer consumer = injector.getConsumer();
		consumer.processMessage("Hi, How are you?", "jungho@abc.com");
	}
	
	@After
	public void tearDown() {
		injector = null;
	}

}
