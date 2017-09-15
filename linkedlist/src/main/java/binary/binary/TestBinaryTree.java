package binary.binary;

public class TestBinaryTree {

	public static void main(String args[]) {
		LinkedList bt = createLinkedList();
		print(bt);
	}

	private static void print(LinkedList bt) {
		
		Node curr=bt.getHead();
		while(curr != null)
		{
			System.out.println("{"+curr.getData()+"}->");
			curr=curr.getNextNode();
		}

	}

	private static LinkedList createLinkedList() {
		LinkedList bt = new LinkedList();
		bt.insert(1);
		bt.insert(2);
		bt.insert(3);
		bt.insert(4);
		bt.insert(5);
		bt.insert(6);
		return bt;

	}
}
