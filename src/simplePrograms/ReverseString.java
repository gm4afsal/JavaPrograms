package simplePrograms;

import java.util.Scanner;

public class ReverseString 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		String toRev =scan.next();
		
		for(int i = toRev.length()-1; i>=0; i--)
		{
			char res = toRev.charAt(i);
			System.out.print(res);
		}

		

	}
}
