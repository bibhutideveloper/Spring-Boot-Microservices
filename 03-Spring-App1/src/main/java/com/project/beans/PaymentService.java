package com.project.beans;

public class PaymentService {
	
	private IPayment payment;
	
	public PaymentService() {
		System.out.println("Payment Service :: 0-Constructor");
	}
	
	public PaymentService(IPayment payment) {
		System.out.println("Payment Service :: param-Constructor");
		this.payment = payment;
	}
	
	public void setPayment(IPayment payment) {
		System.out.println("Setter method called");
		this.payment = payment;
	}
	
	public void doPayment(double billAmt) {
		boolean status = payment.processPayment(billAmt);
		if(status) {
			System.out.println("Receipt printing");
		}else {
			System.out.println("Card denied");
		}
	}
}
