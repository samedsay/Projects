package com.samedify.dataAccess.abstracts;

import java.util.List;

import com.samedify.entities.concretes.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	boolean getPasswordAndEmail(String email, String password);
	List<User> getAll();
	

}
