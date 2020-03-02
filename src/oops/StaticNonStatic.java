package oops;

public class StaticNonStatic {

	//global vars: the scope of global vars will be available across all the functions with the same conditions.
	
	String name = "Dev"; //non static global var
	static int i = 25;  //static global var

	public static void main(String[] args) {

		//How to call static method and vars?
		//1.Direct calling:
		sum();
		//Calling by classname
		StaticNonStatic.sum();

		System.out.println(i);
		System.out.println(StaticNonStatic.i);

		//How to call non static method and vars?
		StaticNonStatic obj = new StaticNonStatic();
		obj.add();
		System.out.println(obj.name);

		//Can I access static methods by using object reference? Yes
//		obj.sum(); // Warning will be given  but this is not good practice.
	}

	public void add(){ // Non Static method

		System.out.println("Non Static Method");
	}

	public static void sum(){ // Static method
		System.out.println("Static Method");

	}
}
