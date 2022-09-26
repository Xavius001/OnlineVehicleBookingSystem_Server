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

import com.techwave.server.dao.CustomerBookingDao;
import com.techwave.server.model.CustomerBooking;

@RestController
public class CustomerBookingController {
	
	@Autowired
	CustomerBookingDao cbDao;
	
	@GetMapping("getAllBookings")
	public List<CustomerBooking> getAllBookings() {
		return cbDao.getAllBookings();
	}

	@GetMapping("getByBookingId/{bookingId}")
	public CustomerBooking getByBookingId(@PathVariable("bookingId") String bookingId) {
		return cbDao.getByBookingId(bookingId);
	}

	@PostMapping("AddBooking")
	public String AddBooking(@RequestBody CustomerBooking cb) {
		return cbDao.AddBooking(cb);
	}

	@PutMapping("UpdateBooking/{bookingId}")
	public String UpdateBooking(@RequestBody CustomerBooking cb, @PathVariable("bookingId") String bookingId) {
		return cbDao.UpdateBooking(cb, bookingId);
	}
	
	@PutMapping("ApproveBooking/{bookingId}")
	public String ApproveBooking(@RequestBody CustomerBooking cb, @PathVariable("bookingId") String bookingId) {
		return cbDao.ApproveBooking(cb, bookingId);
	}
	
	@PutMapping("RejectBooking/{bookingId}")
	public String RejectBooking(@RequestBody CustomerBooking cb, @PathVariable("bookingId") String bookingId) {
		return cbDao.RejectBooking(cb, bookingId);
	}

	@DeleteMapping("DeleteBooking/{bookingId}")
	public String DeleteBooking(@PathVariable("bookingId") String bookingId) {
		return cbDao.DeleteBooking(bookingId);
	}
}
