package com.samedify.business.abstracts;

import com.samedify.entities.concretes.User;

public interface UserCheckService {

	boolean checkIfFirstName(User user);

	boolean checkIfLastName(User user);

	boolean checkIfEmail(User user);

	boolean checkIfPassword(User user);

	boolean checkIfUnique(User user);

	boolean checkIfValid(User user);

}
