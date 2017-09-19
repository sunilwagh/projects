package practice.projects.queue;

public class Queue<T> {

	private static class QueueNode<T> {
		T data;
		QueueNode<T> next;

		private QueueNode(T input) {
			data = input;
		}

	}

	QueueNode head;
	QueueNode tail;

	public <T> void enqueue(T data) {
		QueueNode<T> queueNode = new QueueNode<T>(data);

		if (tail != null) {
			tail.next = queueNode;
		}

		tail = queueNode;

		if (head == null) {
			head = tail;
		}
	}

	public <T> void dequeue(T data) {
		if (head != null)
		{
			data = (T) head.data;
		}
		
		head = head.next;
		
		if (tail == null) {tail =head;}
		
	}

	public <T> T poll(T data) {
		T data1 = (T) head.data;
		return data1;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		QueueNode<T> queueNode = head;

		while (queueNode != null) {
			sb.append(queueNode.data+"\n");
			queueNode = queueNode.next;
		}

		return sb.toString();
	}
}
