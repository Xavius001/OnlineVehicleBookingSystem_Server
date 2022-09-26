package com.techwave.server.dao;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techwave.server.model.CustomerBooking;
import com.techwave.server.model.Vehicledb;
import com.techwave.server.repository.CustomerBookingRepository;

@Service
public class CustomerBookingDao implements ICustomerBookingDao {
	@Autowired
	CustomerBookingRepository cbRepository;

	@Override
	public List<CustomerBooking> getAllBookings() {
		// TODO Auto-generated method stub
		return cbRepository.findAll();
	}

	@Override
	public CustomerBooking getByBookingId(String bookingId) {
		// TODO Auto-generated method stub
		CustomerBooking Cb;
		try {
			Cb = getAllBookings().stream().filter(i->i.getBookingId().equals(bookingId)).collect(Collectors.toList()).get(0);
			if(Cb!=null) {
				return Cb;
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
	public String AddBooking(CustomerBooking cb) {
		// TODO Auto-generated method stub
		cbRepository.save(cb);
		return "Vehicle has been booked";
	}

	@Override
	public String UpdateBooking(CustomerBooking cb, String bookingId) {
		// TODO Auto-generated method stub
		CustomerBooking old = getByBookingId(bookingId);
		old.setStatus(cb.getStatus());
		cbRepository.save(old);
		return "Booking status has been updated.";
	}

	@Override
	public String DeleteBooking(String bookingId) {
		// TODO Auto-generated method stub
		cbRepository.delete(getByBookingId(bookingId));
		return "Booking option has been deleted.";
	}
	
	@Override
	public String ApproveBooking(CustomerBooking cb, String bookingId) {
		CustomerBooking old = getByBookingId(bookingId);
		if(old==null) {
			return "No booking found with this Id";
		}
		else {
			if(old.getVehicleId().getStock()>0) {
				old.setStatus("approved");
				old.getVehicleId().setStock(old.getVehicleId().getStock()-1);
				cbRepository.save(old);
				return "Booking Status approved.";
			}
			else {
				return "Cannot approve. Not enough stock.";
			}
		}
	}
	
	@Override
	public String RejectBooking(CustomerBooking cb, String bookingId) {
		CustomerBooking old = getByBookingId(bookingId);
		if(old==null) {
			return "No booking found with this Id";
		}
		else {
			if(old.getStatus().equals("approved")) {
				old.setStatus("rejected");
				old.getVehicleId().setStock(old.getVehicleId().getStock()+1);
				cbRepository.save(old);
				return "Booking Status approved.";
			}
			else {
				old.setStatus("rejected");
				cbRepository.save(old);
				return "Booking Status approved.";
			}
		}
	}
	
}
