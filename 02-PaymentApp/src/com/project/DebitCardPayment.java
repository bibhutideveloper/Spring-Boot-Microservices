package com.project;

public class DebitCardPayment implements IPayment {

	@Override
	public boolean processPayment(double billAmt) {
		// logic
		System.out.println("Debit card payment processed");
		return true;
	}

}
