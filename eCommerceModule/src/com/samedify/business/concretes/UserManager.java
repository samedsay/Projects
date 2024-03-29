package com.samedify.business.concretes;

import com.samedify.business.abstracts.MailVerificationService;
import com.samedify.business.abstracts.UserCheckService;
import com.samedify.business.abstracts.UserService;
import com.samedify.dataAccess.abstracts.UserDao;
import com.samedify.entities.concretes.User;

public class UserManager implements UserService {

	UserDao userDao;
	UserCheckService userCheckService;
	MailVerificationService mailVerificationService;

	public UserManager(UserCheckService userCheckService, MailVerificationService mailVerificationService,
			UserDao userDao) {
		this.userCheckService = userCheckService;
		this.mailVerificationService = mailVerificationService;
		this.userDao = userDao;

	}

	@Override
	public void signIn(User user) {

		mailVerificationService.verifyMail(user.getEmail());

		if (userDao.getPasswordAndEmail(user.getEmail(), user.getPassword())
				&& mailVerificationService.isVerified(user.getEmail())) {
			System.out.println(user.getFirstName() + " logged in successfully!");
		} else if (userDao.getPasswordAndEmail(user.getEmail(), user.getPassword())) {
			System.out.println("You have to verify your mail!");
		} else {
			System.out.println("Please try again!");
		}

	}

	@Override
	public void signUp(User user) {

		if (userCheckService.checkIsValid(user)) {
			userDao.add(user);
			mailVerificationService.sendMail(user.getEmail());
		}

	}

}
