package basic;

import java.util.Scanner;

public class PalindromeClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  System.out.println("Enter word");
		  String str = sc.nextLine();
		  int j = str.length()-1;
		  int size = str.length()-1;

		  for (int i=0;i<str.length();i++) {
		   if(str.charAt(i)==str.charAt(j)) {
		    --j;
		    if(i==size) {
		     System.out.println("palindrome");
		    }}
		   else {
		    System.out.println("not palindrome");
		    break;
		   }
		  }
		
		}
}
