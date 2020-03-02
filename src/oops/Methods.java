package oops;

public class Methods {

	//Main method --- Starting point of execution
	public static void main(String[] args) {

		Methods obj = new Methods();
		//one object will be created, obj is the refrence variable, referring to this object.
		//after creating the object, the copy of all non static method will be given to this object
				
		obj.abc();
		int l = obj.pqr();
		String s2 = obj.xyz();
		int div = obj.division(30, 10);
		
		System.out.println(l);
		System.out.println(s2);
		System.out.println(div);
		
		//main method is void never return the value.
	}

	//Non Static methods.
	
	//return type --- void
	//void --- does not return any value
	public void abc(){  // No input, no output

		System.out.println("abc method");
	}

	//return type --- int
	public int pqr(){  //No input, some output
		System.out.println("pqr method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;

	}

	//return type --- String
	public String xyz(){  //No input, some output
		System.out.println("xyz method");
		
		String s1 = "Selenium";
		
		return s1;

	}

	//return type --- int
	//x,y --> input parameters/ arguments
	public int division(int x, int y){
		System.out.println("division method");
		int d = x/y;
		
		return d;
		
	}

}
