package core;

public class TwoDimArray {

	public static void main(String[] args) {
		
		String x[][] = new String [3][5];
		
		System.out.println(x.length);
		System.out.println(x[0].length);
		
		//1st row
		x[0][0] = "A";
		x[0][1] = "B";
		x[0][2] = "C";
		x[0][3] = "D";
		x[0][4] = "E";
		
		System.out.println(x[0][0]);
		
		//2nd row
		x[1][0] = "A1";
		x[1][1] = "B2";
		x[1][2] = "C3";
		x[1][3] = "D4";
		x[1][4] = "E5";
		
		x[2][0] = "A11";
		x[2][1] = "B22";
		x[2][2] = "C33";
		x[2][3] = "D44";
		x[2][4] = "E55";
		
		for (int row = 0; row < x.length; row++) {
			for (int col = 0; col < x[0].length; col++) {
				System.out.println(x[row][col]);
				
			}
		}

	}

}
