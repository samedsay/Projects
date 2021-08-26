package com.samedify.google;

import com.samedify.entities.concretes.User;

public class GoogleLogin {

	public void login(User user) {
		System.out.println(user.getFirstName() + " logged in the system via Google!");
	}

}
