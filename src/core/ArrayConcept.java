package core;

public class ArrayConcept {

	public static void main(String[] args) {
		
		//Array: To store similar data type values in a array veriable.
		
		//1.int array
		//lowest bound/index = 0
		//upper bound/index = n-1 (n is size of array)
		//One dim array
		
		//Dis-advantages of Array:
		//1.Size is fixed --static array-- To overcome of this problem -- we use collections ArrayList, HashTable -- use dynamic array.
		//2.Store only similar data types -- To overcome of this problem -- we use object array.
		
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		
		System.out.println(i[2]);
		
//		System.out.println(i[4]);      // ArrayIndexOutOfBoundsException
		System.out.println(i.length); // size/length of array.

		//2.double array
		double j[] = new double[2];
		j[0] = 50.50;
		j[1] = 70.88;
		
		System.out.println(j[1]);
		
		//3.Char array
		char c[] = new char[3];
		c[0] = 'a';
		c[2] = '5';
		c[1] = '$';
		
		System.out.println(c[1]);
		
		//4.String array
		String s[] = new String[4];
		s[0] = "Dev";
		s[2] = "123456";
		
		System.out.println(s[0]);
		System.out.println(s.length);
		
		
		//Object Array: (Object is a class)--- is used to store different data types values.
		
		Object ob[] = new Object[5];
		ob[0] = "Dev";
		ob[1] = 5;
		ob[2] = 'o';
		ob[3] = 100.55;
		
		System.out.println(ob[0]);
		System.out.println(ob.length);
	}

}
