package com.shivam.services;

import java.util.List;

import com.shivam.entities.User;

public interface UserServices {

	// User Operations :
	
	// Create
	User saveUser(User user);

	// Get single user of given userId
	User getUser(String userId);
	
	// Get multiple user of given userId
	List<User> getAllUser();
	
	// ToDo : delete
	// ToDo : update
	
}
