package com.techwave.server.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techwave.server.dao.VehicleDao;
import com.techwave.server.model.Vehicledb;

@RestController
public class VehicleController {
	
	@Autowired
	VehicleDao vehicleDao;
	
	@GetMapping("getAllVehicles")
	public List<Vehicledb> getAllVehicles() {
		return vehicleDao.getAllVehicles();
	}

	@GetMapping("getByVehicleId/{vehicleId}")
	public Vehicledb getByVehicleId(@PathVariable("vehicleId") String vehicleId) {
		return vehicleDao.getByVehicleId(vehicleId);
	}

	@PostMapping("AddVehicle")
	public String AddVehicle(@RequestBody Vehicledb v) {
		return vehicleDao.AddVehicle(v);
	}

	@PutMapping("UpdateVehicle/{vehicleId}")
	public String UpdateVehicle(@RequestBody Vehicledb v, @PathVariable("vehicleId") String vehicleId) {
		return vehicleDao.UpdateVehicle(v, vehicleId);
	}

	@DeleteMapping("DeleteVehicle/{vehicleId}")
	public String DeleteVehicle(@PathVariable("vehicleId") String vehicleId) {
		return vehicleDao.DeleteVehicle(vehicleId);
	}
}
