/*
 *  Write a method called isSorted that returns true if the list is in 
 *  sorted (nondecreasing) order and returns false otherwise. An empty
 *  list is considered to be sorted.
 */

public class Client {

	public static void main(String[] args) {
		
LinkedIntList list = new LinkedIntList();

//		list.add(1);
//		list.add(2);
//		list.add(4);
//		list.add(7);
//		list.add(9);
		
		list.add(1);
		list.add(2);
		list.add(0);
		list.add(7);
		list.add(9);
		
		
		
		System.out.println(list.isSorted());

	}


}
