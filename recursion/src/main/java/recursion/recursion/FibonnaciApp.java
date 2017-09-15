package recursion.recursion;

/**
 * Hello world!
 *
 */
public class FibonnaciApp 
{
	
    public static void main(String[] args)
    {
    	int n=15;
    	
    	int i=0;
    	while (i<15)
    	{
    		System.out.println(fibonacci(i));
    		i++;
    	}
    	
    }
	
	public static int fibonacci(int n)
	{

		if (n==0) return 0;
		else if (n <= 2) return 1;
		else
		{
			return fibonacci(n-1)+fibonacci(n-2);
		}
		
		
	}
	
}
