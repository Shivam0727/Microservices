package com.shivam.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shivam.entities.User;
import com.shivam.repositories.UserRepository;
import com.shivam.services.UserServices;
import com.shivam.services.exceptions.ResourceNotFoundException;

@Service
public class UserServiceImpl implements UserServices {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User saveUser(User user) {
		// Generate Unique UserId 
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepository.save(user);
	}

	@Override
	public User getUser(String userId) {
		return userRepository.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server : "+userId));
	}

	@Override
	public List<User> getAllUser() {
		return userRepository.findAll();
	}

}
