package recursion.recursion;

/**
 * Hello world!
 *
 */
public class FactorialApp 
{
	
    
	public static void main( String[] args )
    {
       
		testFactorial();
    }
	
	private static int factorial(int n)
	{
		if (n==0) return 1;
		else
		{
			return n*factorial(n-1);
		}
	}
	
	private static void testFactorial()
	{
		
		System.out.println(factorial(6));
		System.out.println(factorial(1));
		System.out.println(factorial(0));
		
	}
}
