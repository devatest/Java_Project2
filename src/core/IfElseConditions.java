package core;

public class IfElseConditions {

	public static void main(String[] args) {
		int a = 50;
		int b = 20;
		
		if(a>b){
			System.out.println("a is greater than b");
		}
		else {
			System.out.println("b is greater than a");
		}

		
		
		// Comparision operators:
		// < > <= >= == !=
		// = Means you are assigning the value z into y. = is a assignment operator and == is a compator operator
		
		int y = 500;
		int z = 500;
		
		if(y==z){
			System.out.println("y and z are equal");
		}
		else {
			System.out.println("y and z are not equal");
		}
		
		
		
		// Find out the highest number
		
		int p = 500;
		int q = 700;
		int r = 300;
		
		// nested if-else
		
		if(p>q & p>r){
			System.out.println("p is a greater number");
		}
		else if (q>r) {
			System.out.println("q is a greater number");
		}
		else {
			System.out.println("r is a greater number");
		}
		
	}

}
