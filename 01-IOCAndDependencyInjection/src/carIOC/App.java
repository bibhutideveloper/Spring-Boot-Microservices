package carIOC;

public class App {

	public static void main(String[] args) {
		//Car car = new Car(new PetrolEngine()); // Dependency Injection
		
		Car car = new Car();
		car.setEng(new DieselEngine());
		
		car.drive();
	}

}
