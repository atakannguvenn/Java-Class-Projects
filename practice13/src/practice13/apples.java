package practice13;
import java.io.*;
public class apples 
{

	public static void main(String args[]) throws IOException
	{
		FileReader infile= new FileReader("Egypt.txt");
		int ch=infile.read();
		Boolean first = true;
		int line=1,low=0,upper=0,digit=0,white=0,other=0;
		while(ch!= -1)
		{
			if (first)
			{
				System.out.print(line+"- ");
				first= false;
				line++;
				
			}
			if ((char)ch=='\n')
			{
				first= true;
			}
			System.out.print((char)ch);
			if (Character.isLowerCase((char)ch))
			{
				low++;
			}
			else if(Character.isUpperCase((char)ch))
			{
				upper++;
			}
			else if(Character.isDigit(ch))
			{
				digit++;
			}
			else if(Character.isWhitespace(ch))
			{
				if((char)ch != '\n')
					white++;
			}
			else
			{
				other++;
			}	
			ch=infile.read();
		}
		System.out.println("\n**********************************************");
		System.out.println("LINE COUNT :"+(line-1));
		System.out.println("WORD COUNT :"+(white+1));
		System.out.println("DIGIT COUNT :"+digit);
		System.out.println("UPPER LETTERS :"+upper);
		System.out.println("LOWER LETTERS :"+low);
		System.out.println("OTHER MARKS :"+other);
		infile.close();
	}
}
