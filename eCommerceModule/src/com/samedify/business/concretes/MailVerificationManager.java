package com.samedify.business.concretes;

import java.util.ArrayList;
import java.util.List;

import com.samedify.business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

	List<String> validEmails = new ArrayList<String>();

	@Override
	public void sendMail(String mail) {

		validEmails.add(mail);
		System.out.println("Mail verification code sent to : " + mail);

	}

	@Override
	public void verifyMail(String mail) {
		if (validEmails.contains(mail))
			System.out.println("Mail verified!");
		else
			System.out.println("Please send mail again!");
	}

	@Override
	public boolean isVerified(String mail) {

		if (validEmails.contains(mail)) {
			return true;
		}

		return false;
	}

}
