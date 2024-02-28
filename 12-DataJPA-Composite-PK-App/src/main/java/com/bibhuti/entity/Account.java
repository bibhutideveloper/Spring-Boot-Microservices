package com.bibhuti.entity;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="account_tbl")
public class Account {
	
	private String holderName;
	
	private String branch;
	
	@EmbeddedId
	private AccountPK accountPk;
	
}
