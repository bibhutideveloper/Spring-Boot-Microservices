package com.bibhuti.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;

@Service
public class BookingServiceImpl implements BookingService {

	private Map<Integer, Ticket> ticketMap = new HashMap<>();
	private Integer ticketNumber = 1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(550.00);
		t.setStatus("CONFIRMED");
		t.setTicketNumber(ticketNumber);
		ticketMap.put(ticketNumber, t);
		ticketNumber++;
		
		return t;
	}

	@Override
	public Ticket getTicket(Integer ticketNumber) {

		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		
		return null;
	}

}
