package com.project.beans;

public class PetrolEngine implements IEngine {
	
	public PetrolEngine() {
		System.out.println("Petrol Engine :: Constructor");
	}

	@Override
	public int start() {
		// logic
		System.out.println("Petrol Engine Started");
		return 1;
	}

}
