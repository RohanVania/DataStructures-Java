package LinkedList.Basic;

class Node{
	int data;
	Node next;
	public Node(int data) {
		this.data=data;
	}
	public Node(int data,Node next) {
		this.data=data;
		this.next=next;
	}
}

public class LinkedList {
	
	public void traversal(Node head) {
		Node temp=head;
		while(temp!=null) {
			
			if(temp.next!=null) {
				System.out.print(temp.data + "=>");					
			}else {
				System.out.print(temp.data);
			}
			temp=temp.next;
		}
		System.out.println();
		
	}

	
	public Node createNode(int data) {
			Node n=new Node(data);
			return n;
	}
	
	
	
}


