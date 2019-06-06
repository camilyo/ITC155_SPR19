public class LinkedIntList {

	private ListNode front; // first value in the list
	
	// check if the list id sorted (nondecreasing)
	public boolean isSorted() {
		
	    if(front == null)
	        return true;
	        
	    ListNode prev = front;
	    ListNode current = prev.next;
	    
	    while(current != null) {
	        if(prev.data > current.data)
	            return false;
	            
	        prev = current;
	        current = prev.next;
	    }
	    
	    return true;
	}
	
	// append a value to the end of the list
		public void add(int value) {
			if (front == null) {
				front = new ListNode(value);
			} else {
				ListNode current = front;
				while (current.next != null) {
					current = current.next;
				}
				current.next = new ListNode(value);
			}
		}
	
		
		//return a reference to the node at a given index
		private ListNode nodeAt(int index) {
			ListNode current = front;
			for(int i = 0; i < index; i++) {
				current = current.next;
			}
			return current;
		}
		
		//insert a value at a specified index 
		public void add(int index, int value) {
			if(index == 0) {
				front = new ListNode(value, front);
			}else {
				ListNode current = nodeAt(index - 1);
				current.next = new ListNode(value,current.next);
			}
		}

}
