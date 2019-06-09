package assignment7;

import java.util.Scanner;

public class tuna {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a positive integer:");
		int number1 = input.nextInt();
		input.close();
		int counter = 0;
		System.out.printf("The factor of %d is: ", number1);
		for(int x = 1; x <= number1; x++) {
			if(number1 % x == 0) {
				System.out.printf("%d ", x);
				counter++;
			}
		}
		System.out.println();
		System.out.println("Count of factor: " + counter);
		if (counter > 2)
			System.out.println(number1 + " is a composite number");
		if (counter == 2)
			System.out.println(number1 + " is a prime number");
	}

}
