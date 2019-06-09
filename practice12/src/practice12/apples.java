package practice12;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class apples {
	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File ("C:\\Users\\user\\Desktop\\data.txt");
		Scanner scan = new Scanner(inFile);
		double[]data = new double[10];
		int counter = 0;
		double middle;
		while(scan.hasNext()) {
			data[counter] = scan.nextDouble();
			counter++;
		}
		scan.close();
		middle = counter / 2.0;
		for(int x = 0; x < counter; x++) {
			System.out.printf("Data %d is = %.2f\n", x + 1 , data[x]);
		
		}
		if(middle % 1 == 0) {
			System.out.printf("%.2f\n", (data[(int)middle - 1] + data[(int)middle]) / 2);
		}
		else {
			System.out.printf("Middle is = %.2f\n", data[(int)middle]);
		}
	}

}
