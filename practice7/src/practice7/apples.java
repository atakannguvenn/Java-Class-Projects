package practice7;

import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.printf("Enter asserted value: ");
		double asse = input.nextDouble();
		input.close();
		double tax_rate = 1.05;
		double taxable = asse * 92 / 100;
		double pro_tax = taxable / 100 * tax_rate;
		
		file g = new file();
		g.openFile();
		g.addRecords(asse, taxable, pro_tax, tax_rate);
		g.closeFile();
	}
}
		