package com.project.beans;

public class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("Diesel Engine :: Constructor");
	}
	
	@Override
	public int start() {
		// logic
		System.out.println("Diesel Engine Started");
		return 1;
	}

}
