package com.project;

public class PaymentService {
	private IPayment payment;
	
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	public void dopayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if(status) {
			System.out.println("Printing receipt");
		}else {
			System.out.println("Payment declined");
		}
	}
}
