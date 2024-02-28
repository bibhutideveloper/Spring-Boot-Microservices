package com.bibhuti.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Product {
	@Id
	private Integer pid;
	private String name;
	private String price;
	private Integer quantity;
}
