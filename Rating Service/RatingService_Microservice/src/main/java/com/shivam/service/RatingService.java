package com.shivam.service;

import java.util.List;

import com.shivam.entities.Rating;

public interface RatingService {

	// Create
	public Rating create(Rating rating);
	
	// GetAll Ratings
	public List<Rating> getRatings();
	
	// Get All By UserId
	public List<Rating> getRatingByUserId(String userId);
	
	// Get All By Hotel
	public List<Rating> getRatingByHotelId(String hotelId);
	
}
