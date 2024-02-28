package com.project.beans;

public class CreditCardPayment implements IPayment {
	
	public CreditCardPayment() {
		System.out.println("Credit card payment :: Constructor");
	}

	@Override
	public boolean processPayment(double billAmt) {
		// logic
		System.out.println("Credit card payment successfull");
		return true;
	}

}
