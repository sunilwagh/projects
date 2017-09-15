package binary.binary;

public class LinkedList {
	
	private Node head;
	
	
	
	public void insert(int data)
	{
		
		Node insertNode = new Node(data);
		insertNode.setNextNode(this.head);
		this.head = insertNode;
		
	}



	public Node getHead() {
		return head;
	}



	public void setHead(Node head) {
		this.head = head;
	}
	
	
	
	
}
