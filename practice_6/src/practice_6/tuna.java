package practice_6;

import java.util.Scanner;

public class tuna {

	public static void main(String[] args) {
		float[] numbers = new float[5];
		float[] numbers_round = new float[5];
		float average = 0;
		int sum = 0;
		Scanner input = new Scanner(System.in);
		for(int a = 0 ; a < 5; a++) {
			System.out.println("Please enter a float number: ");
			numbers[a] = input.nextFloat();
		}
		input.close();
		for (int a = 0; a < numbers.length; a++) {
			numbers_round[a] = (int)(numbers[a] + 0.5);
		}
		for (int a = 0; a < numbers.length; a++) {
			sum += numbers_round[a];
		}
		System.out.println("Sum is " + sum);
		average = (float)sum / numbers_round.length;
		System.out.println("Average is " + average);
	}

}
