package com.shivam.services;

import java.util.List;

import com.shivam.entities.Hotel;

public interface HotelService {

	
	// Create
	Hotel create(Hotel hotel);
	
	// GetAll
	List<Hotel> getAll();
	
	// GetSingle
	Hotel get(String id);
	
	
}
