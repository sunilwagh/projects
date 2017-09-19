package practice.projects.stack;

public class Stack {

	private static class StackNode<T> {

		private StackNode<T> next;
		private T data;

		private StackNode(T data) {
			this.data = data;
		}

	}

	private StackNode top;

	public <T> void push(T data) {
		StackNode<T> stackElement = new StackNode<T>(data);
		stackElement.next = top;
		top = stackElement;
	}

	public <T> T pop() {
		T data = (T) top.data;
		top = top.next;
		return data;
	}

	public <T> T peek() {
		T data = (T) top.data;
		return data;
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		StackNode iterator=top;
		
		while (iterator != null)
		{
			sb.append(iterator.data+"\n");
			iterator = iterator.next;
		}
		
		return sb.toString();
	}

}
