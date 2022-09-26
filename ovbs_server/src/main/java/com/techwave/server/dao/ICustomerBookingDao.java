package com.techwave.server.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.techwave.server.model.CustomerBooking;

@Service
public interface ICustomerBookingDao {

	List<CustomerBooking> getAllBookings(); //get
	
	CustomerBooking getByBookingId(String bookingId); //get
	
	String AddBooking(CustomerBooking cb); //post
	
	String UpdateBooking(CustomerBooking cb, String bookingId); //put
	
	String DeleteBooking(String bookingId); //delete

	String ApproveBooking(CustomerBooking cb, String bookingId);

	String RejectBooking(CustomerBooking cb, String bookingId);
}
