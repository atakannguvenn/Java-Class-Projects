package assignment3;

import java.util.Random;
import java.util.Scanner;

public class apples {

	public static void main(String[] args) {
		Random rand = new Random();
		int students[][] = new int [3][100];
		double average[] = new double[100];
		double average_exam[] = new double[3];
		double grade_sum[] = new double[100];
		Scanner input = new Scanner(System.in);
		System.out.println("How many students? (Max 100)");
		int student_no = input.nextInt();
		input.close();
		int i = 0;
		System.out.println("No\tCourse 1\tCourse 2\tCourse 3\tAverage");
		System.out.println("----------------------------------------------------------------");
		for (int x = 0; x < student_no; x++) {
		System.out.printf("%2d\t", x + 1);
			for (int y = 0; y < 3; y++) {
			students[y][x] = rand.nextInt(60) + 41;
			grade_sum[i] += students[y][x]; 
			System.out.printf("%3d\t\t", students[y][x]);
			}
		average[i] = grade_sum[i] / 3;
		System.out.printf("%.2f", average[i]);
		i++;
		System.out.printf("\n");
		}
		System.out.printf("----------------------------------------------------------------\nAverage");
		for (int y = 0; y < 3; y++) {
			for (int x = 0; x < student_no; x++) {
				average_exam[y] += students[y][x];
			}
		average_exam[y] = average_exam[y] / student_no;
		System.out.printf("\t%.2f\t", average_exam[y]);
		}
	}
}
