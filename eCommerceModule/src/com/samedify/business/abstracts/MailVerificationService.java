package com.samedify.business.abstracts;

public interface MailVerificationService {

	void sendMail(String mail);

	void verifyMail(String mail);

	boolean isVerified(String mail);

}
