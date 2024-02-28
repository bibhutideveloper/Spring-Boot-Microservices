package com.bibhuti.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;
import com.bibhuti.service.BookingService;

@RestController
public class BookingRestController {
	
	@Autowired
	private BookingService service;
	
	@PostMapping(
			value="/ticket",
			consumes= {"application/json"},
			produces= {"application/json"}
	)
	public ResponseEntity<Ticket> ticketBooking(@RequestBody Passenger passenger	){
		
		System.out.println(passenger);
		
		Ticket ticket = service.bookTicket(passenger);
		System.out.println(ticket);
		return new ResponseEntity<>(ticket, HttpStatus.CREATED);
		
	}
	
	@GetMapping(
			value="/ticket/{ticketNum}",
			produces="application/json"
	)
	public Ticket getTicket(@PathVariable("ticketNum") Integer ticketNumber) {
		return service.getTicket(ticketNumber);
	}
	
}
