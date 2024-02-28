package com.bibhuti.entity;

import java.io.Serializable;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class AccountPK implements Serializable {

	private Long accNumber;
	
	private String accType;
	
}
