import java.util.Scanner;

class apples {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		tuna tunaObject = new tuna("Ecem");
		tunaObject.saying();
		System.out.println("Enter name of first girlfriend here: ");
		String name = input.nextLine();
		input.close();
		tunaObject.setname(name);
		tunaObject.saying();
		}
}