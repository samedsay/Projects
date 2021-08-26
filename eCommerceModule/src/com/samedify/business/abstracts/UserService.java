package com.samedify.business.abstracts;

import com.samedify.entities.concretes.User;

public interface UserService {

	void signUp(User user);

	void signIn(User user);

}
