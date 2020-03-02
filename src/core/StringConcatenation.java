package core;

public class StringConcatenation {

	public static void main(String[] args) {
		
		//+ : is a concatenation.
		//Println : is used to print on the console with a new line.
		//Print : is just used to print on the console. 
		
		int a = 100;
		int b = 200;
		
		String x = "Hello";
		String y = "World";
		
		double c = 10.33;
		double d = 12.50;
		
		System.out.println(a+b);
		System.out.println(x+y);
		
		System.out.println(a+b+x+y);
		System.out.println(x+y+a+b);
		
		System.out.println(x+y+(a+b));
		System.out.println(a+b+x+y+a+x+b+y);
		
		System.out.println(a+b+x+y+a+b);
		
		System.out.println(c+d);
		System.out.println(x+y+c+d);
	}

}
