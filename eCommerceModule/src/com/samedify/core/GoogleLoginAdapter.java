package com.samedify.core;

import com.samedify.entities.concretes.User;
import com.samedify.google.GoogleLogin;

public class GoogleLoginAdapter implements GoogleService{

	@Override
	public void loginViaGoogle(User user) {

		GoogleLogin googleLogin = new GoogleLogin();
		googleLogin.login(user);
		
	}
	
	

}
