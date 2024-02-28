package com.bibhuti.service;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;

public interface BookingService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicket(Integer ticketNumber);
}
