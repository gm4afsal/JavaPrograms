package simplePrograms;

import java.util.Scanner;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		
		int count  = 0;
		
		Scanner scan = new Scanner(System.in);
		int number =scan.nextInt();
		
		for(int i=1; i<=number;i++)
		{
			if(number%i==0)
			{
				count = count+1;
			}
			
		}
		
		if(count==2)
		{
			System.out.println(number+" is a prime number.");
		}
		else
		{
			System.out.println(number+" is NOT a prime number.");
		}
		

		

	}
}
