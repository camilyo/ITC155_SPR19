/*
 * Write a modified version of the selection sort algorithm that selects 
 * the largest element each time and moves it to the end of the array, rather
 * than selecting the smallest element and moving it to the beginning. 
 */

import java.util.Arrays;


public class SelectionSort {

	public static void main(String[] args) {
int[] numbers = {2, 5, -2, 4, 42, 3, 12, 21, 45, 67, 1, 66, 24, 90};
		
		selectionSort(numbers);
		
		System.out.println(Arrays.toString(numbers));	

	}
	

	public static void selectionSort(int[] a) {
		for(int i = a.length - 1; i >= 0; i--) {
			//find the biggest element
			int biggest = i;
			for(int j = 0; j < i; j++) {
				if (a[biggest] < a[j]) {
					biggest = j;
				}
			}
			swap(a, i, biggest); // swap the biggest to the back
		}
	}
	//swap a[i] with a[j]
	private static void swap(int[] a, int i, int j) {
		if (i != j) {
			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}
		
	}

}

//Both algorithms have quadratic O(n^2) complexity. Which means that
//the run time are the same.
