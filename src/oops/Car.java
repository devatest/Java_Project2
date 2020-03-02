package oops;

public class Car {

	int tyre;
	int wheel;
	
	public static void main(String[] args) {
		
		// new Car();--- this is the object of Car class
		// new keyword is used to create the object
		// A, B, C ---> Object reference variables
		
		
		Car A = new Car();
		Car B = new Car();
		Car C = new Car();
		
		A.tyre = 210;
		B.wheel = 500;
		
		C.wheel = 111;
		
		System.out.println(A.tyre);
		System.out.println(C.wheel);
		System.out.println("***************");
				
		A = B;
		B = C;
		C = A;
		
		A.tyre = 10;
		System.out.println(A.tyre);    //10
		C.tyre = 20;
		System.out.println(C.tyre);    //20
		System.out.println(A.tyre);
		
		

	}

}
