package practice7;

import java.util.Formatter;

public class file {
	private Formatter x;
	
	public void openFile() {
		try {
			x = new Formatter ("data.txt");
		}
		catch(Exception e) {
			System.out.println("you have an error");
		}
	}
	
	public void addRecords(double a, double b, double c, double d) {
		x.format("%-27s$%10.2f%n", "Assested value:", a);
		x.format("%-27s$%10.2f%n", "Taxable amount:", b);
		x.format("%-27s$%10.2f%n", "Tax Rate for each $100.00:", d);
		x.format("%-27s$%10.2f%n", "Property tax:", c);
	}
	
	public void closeFile() {
		x.close();
	}
}
