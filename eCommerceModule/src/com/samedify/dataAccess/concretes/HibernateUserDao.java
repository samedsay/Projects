package com.samedify.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import com.samedify.dataAccess.abstracts.UserDao;
import com.samedify.entities.concretes.User;

public class HibernateUserDao implements UserDao {

	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		users.add(user);
		System.out.println(user.getFirstName() + " " + user.getLastName() + " added in database.");

	}

	@Override
	public void update(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName() + " updated!");

	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		users.remove(user);
		System.out.println(user.getFirstName() + " is removed from database.");
	}

	@Override
	public boolean getPasswordAndEmail(String email, String password) {
		// TODO Auto-generated method stub
		for (User user : users) {
			if ((user.getEmail() == email) && (user.getPassword() == password)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return users;
	}

}
