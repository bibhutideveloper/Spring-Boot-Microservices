package com.project;

public class App {
	public static void main(String[] args) {
		IPayment p = new DebitCardPayment();
		PaymentService service = new PaymentService(p);
		service.dopayment(450.0);
	}
}
