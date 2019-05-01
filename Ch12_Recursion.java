/*
 * write a method called writeNums that takes an integer n as a parameter and 
 * prints to the console the first n integers starting with 1 in sequential order,
 * separated by commas
 */

public class Ch12_Recursion {


	public static void main(String[] args) {
		
		//call method passing a value that is less than 1
			//writeNums(0);
		
		//call method passing a positive value bigger than 1
			writeNums(12);
		
	}
	
	public static void writeNums(int n) {
		
		//if the value passed is less than 1, throw an IllegalArgumentException 
		if (n < 1) {
	        throw new IllegalArgumentException ("n can't be a value less than 1");
	    }
		//if n equals 1, print the value of n
		else if( n == 1) {
			System.out.print(n);
		//recursive case
		}else { 
			writeNums(n - 1);
			System.out.print(", " + n);
		}
	
	}	
		
}
	
	


