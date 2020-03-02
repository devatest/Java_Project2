package basic;

import java.util.Scanner;

public class SumPercentage {

	public static void main(String[] args) {
		int m1, m2, m3, total;
		double per;
		System.out.println("Enter the Marks for 3 subjects:");
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		
		total = m1 + m2 + m3;
		per = (total / 300.0) * 100;
		
		System.out.println("Total:" +total);
		System.out.println("per:" +per);
	}

}
