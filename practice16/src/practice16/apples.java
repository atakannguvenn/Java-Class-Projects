package practice16;

import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("How many x?");
		int x = input.nextInt();
		input.close();
		
		for (int y = 1; y <= 20; y++) {
			double e = 1.0;
			for(int i = 1; i <= y; i++)
				e += Math.pow(x, i) / factorial(i);
			System.out.println("n = " + (int)y + " exp(" + (int)y + ") = " + e);
		}
		
		System.out.println("Using Predefined Function exp(" + (int)x + ") = " + Math.exp(x));
		
	}
	
    public static double factorial(int n){
        double f = 1.0; 
  
        for (int i = 2; i <= n; i++ )
            f *= i;
  
        return f;
    }
	
	
}
