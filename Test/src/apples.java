import java.util.Scanner;

public class apples {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		input.close();
		double amount, principal = 10000, rate = .01;
		
		for (int day = 1; day <= 20; day++) {
			amount = principal * Math.pow(1 + rate, day);
			System.out.printf("%2d %.2f\n", day, amount);
		}
	}
}
