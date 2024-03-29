package com.samedify;

import com.samedify.business.concretes.MailVerificationManager;
import com.samedify.business.concretes.UserCheckManager;
import com.samedify.business.concretes.UserManager;
import com.samedify.dataAccess.concretes.HibernateUserDao;
import com.samedify.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

		User user1 = new User(1, "Jane", "Austin", "austin@gmail.com", "11223344");
		User user2 = new User(2, "Koen", "Keyser", "dekeyser-13@student.edu.be", "99882233");
		User user3 = new User(3, "Marianne", "Versmissen", "versmissend@gmail.com", "33885577");

		UserManager manager = new UserManager(new UserCheckManager(), new MailVerificationManager(),
				new HibernateUserDao());

		manager.signUp(user1);
		manager.signUp(user2);
		manager.signUp(user3);
		System.out.println("---------------");
		manager.signIn(user1);
		manager.signIn(user2);
		manager.signIn(user3);

	}

}
