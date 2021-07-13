package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Goal: To find Fibonacci Series for a given range
		 */

			// initialize 3 int variables (Tip: range = 8, firstNum = 0, secNum = 1, sum in the series)
			// Print first number
			// Iterate from 1 to the range
			// add first and second number assign to sum
			// Assign second number to the first number
			// Assign sum to the second number
			// print sum

		int  range = 8, firstNum = 0, secNum = 1;
				System.out.println("The fibonacci series are:");
			System.out.println(firstNum);
			
		for (int i = 1; i < range-1; i++) {
			 int sum = firstNum + secNum;
			firstNum = secNum;	
			secNum = sum;
		
		System.out.println(sum);
			
		}
		
	}

}
