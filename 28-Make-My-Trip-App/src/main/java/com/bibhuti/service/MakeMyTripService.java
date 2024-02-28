package com.bibhuti.service;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;

public interface MakeMyTripService {
	public Ticket bookTicket(Passenger passenger);
	public Ticket getTicketByNumber(Integer ticketNumber);
}
