package practice14;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
public class apples 
{

	public static void main(String args[]) throws IOException
	{
		Scanner con = new Scanner(System.in);
		FileReader infile= new FileReader("C:\\Users\\user\\Desktop\\airplaneSeat.txt");
		int ch=infile.read();
		int decision;
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
		while(true) {
			System.out.println("1 to show the seets 2 to book");
			decision = con.nextInt();
			if (decision == 1)
				showSeat(data);
			else if (decision == 2) {
				booking(data);
				File output = new File ("C:\\Users\\user\\Desktop\\airplaneSeat.txt");
				PrintWriter out = new PrintWriter (output);
				for(int x = 0; x < 10; x++) {
					for(int y = 0; y < 6; y++) {
						out.print(data[x][y]);
					}
				}
				out.close();
			}
			else
				break;
		}
		
	}
	
	public static void booking(char [][]data) {
		Scanner con = new Scanner(System.in);
		int row, column;
		System.out.println("\nEnter the seat you want(row 1~10, column 1~6):");
		row = con.nextInt();
		column = con.nextInt();
		if (data[row-1][column-1] == '*') {
			data[row-1][column-1] = 'X';
			System.out.println("Booking finish!");
		}
		else
			System.out.println("Seat is not avaliable!");
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
