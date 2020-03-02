package core;

public class LoopsConcepts {

	public static void main(String[] args) {
		

		// Disadvantage of while loop is: It will generate infinite loop if you don't give incremental/decremental part.
		
		int i = 1; // Initialization
		while (i<=10){   // Conditions
			System.out.println(i);
			i++;   // Increment
		}
		
		System.out.println("*******************");
		
		for(int j=0; j<=10; j++)    // Initialization, Conditions, Increment
		{
			System.out.println(j);
		}
		
		// j++ means J=J+1;
		
		System.out.println("*******************");
		
		for(int k=10; k>=-10; k--)
		{
			System.out.println(k);
		}
		
	}

}
