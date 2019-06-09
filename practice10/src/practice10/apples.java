package practice10;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class apples {

	public static void main(String[] args) throws FileNotFoundException {
		File inFile = new File ("grade.txt");
		Scanner scan = new Scanner(inFile);
		File output1 = new File ("C:\\Users\\user\\Desktop\\output1.txt");
		PrintWriter out1 = new PrintWriter (output1);
		File output2 = new File ("C:\\Users\\user\\Desktop\\output2.txt");
		PrintWriter out2 = new PrintWriter (output2);
		File output3 = new File ("C:\\Users\\user\\Desktop\\output3.txt");
		PrintWriter out3 = new PrintWriter (output3);
		out1.printf("ClassNo \t Firstname \t Lastname \t Total \t Average \t Rank%n");
		out2.printf("ClassNo \t Firstname \t Lastname \t Total \t Average \t Rank%n");
		out3.printf("ClassNo \t Firstname \t Lastname \t Total \t Average \t Rank%n");
		int a = 0, b = 0, c = 0;
		
		while(scan.hasNext()) {
			int classno = scan.nextInt();
			@SuppressWarnings("unused")
			int student_no = scan.nextInt();
			String first_name = scan.next();
			String last_name = scan.next();
			int grade1 = scan.nextInt();
			int grade2 = scan.nextInt();
			int grade3 = scan.nextInt();
			int grade4 = scan.nextInt();
			int total = grade1 + grade2 + grade3 + grade4;
			float ave = (float)(total) / 4;
			String grade;
			if (ave >= 90) {
				grade = "A";
			}
			else if (ave >= 80 && ave < 90) {
				grade = "B";
			}
			else if (ave >= 70 && ave < 80) {
				grade = "C";
			}
			else if (ave >= 60 && ave < 70) {
				grade = "D";
			}
			else {
				grade = "F";
			}
			if (classno == 101) {
				out1.printf("%-17d%-17s %-15s%-8d%-15.2f%s%n", classno, first_name, last_name, total, ave, grade);
				a++;
			}
			else if (classno == 102) {
				out2.printf("%-17d%-17s %-15s%-8d%-15.2f%s%n", classno, first_name, last_name, total, ave, grade);
				b++;
			}
			else {
				out3.printf("%-17d%-17s %-15s%-8d%-15.2f%s%n", classno, first_name, last_name, total, ave, grade);
				c++;
			}
		}
		
		out1.printf("Count of students is : %d", a);
		out2.printf("Count of students is : %d", b);
		out3.printf("Count of students is : %d", c);
		
		out1.close();
		out2.close();
		out3.close();
		scan.close();
	}
}
