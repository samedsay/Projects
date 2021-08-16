package com.samedify.main;

public class FileLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("Logged in file : " + message);
	}

}
