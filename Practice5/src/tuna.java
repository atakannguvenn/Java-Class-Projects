import java.util.Scanner;

public class tuna {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String number = input.next();
		input.close();
		
		for (int x = 0; x < number.length(); x++) {
		char numbers = number.charAt(x);
		System.out.println(numbers);
		}
		
		System.out.println(17.0%4 );
		
	}
}