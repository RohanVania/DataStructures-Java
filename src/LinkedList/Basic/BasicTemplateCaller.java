package LinkedList.Basic;

public class BasicTemplateCaller {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList l1=new LinkedList();
		Node head=l1.createNode(10);
		Node n1=l1.createNode(12);		
		Node n2=l1.createNode(14);
		Node n3=l1.createNode(19);
		
		head.next=n1;
		n1.next=n2;
		n2.next=n3;
		
		l1.traversal(head);
		
	}

}
