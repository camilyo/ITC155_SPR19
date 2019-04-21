import java.util.*;


public class IntegerList {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(13);
		list.add(47);
		list.add(47);
		list.add(47);
		list.add(15);
		list.add(9);
		list.add(9);
		
		System.out.println(countUnique(list));
		
	}
	
	public static int countUnique(List<Integer> list) {
	   
		HashSet<Integer> numbers = new HashSet<Integer>();

	    for(int n : list)
	        numbers.add(n);		
	    		
	    return numbers.size();
	    
	   
			
	}
	
	

}
