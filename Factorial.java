package week1.day1;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Goal: Find the Factorial of a given number
		 * 
		 * input: 5
		 * 
		 */	
			// Declare your input as 5
			// Declare an integer variable fact as 1
		// Iterate from 1 to your input (tip: using loop concept)
			// Within the loop: Multiply fact with the iterator variable (Tip: Assign it to the 'fact' variable)
		//End of loop
		// Print factorial (fact)
		
int number = 5;
int fact = 1;
for (int i = 1; i <= number; i++) {
	 fact= fact*i;
}
System.out.println("The Factorial of 5 is " +fact);
	}

}
	