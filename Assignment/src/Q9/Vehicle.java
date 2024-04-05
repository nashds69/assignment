package Q9;

public class Vehicle {
	    private int horsepower;
	    public Vehicle(int horsepower) {
	        this.horsepower = horsepower;
	    }
	    public void drive() {
	        System.out.println("Vehicle is being driven.");
	    }
	}
	class Car extends Vehicle {
	    private String make;
	    private int horsepower;
	    public Car(int horsepower, String make) {
	        super(horsepower); 
	        this.make = make;
	        this.horsepower = 120; 
	    }
	    @Override
	    public void drive() {
	        super.drive(); 
	        System.out.println("Car is being driven and has a horsepower of "+horsepower);
	    }
	}