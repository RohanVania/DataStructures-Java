package LinkedList.Basic;

class DLNode{
	
	int data;
	DLNode forward;
	DLNode backward;
	
	public DLNode(int data) {
		this.data=data;
		}
	
	public DLNode (int data,DLNode forward,DLNode backward) {
		this.data=data;
		this.forward=forward;
		this.backward=backward;
	}
	
	public DLNode(int data,DLNode forward) {
		this.data=data;
		this.forward=forward;
	}
	
}


public class DoublyLinkedList {
	

	//Convert Array to DLL
	public  static DLNode  convertArraytoDll(int [] ar,DLNode head) {
		
		DLNode temp=head;
		
		for (int i=1;i<ar.length;i++) {
			DLNode node=new DLNode(ar[i]);
			temp.forward=node;
			node.backward=temp;
			temp=temp.forward;
		}
		return head;
		
	}
	
	// Traversal
	public static  void DLLTraversal(DLNode head) {
		DLNode mover=head;
		if(head==null) {
			System.out.println("Empty Doubly LinkedList");
		}
		while(mover!=null) {
			if(mover.forward==null) {
				System.out.print(mover.data+"\n");
				break;
			}
			System.out.print(mover.data +"=>");
			mover=mover.forward;
		}
			
		
	}
	
	//Insert at End
	public static void insertAtEnd(DLNode head,int data) {
		DLNode mover=head;
		while(mover.forward!=null) {
			mover=mover.forward;
		}
		
		DLNode n=new DLNode(data);
		mover.forward=n;
		n.backward=mover;
		
		
	}
	
	// Insert at start
	public static DLNode insertAtStart(int data,DLNode head ) {
		if(head==null) {
			DLNode n=new DLNode(data);
			return n;
		}
		
		DLNode n=new DLNode(data);
		n.forward=head;
		head.backward=n;
		head=n;
		return head;
	
	}
	
	// Insert at kth Position
	public static DLNode insertAtKPosition(int data,int k,DLNode head) {
		DLNode node=new DLNode(data);
		if(head==null) {
			return node;
		}
		 DLNode mover=head;
		 
		 if(k==0) {
			 node.forward=mover;
			 mover.backward=node;
			 return node;
		 }
		 
		 
		 for(int i=0;i<k;i++) {
			if(mover.forward==null) {
				node.backward=mover;
				mover.forward=node;
				return head;
			}
			 mover=mover.forward;				
				 
		 }
		 

		 mover.backward.forward=node;
		 node.forward=mover;
		 node.backward=mover.backward;
		 mover.backward=node;
		return head;
			 
		
	}
	
	// Delete Node at Start
	public static DLNode deleteAtStart(DLNode head) {
		
		DLNode mover=head;
		mover=mover.forward;
		mover.backward=null;
		return mover;
	
	}
	
	// Delete Node at End
	public  static void deletAtEnd(DLNode head) {
	
		DLNode mover=head;
		while(mover!=null && mover.forward!=null) {
			mover=mover.forward;
		}
		mover.backward.forward=null;
		
	}
	
	
	
	
	public static void main(String args []) {
		int []ar= {5,92,10,23,19,1023,1923};

		DLNode head=new DLNode(ar[0]);
		
		DLNode headNode=convertArraytoDll(ar,head);
		DLLTraversal(head);

	}
	
}
