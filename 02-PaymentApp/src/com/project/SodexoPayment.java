package com.project;

public class SodexoPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodexo payment processed");
		return true;
	}

}
