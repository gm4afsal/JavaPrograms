package simplePrograms;

import java.util.Scanner;

public class FindDuplicateCharacters 
{

	public static void main(String[] args) 
	{

			String sentence = "tester";
			
			char[] charArray = sentence.toCharArray();
			
			for(int i = 0 ; i<sentence.length() ; i++)
			{
				for(int j = i+1 ; j<sentence.length() ; j++)
				{
					if(charArray[i] == charArray[j])
					{
						
						System.out.println("Duplicate characters are: "+charArray[j]);
						
					}
				}
			}
			
			

	}

}
