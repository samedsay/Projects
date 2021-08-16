package com.samedify.main;

public class CustomerManager {

	private Logger[] loggers;

	public CustomerManager(Logger[] loggers) {
		this.loggers = loggers;
	}

	public void add(Customer customer) {
		System.out.println("Customer " + customer.getFirstName() + " added.");
	//	Utils utils = new Utils();   ** with static it makes global use.
		Utils.runLoggers(loggers, customer.getFirstName() + " logged in DB.");
		
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName() + " logged in DB.");
//		}

	}

	public void delete(Customer customer) {
		System.out.println("Customer " + customer.getFirstName() + " deleted.");
		
		Utils.runLoggers(loggers, customer.getFirstName() + " logged in DB.");
		
//		for (Logger logger : loggers) {
//			logger.log(customer.getFirstName() + " logged in DB.");
//		}

	}

}
