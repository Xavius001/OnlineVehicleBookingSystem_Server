package com.techwave.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwave.server.model.CustomerBooking;

@Repository
public interface CustomerBookingRepository extends JpaRepository<CustomerBooking, Integer> {
	
}
