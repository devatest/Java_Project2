package oops;

public class WrapperClass {

	public static void main(String[] args) {
		
		String x = "100";
		System.out.println(x + 20);
		
		//data conversion: String to int
		int i = Integer.parseInt(x);
		System.out.println(i + 20);
		
		//String to double conversion
		String y = "100.5";
		double d = Double.parseDouble(y);
		System.out.println(d + 10);
		
		//String to boolean conversion
		String k = "true";
		boolean b = Boolean.parseBoolean(k);
		System.out.println(b);
		
		
		//int to String conversion
		int j = 500;
		System.out.println(j + 10);
		
		String s = String.valueOf(j); // "500"
		System.out.println(s+10);
		
		System.out.println("****************************");
		
		String s1 = "100A";      //Is not pure numeric string
		Integer.parseInt(s1);    // Error ----  NumberFormatException: -- For input string: "100A"

	}

}
