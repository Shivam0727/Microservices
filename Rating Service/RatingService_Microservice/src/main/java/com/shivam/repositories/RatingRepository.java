package com.shivam.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.entities.Rating;

@Repository
public interface RatingRepository extends JpaRepository<Rating, String> {

	// Custom Finder Methods :
	List<Rating> findByUserId(String userId);
	List<Rating> findByHotelId(String hotelId);
	
}
