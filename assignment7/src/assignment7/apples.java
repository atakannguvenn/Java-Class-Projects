package assignment7;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class apples
{

public static void main(String[] args) throws FileNotFoundException
{
	FileReader a = new FileReader("Ex14Input.txt");
	Scanner inFile = new Scanner(a);
        
		int num1, num2;

num1  = inFile.nextInt ();
num2  = inFile.nextInt();
      		System.out.println("Sum = "+ (num1 + num2));

       		inFile.close();
}
}
