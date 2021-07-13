package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Goal: To find whether a number is a Prime number or not
		 * 
		 * input: 13
		 * output: 13 is a Prime Number
		 */
			// Declare an int Input and assign a value 13
			// Declare a boolean variable flag as false
			// Iterate from 2 to half of the input
				// Divide the input with each for loop variable and check the remainder
				// Set the flag as true when there is no remainder
				// break the iterator
			// Check the flag (Provide a condition)
				// Print 'Prime' when the condition matches
				// Print 'Not a Prime' when the condition doesn't match 

		int i = 13;
		boolean isPrime = false;
		for (int j = 2; j < i / 2; j++) {
			if( i % j == 0);
			isPrime = true;
break;
		}
	
		if (isPrime == true) {
			System.out.println(i +" is Prime Number");

		} else {
			System.out.println(i + " is Not Prime Number");
		}
	
	}
}
