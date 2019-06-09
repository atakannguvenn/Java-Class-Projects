package practice11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class apples {
	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File ("C:\\Users\\user\\Desktop\\sale.txt");
		Scanner scan = new Scanner(inFile);
		String region;
		String printing = "Amount: $";
		String[] names = {"AUS", "Korea", "Taiwan", "Japan", "Europe"};
		double[]total = {0, 0, 0, 0, 0}, pamount = {0, 0, 0, 0, 0}, percentage = {0, 0, 0, 0, 0};
		double unitPrice = 0, unit = 0, all_total = 0;
		
		while(scan.hasNext()) {
			
			region = scan.next();
			
			if (region.equals("AUS")) {
				unitPrice = scan.nextDouble();
				unit = scan.nextDouble();
				total[0] = total[0] + unit;
				pamount[0] = pamount[0] + unitPrice * unit;
			}
			else if (region.equals("Korea")) {
				unitPrice = scan.nextDouble();
				unit = scan.nextDouble();
				total[1] = total[1] + unit;
				pamount[1] = pamount[1] + unitPrice * unit;
			}
			
			else if (region.equals("Taiwan")) {
				unitPrice = scan.nextDouble();
				unit = scan.nextDouble();
				total[2] = total[2] + unit;
				pamount[2] = pamount[2] + unitPrice * unit;
			}
			
			else if (region.equals("Japan")) {
				unitPrice = scan.nextDouble();
				unit = scan.nextDouble();
				total[3] = total[3] + unit;
				pamount[3] = pamount[3] + unitPrice * unit;
			}
			else if (region.equals("Europe")) {
				unitPrice = scan.nextDouble();
				unit = scan.nextDouble();
				total[4] = total[4] + unit;
				pamount[4] = pamount[4] + unitPrice * unit;
			}
		scan.close();
		}
		for (int x = 0; x < 5; x++) {
			all_total += pamount[x];
		}
		for (int x = 0; x < 5; x++) {
			percentage[x] = pamount[x] / all_total * 100;
		}
		System.out.printf("The Profit of 2017\n-----------------------------------------------------------------------\n");
		for (int x = 0; x < 5; x++) {
			System.out.printf("%-10s  %5.2f%%  ", names[x], percentage[x]);
			for (int y = 0; y < percentage[x]; y++) {
				System.out.printf("¢e");
			}
			System.out.printf("%20s%-20.1f\n", printing, pamount[x]);
		}
	}
}
