package practice.projects.stack;

public class StackDemo {
	
	public static void main(String[] args)
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		System.out.println("Pop "+stack.pop()+"\n");
		System.out.println("Peek "+stack.peek()+"\n");
		
		System.out.println("Print Stack: \n"+stack.toString());
	}

}
