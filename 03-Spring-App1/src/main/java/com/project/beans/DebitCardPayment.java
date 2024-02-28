package com.project.beans;

public class DebitCardPayment implements IPayment {

	public DebitCardPayment() {
		System.out.println("Debit card payment :: Constructor");
	}
	
	@Override
	public boolean processPayment(double billAmt) {
		// logic
		System.out.println("Debit card payment successfull");
		return true;
	}

}
