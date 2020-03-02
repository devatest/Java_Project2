package core;

public class IncrementandDecrement {

	public static void main(String[] args) {

		int a=1;
		int b=a++; // Post Increment
		
		System.out.println(a);
		System.out.println(b);
		
		int c=1;
		int d=++c;  //Pre Increment
		
		System.out.println(c);
		System.out.println(d);
		
		int p=2;
		int q=p--;  // Post Decrement
		
		System.out.println(p);
		System.out.println(q);
		
		int r=2;
		int s=--r;  // Pre Decrement
		
		System.out.println(r);
		System.out.println(s);

	}

}
