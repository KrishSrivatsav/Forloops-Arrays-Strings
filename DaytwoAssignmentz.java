package week1.day2;

import java.util.Iterator;

public class DaytwoAssignmentz {

	public static void main(String[] args) {
		// 1.) Fibonacciseries....
		
		int range = 8;
		int firstNum = 0;
		int secNum = 1;
		int sum = 0;
		
//		System.out.println(firstNum);
		
		for (int i=1;i<range;i++) 
		{
//			System.out.println(i);
		    sum = firstNum+secNum;
//			System.out.println(sum);
			firstNum = secNum;
//			System.out.println(firstNum);
			secNum = sum;
			System.out.println(sum);
			}
		
		// 2.) Find the Factorial of a given number.
		int input = 5;
		int fact =1;
		for (int j =1;j<=input; j++)
		{
			fact = fact*j;
		}
		System.out.println("Factorial of"+" "+input+" "+"is"+" "+fact);
		}
	
		// 3.) Prime Numbers..
	
	// Declare an int Input and assign a value 13
			// Declare a boolean variable flag as false
			// Iterate from 2 to half of the input
				// Divide the input with each for loop variable and check the remainder
				// Set the flag as true when there is no remainder
				// break the iterator
			// Check the flag (Provide a condition)
				// Print 'Prime' when the condition matches
				// Print 'Not a Prime' when the condition doesn't match 
		int input1 = 13;
		boolean flag = false;
		
	

}
