package oopspart2;

public class Test {

	public static void main(String[] args) {
		
		//Static polymorphism --- compile time polymorphism        URL: https://www.screencast.com/t/H0IZJyDspSV
		BMW obj = new BMW();
		obj.start();
		obj.ac();
		obj.seat();
		obj.stop();
		obj.accelerator();
		obj.engine();
		
		System.out.println("**********************");
		
		Car c = new Car();
		c.start();
		c.accelerator();
		c.stop();
		
		System.out.println("**********************");
		
		//Top casting
		Car c1 = new BMW(); //child class object can be referred by parent class reference variable -- dynamic polymorphism / Run-time polymorphism
		c1.start();         //only common method is accessable and all method of parent class. 
		c1.stop();
		c1.accelerator();
		
		//Down casting
	//	BMW b = (BMW) new Car();   //Run time error --- ClassCastException
		
	}

}
