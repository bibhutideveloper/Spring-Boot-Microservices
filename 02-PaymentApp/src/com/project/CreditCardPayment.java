package com.project;

public class CreditCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit card payment processed");
		return true;
	}

}
