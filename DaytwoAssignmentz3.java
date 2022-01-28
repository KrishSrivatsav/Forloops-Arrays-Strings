package week1.day2;

public class DaytwoAssignmentz3 {

	public static void main(String[] args) {
		//Build a logic to find the given string is palindrome or not
	     
		/*
		 * Pseudo Code
		
		 * a) Declare A String value as"madam"
		 
		 * b) Declare another String rev value as ""
		 * c) Iterate over the String in reverse order
		 * d) Add the char into rev
		 * e) Compare the original String with the reversed String, if it is same then print palinDrome*/ 
		 
		String name ="madam";
		String rev="";
		int length =name.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+name.charAt(i);
			if (rev.equals(name))
			{
				System.out.println("palindrome");
			}
		}
	}

}
