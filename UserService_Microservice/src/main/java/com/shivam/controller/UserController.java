package com.shivam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.shivam.entities.User;
import com.shivam.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServices userServices;
	
	// Create :
	@PostMapping
	public ResponseEntity<User> createUser(@RequestBody User user) {
		User u = userServices.saveUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(u);
	}
	
	// Single User Get :
	@GetMapping("/{userId}")
	public ResponseEntity<User> getSingleUser(@PathVariable String userId) {
		User user = userServices.getUser(userId);
		return ResponseEntity.ok(user);
	}
	
	// All User Get :
	@GetMapping
	public ResponseEntity<List<User>> getAllUser() {
		List<User> allUsers = userServices.getAllUser();
		return ResponseEntity.ok(allUsers);
	}
	
}
