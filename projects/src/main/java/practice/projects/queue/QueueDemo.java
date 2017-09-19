package practice.projects.queue;

public class QueueDemo {
	
	public static void main(String[] args)
	{
		Queue queue = new Queue();
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		//queue.dequeue(3);
		System.out.println(queue.toString());
		
	}

	
}
