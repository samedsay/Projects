package com.samedify.main;

public class SmsLogger implements Logger{

	@Override
	public void log(String message) {
		
		System.out.println("Logged in SMS : " + message);

		
	}
	
	

}
