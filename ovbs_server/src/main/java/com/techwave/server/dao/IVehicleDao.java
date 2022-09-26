package com.techwave.server.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techwave.server.model.Vehicledb;

@Service
public interface IVehicleDao {

	List<Vehicledb> getAllVehicles(); //get
	
	Vehicledb getByVehicleId(String vehicleId); //get
	
	String AddVehicle(Vehicledb cb); //post
	
	String UpdateVehicle(Vehicledb cb, String vehicleId); //put
	
	String DeleteVehicle(String vehicleId); //delete
}
