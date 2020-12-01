package simplePrograms;

import java.util.Scanner;

public class PalindromeString 
{
	public static void main(String[] args) 
	{
		
		Scanner scan = new Scanner(System.in);
		
		String org =scan.next();
		String rev = "";
		
		for(int i = org.length()-1; i>=0; i--)
		{
			char revChar = org.charAt(i);
		
			rev = rev + revChar;
		}
		
		if(org.equals(rev))
		{
			System.out.println("Entered String is a Palindrome.");
		}
		else
		{
			System.out.println("Entered String is NOT a Palindrome.");
		}

	}
}
