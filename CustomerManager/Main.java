package com.samedify.main;

public class Main {

	public static void main(String[] args) {
		
		
		Logger[] loggers = {new SmsLogger(), new EmailLogger(), new FileLogger(), new DatabaseLogger()};
		
		CustomerManager customerManager = new CustomerManager(loggers);
		Customer customer = new Customer(1, "Samed", "Say");
		customerManager.add(customer);

	}

}
