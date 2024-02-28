package com.bibhuti.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	private Integer pid;
	private String pname;
	private String pemail;
	private String paddress;
}
