package oopspart2;

public class BMW extends Car{  //"has-a relationship"

	//When same method is present in parent class as well as in child class with the same name and same number of arguments, is called Method-Overriding.
	
	public void start(){

		System.out.println("BMW ---- start");
	}

	public void ac(){

		System.out.println("BMW ---- ac");
		
	}

	public void seat(){

		System.out.println("BMW ---- seat");
	}
	
}
