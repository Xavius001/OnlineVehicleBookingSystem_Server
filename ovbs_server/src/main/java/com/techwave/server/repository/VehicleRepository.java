package com.techwave.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techwave.server.model.Vehicledb;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicledb, Integer> {
	
}
