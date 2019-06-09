package airplaneTicket;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class apples 
{

	public static void main(String args[]) throws IOException
	{
		/// Reading from file
		Scanner con = new Scanner(System.in);
		FileReader infile= new FileReader("airplaneSeat.txt");
		int ch=infile.read();
		char[][]data = new char[10][6];
		while(ch!= -1)
		{	
			for(int x = 0; x < 10; x++) {
				for(int y = 0; y < 6; y++) {
					data[x][y] = (char)ch;
					ch=infile.read();
				}
			}
		}
		infile.close();
		/// Decision
		while(true) {
			System.out.printf("~~~~~MENU~~~~~~~~\n1. Booking\n2. Change Seat\n3. Cancel Ticket\n4. Exit\n~~~~~~~~\n Select the function: ");
			int decision = con.nextInt();
			if (decision == 1) {
				showSeat(data);
				booking(data);
				WriteToFile(data);
			}
			else if (decision == 2) {
				showSeat(data);
				ChangeSeat(data);
				WriteToFile(data);
			}
			else if (decision == 3) {
				showSeat(data);
				CancelTicket(data);
				WriteToFile(data);
			}
			else if (decision == 4)
				break;
			else {
				System.out.println("Invalid operation!");
			}
		}
		con.close();
	}
	
	public static void booking(char [][]data) {
		@SuppressWarnings("resource")
		Scanner con = new Scanner(System.in);
		int row, column;
		System.out.println("Enter the seat you want(row 1~10, column 1~6):");
		row = con.nextInt();
		column = con.nextInt();
		if (data[row-1][column-1] == '*') {
			data[row-1][column-1] = 'X';
			System.out.println("Booking finish!");
		}
		else
			System.out.println("Seat is not avaliable!");
	}
	
	public static void ChangeSeat(char [][]data) {
		@SuppressWarnings("resource")
		Scanner con = new Scanner(System.in);
		int row, column;
		System.out.println("Enter the seat you want to change(row 1~10, column 1~6):");
		row = con.nextInt();
		column = con.nextInt();
		if (data[row-1][column-1] == '*') {
			System.out.println("That seat is already empty!");
		}
		else {
			data[row-1][column-1] = '*';
			System.out.println("Enter the new seat you want(row 1~10, column 1~6):");
			row = con.nextInt();
			column = con.nextInt();
			if (data[row-1][column-1] == '*') {
				data[row-1][column-1] = 'X';
				System.out.println("Change successful!");
			}
			else {
				System.out.println("That seat is full :(");
			}
		}
	}
	
	public static void CancelTicket(char [][]data) {
		@SuppressWarnings("resource")
		Scanner con = new Scanner(System.in);
		int row, column;
		System.out.println("Enter the seat you want to cancel(row 1~10, column 1~6):");
		row = con.nextInt();
		column = con.nextInt();
		if (data[row-1][column-1] == 'X') {
			data[row-1][column-1] = '*';
			System.out.println("Ticket successfully cancelled!");
		}
		else {
			System.out.println("That seat is already empty");
		}
	}
	
	public static void WriteToFile(char [][]data) throws IOException {
		File output = new File ("airplaneSeat.txt");
		PrintWriter out = new PrintWriter (output);
		for(int x = 0; x < 10; x++) {
			for(int y = 0; y < 6; y++) {
				out.print(data[x][y]);
			}
		}
		out.close();
	}
	public static void showSeat(char [][]data) throws IOException{
		System.out.println("* : Available, X : Occupied.");
		System.out.print ("\t1 2 3 4 5 6\n");
		for(int x = 0; x < 10; x++) {
			System.out.printf("%-7d", x + 1);
			for(int y = 0; y < 6; y++) {
				System.out.printf(" %c", data[x][y]);
			}
			System.out.println();
		}
	}
}
