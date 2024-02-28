package com.bibhuti.binding;

import java.io.Serializable;

import lombok.Data;

@Data
public class Country implements Serializable {

	private Integer id;
	private String name;
	private String countryCode;
	
}
