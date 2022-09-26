package com.techwave.server.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.server.model.Vehicledb;
import com.techwave.server.repository.VehicleRepository;

@Service
public class VehicleDao implements IVehicleDao {

	@Autowired
	VehicleRepository vRepository;
	
	@Override
	public List<Vehicledb> getAllVehicles() {
		// TODO Auto-generated method stub
		return vRepository.findAll();
	}

	@Override
	public Vehicledb getByVehicleId(String vehicleId) {
		// TODO Auto-generated method stub
		Vehicledb V;
		try {
			V = getAllVehicles().stream().filter(i->i.getVehicleId().equals(vehicleId)).collect(Collectors.toList()).get(0);
			if(V!=null) {
				return V;
			}
			else {
				throw new Exception();
			}
		}
		catch(Exception E) {
			return null;
		}
	}

	@Override
	public String AddVehicle(Vehicledb v) {
		// TODO Auto-generated method stub
		vRepository.save(v);
		return "New Vehicle Added.";
	}

	@Override
	public String UpdateVehicle(Vehicledb v, String vehicleId) {
		// TODO Auto-generated method stub
		Vehicledb old = getByVehicleId(vehicleId);
		old.setStock(v.getStock());
		vRepository.save(old);
		return "Vehicle stock updated";
	}

	@Override
	public String DeleteVehicle(String vehicleId) {
		// TODO Auto-generated method stub
		vRepository.delete(getByVehicleId(vehicleId));
		return "Vehicle deleted.";
	}
	
}
