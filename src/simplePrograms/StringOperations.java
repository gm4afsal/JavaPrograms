package simplePrograms;

public class StringOperations {

	public static void main(String[] args) 
	{
		String s1 = "   This is us   ";
		
		
// .trim()
		
		System.out.println("Trim omits trailing and leading spaces: "+s1.trim());
		
//indexOf and lastIndexOf
	
		String s2 = "this is index of example";
		int indexOf = s2.indexOf('s');
		System.out.println("Returns FIRSR index of 's' char value : "+indexOf);
		
		int lastIndexOf = s2.lastIndexOf('s');
		System.out.println("Returns LAST index of 's' char value : "+lastIndexOf);
		
// Split with regex
		
		String s3="java string split method";  

		String words[] = s3.split("\\s");  //splits the string based on whitespace
		
		for(String w:words)
		{
			System.out.println("Split is: "+w);
		}
	
// Split with regex and length
		
		String s4="regex one string split method"; 
		
		String words1[] = s4.split("e",3);  //Output will be split into 3 based on first 3 occurrences of 'e'
		
		for(String w1:words1)
		{
			System.out.println("Answer is: "+w1);
		}
		
		
//Replace one char with another
		
			String s5 = "Salesforce is a very good website";			
			String newS5 = s5.replace('a', 'y');
			System.out.println(newS5);
			
//Replace String
			
			String s6 = "Salesforce is a very good website";
			String newS6 = s6.replace("Salesforce", "Fusion");
			System.out.println(newS6);
			
//Remove all the occurrences of white spaces.
			
			String s7 = "Salesforce is a very good website ";
			String newS7 = s7.replace(" ","");
			System.out.println(newS7);
			
//SubString
			
			String s8="javatTuT";  
			System.out.println(s8.substring(1,5));//returns avat  //start index is included, end index is not included in the output  
			System.out.println(s8.substring(2));//returns vatTuT  
			

	}
	
}
