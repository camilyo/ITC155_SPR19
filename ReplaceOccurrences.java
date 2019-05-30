
/*
 * Write a method called replaceAll that accepts two integer values 
 * as parameters and replaces all occurrences of the first value in the 
 * list with the second value. 
 */

import java.util.LinkedList;
import java.util.Queue;

public class ReplaceOccurrences {

	public static void main(String[] args) {
		removeAll(12, 40);
	}

	public static void removeAll(int value1, int value2) {
		// create an array and add numbers to it
		int[] numbers = { 1, 2, 3, 12, -33, 8, 12 };

		// create a queue to store the numbers from the array
		Queue<Integer> list = new LinkedList<Integer>();

		// loop through the array and add numbers to the queue
		// if the element matches value1, delete from the queue
		// and add value2 in its place
		for (int n : numbers) {
			list.add(n);
			if (n == value1) {
				list.remove(n);
				list.add(value2);
			}

		}
		System.out.println(list.toString());
	}

}
