package PractiseProjects;

import java.util.HashSet;
import java.util.Iterator;

public class Hashsetcar {

	public static void main(String[] args) {
		   HashSet<String> cars = new HashSet<String>();
		    cars.add("Volvo");
		    cars.add("BMW");
		    cars.add("Ford");
		    cars.add("BMW");
		    cars.add("Mazda");
		    cars.add("Ferrari");
		    cars.add("lamborghini");
		    cars.remove("Mazda");
		System.out.println(cars);
	    System.out.println(cars.contains("Renault"));
	    System.out.println(cars.contains("Ferrari"));
	 
	    if (cars.size() == 0 ){
	        System.out.println("List of cars is empty");
	    }
	    else {
	        System.out.println(cars.size());
	    }
	    cars.clear();
	
	}

}
