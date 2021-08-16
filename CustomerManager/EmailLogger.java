package com.samedify.main;

public class EmailLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Logged in Email : " + message);

	}

}
