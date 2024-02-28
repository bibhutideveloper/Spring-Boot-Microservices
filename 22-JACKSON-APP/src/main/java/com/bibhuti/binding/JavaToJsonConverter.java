package com.bibhuti.binding;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class JavaToJsonConverter {

	public static void main(String[] args) throws Exception {

		Address addr = new Address();
		addr.setCity("Pune");
		addr.setState("MH");
		addr.setCountry("INDIA");
		
		Customer c = new Customer();
		
		c.setId(101);
		c.setName("Bibhuti");
		c.setEmail("bibhuti@gmail.com");
		c.setPhone(9876543210L);
		c.setAddr(addr);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.writeValue(new File("customer.json"), c);
		System.out.println("Json file created.");
		
	}

}
