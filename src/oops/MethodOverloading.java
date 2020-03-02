package oops;

public class MethodOverloading {

	public static void main(String[] args) {

		System.out.println("main method");

		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(1);
		obj.sum(10, 20);
	}

	public static void main(int m) {

	}

	public static void main(int i, int j) {

	}

	//We can overload main method also.
	//You can not create a method inside a method.
	//duplicate method -- same method name with same number of arguments are not allowed.
	//Same method name with same number of arguments with different data types is allowed.
	//Method Overloading --- When the method name is same with the different arguments or input parameters within the same class.

	public void sum(){ // 0 input para

		System.out.println("0 input para");
	}

	public void sum(int a){ // 1 input para

		System.out.println("1 input para");
		System.out.println(a);

	}

	public void sum(int b, int c){  // 2 input para

		System.out.println("2 input para");
		System.out.println(b + c);

	}

}
