package com.project.beans;

public class Car {
	
	public Car() {
		System.out.println("Car :: Constructor");
	}
	
	public void setEng(IEngine eng) {
		this.eng = eng;
	}
	
	private IEngine eng;
	public void drive() {
		int status = eng.start();
		if(status >= 1) {
			System.out.println("Journey started");
		}else {
			System.out.println("Engine trouble");
		}
	}
}
