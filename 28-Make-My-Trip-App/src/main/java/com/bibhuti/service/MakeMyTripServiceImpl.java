package com.bibhuti.service;

import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientAutoConfiguration;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientCodecCustomizer;
import org.springframework.boot.autoconfigure.web.reactive.function.client.WebClientSsl;
import org.springframework.boot.web.reactive.function.client.WebClientCustomizer;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.bibhuti.request.Passenger;
import com.bibhuti.response.Ticket;

@Service
public class MakeMyTripServiceImpl implements MakeMyTripService {
	
	private String BOOK_TICKET_URL = "http://localhost:2000/ticket";

	private String GET_TICKET_URL = "http://localhost:2000/ticket/{ticketNum}";

	@Override
	public Ticket bookTicket(Passenger passenger) {	
		
		
		RestTemplate rt = new RestTemplate(); 
		ResponseEntity<Ticket> responseEntity = 
				rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); 
		 							// url , body data, response type
		  
		Ticket ticket = responseEntity.getBody();
		
		
		/*
		// get the instance of WebClient( impl class )
		WebClient webClient = WebClient.create();
		
		// send POST request with passenger data
		// and map response to Ticket obj
		Ticket ticket = webClient.post()
								 .uri(BOOK_TICKET_URL)
								 .bodyValue(passenger)
								 .retrieve()
								 .bodyToMono(Ticket.class)
								 .block();
		*/
		
		return ticket;
	}

	@Override
	public Ticket getTicketByNumber(Integer ticketNumber) {
		
		RestTemplate rt = new RestTemplate();
		ResponseEntity<Ticket> response = 
				rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber);
								// url , response type, path parameter
		
		Ticket ticket = response.getBody();
		
		
		/*
		// get the instance of WebClient( impl class )
		WebClient webClient = WebClient.create();
				
		// send get request and map response to Ticket obj
		Ticket ticket = webClient.get()
								 .uri(GET_TICKET_URL, ticketNumber)
								 .retrieve()
								 .bodyToMono(Ticket.class)
								 .block(); // sync call
		*/
		
		
		return ticket;
	}
	
	
	
}
