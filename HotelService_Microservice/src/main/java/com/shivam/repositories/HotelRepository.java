package com.shivam.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shivam.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, String> {

}
