 package basic;

import java.util.Scanner;

public class AverageClass {
	static int total, total2;

	public static void main(String[] args) {
		thirdStudent();
		secondStudent();
		int avg ;
		avg = (total + total2 ) / 2;
		System.out.println("Average of 2 student:  "+avg);
		
	}

	public static void thirdStudent(){
		int m1, m2, m3,m4,m5;
		double per;
		System.out.println("Enter the Marks for 5 subjects of 1st student:");
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5= sc.nextInt();
		
		total = m1 + m2 + m3 + m4 + m5;
//		per = total / 5;
		
		System.out.println("Total:" +total);
//		System.out.println("per:" +per);

	}
	public static void secondStudent() {
	
		int m1, m2, m3,m4,m5;
		double per;
		System.out.println("Enter the Marks for 5 subjects of 2nd student:");
		Scanner sc = new Scanner(System.in);
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5= sc.nextInt();
		
		total2 = m1 + m2 + m3 + m4 + m5;
//		per = total / 5;
		
		System.out.println("Total2:" +total2);
//		System.out.println("per:" +per);

	}

	}
	

	
