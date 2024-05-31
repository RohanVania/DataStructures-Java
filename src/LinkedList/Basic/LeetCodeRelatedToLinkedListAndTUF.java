package LinkedList.Basic;

/*
 *  1. Reverse a Doubly Linked List  => 3 Approach als, a stack approach I have not implemented because it takes space
 *     
 *   
 * 
 */


class Problems{
	int data=1;
	/*
	 *    Approach 1: Head node is given, traverse and find the last node,
	 * 	   Swap the data between mover node, which is at head during the first time and
	 *     end node and move mover to forward and end to backward, do this until mover and end not equal && mover has not crossed end
	 *     i.e mover!end && mover.prev!=end
	 *     
	 *     If using count i=1 and j equal to times the mover moved for the end node and do same till i<j
	 *     (This approach is good but TC is O(2n) 
	 *   
	 * (Optimal)  	Approach 2:  Just swap the next and prev address of the currrent node and move forward and in the end return the last node as the head
	 *   			IMP  return temp.prev;
	 *
	 */
	
	
	//Approach 1: Without Counter
	public static DLNode ReverseDoublyLinkedList(DLNode head) {
		if (head == null || head.forward == null) // Check if the list is empty or has only one node
	        return head;

	    DLNode start = head;
	    DLNode end = head;

	    // Move 'end' to the last node
	    while (end.forward != null) {
	        end = end.forward;
	    }

	    while (start != end && start.backward != end) {
	        // Swap data
	        int temp = start.data;
	        start.data = end.data;
	        end.data = temp;

	        // Move pointers
	        start = start.forward;
	        end = end.backward;
	    }

	    return head;
	}

	//Approach 1: With Counter
	public static DLNode ReverseDoublyLinkedListWithCounter(DLNode head) {
		DLNode mover=head;
	    int c=1;
	    while(mover!=null && mover.forward!=null){
	        mover=mover.backward;
	        c++;
	        
	    }
	    
	    DLNode end=mover;
	    mover=head;
	    int j=c;
	    int i=1;
	    
	    while(i<j){
	        int temp=mover.data;
	        mover.data=end.data;
	        end.data=temp;
	        mover=mover.forward;
	        end=end.backward;
	        i++;
	        j--;
	    }
	    
	    return head;
	    
	}
	
	//Approach 2: Optimal
	public static DLNode ReverseDoublyLinkedListOptimal(DLNode head) {
		  if (head == null || head.forward == null) // Check if the list is empty or has only one node
		        return head;
		        
		  DLNode mover=head;
		  DLNode temp=null;
		     while(mover!=null  ){
		        temp=mover.backward;
		        mover.backward=mover.forward;
		        mover.forward=temp;
		        mover=mover.backward;
		     }
		     
		    return temp.backward;
		    		
	}
}




public class LeetCodeRelatedToLinkedListAndTUF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
