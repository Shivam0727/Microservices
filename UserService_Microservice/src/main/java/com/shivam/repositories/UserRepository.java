package com.shivam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

	// If you want to implement any custom method or query then feel free to write here...
	
}
