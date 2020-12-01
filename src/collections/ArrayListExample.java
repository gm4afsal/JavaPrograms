package collections;

import java.util.ArrayList;

public class ArrayListExample 
{

	public static void main(String[] args) 
	{
		ArrayList <String> alist = new ArrayList<String>();
		alist.add("10");
		alist.add("20");
		
		for(int i=0;i<alist.size();i++)
		{
			System.out.println("Item is: "+alist.get(i));
		}
	}

}
