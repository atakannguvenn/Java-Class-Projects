package tuesday17;

import java.util.Scanner;

public class apples {

	public static Scanner console = new Scanner(System.in);

	public static void main(String[] args) {
		
		final long startTime = System.currentTimeMillis();
		
		
		int n;
		System.out.println("Please input n: ");
		n = console.nextInt();
		
		for(int i = 2; i <= n; i++){
			if(prime(i))
				System.out.print(i + "\t");
		}
		
		final long endTime = System.currentTimeMillis();
		System.out.printf("\nTotal execution time: " + (endTime - startTime) );
		
	}
	
	private static boolean prime(int x) {
        if (x < 2) return false;
        if (x == 2) return true;
        if (x % 2 == 0) return false;
        for (int i = 3; i * i <= x; i += 2)
            if (x % i == 0) return false;
        return true;
	}
	
}
