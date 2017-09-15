package binary.binary;

public class Node {
	
	private final int data;
	private Node nextNode;
	
	Node(int data)
	{
		this.data=data;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}

	public int getData() {
		return data;
	}
	
	@Override
	public String toString()
	{
		return "Data "+this.data;
	}
	
	
	

}
