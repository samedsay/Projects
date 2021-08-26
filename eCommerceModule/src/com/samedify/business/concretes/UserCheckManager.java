package com.samedify.business.concretes;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.samedify.business.abstracts.UserCheckService;
import com.samedify.entities.concretes.User;

public class UserCheckManager implements UserCheckService {

	List<String> emails = new ArrayList<String>();

	@Override
	public boolean checkIfFirstName(User user) {

		if (user.getFirstName().isEmpty()) {
			System.out.println("You cannot leave this field blank!");
			return false;
		} else if (user.getFirstName().length() < 2) {
			System.out.println("Name should be at least 2 character!");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIfLastName(User user) {

		if (user.getLastName().isEmpty()) {
			System.out.println("You cannot leave this field blank!");
			return false;
		} else if (user.getLastName().length() < 2) {
			System.out.println("Last name should be at least 2 character!");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIfEmail(User user) {
		String regex = "^[A-Z0-9._%+-]+@[A-Z0-9.-]+.(com|org|net|edu|gov|mil|biz|info|mobi)(.[A-Z]{2,})?$";
		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

		if (user.getEmail().isEmpty()) {
			System.out.println("You cannot leave this field blank!");
			return false;
		} else if (pattern.matcher(user.getEmail()).find() == false) {
			System.out.println("Your email address is denied! Please try again!");
			return false;
		}

		return true;
	}

	@Override
	public boolean checkIfPassword(User user) {

		if (user.getPassword().isEmpty()) {
			System.out.println("You cannot leave this field blank!");
			return false;
		} else if (user.getLastName().length() < 6) {
			System.out.println("Password should be at least 6 character!");
			return false;
		}
		return true;
	}

	@Override
	public boolean checkIfUnique(User user) {

		boolean flag = true;
		if (emails.contains(user.getEmail())) {
			System.out.println("This email address is taken! Please try another!");
			flag = false;
		} else {
			emails.add(user.getEmail());
			flag = true;
		}

		return flag;
	}

	@Override
	public boolean checkIsValid(User user) {

		if (checkIfFirstName(user) && checkIfLastName(user) && checkIfEmail(user) && checkIfPassword(user)
				&& checkIfUnique(user)) {

			return true;

		}

		return false;
	}

}
