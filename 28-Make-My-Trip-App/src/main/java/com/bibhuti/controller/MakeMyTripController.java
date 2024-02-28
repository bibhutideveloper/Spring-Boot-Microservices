package com.bibhuti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;
import com.bibhuti.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private MakeMyTripService service;

	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("passenger", new Passenger());
		return "index";
	}
	
	@PostMapping("/bookTicket")
	public String bookTicket(@ModelAttribute Passenger passenger, Model model) {
		Ticket ticket = service.bookTicket(passenger);
		model.addAttribute("msg", "Your ticket booked with ID:: "+ticket.getTicketNumber());
		
		return "index";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return "ticket";
	}
	
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam Integer ticketNum, Model model) {
		Ticket ticket = service.getTicketByNumber(ticketNum);
		model.addAttribute("ticket", ticket);
		
		return "ticket";
	}
	
}
