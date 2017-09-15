package recursion.recursion;

public class TailRecursion {

	public static void main(String[] args) {
          System.out.println(factorial(6));
	}

	
	public static int factorial(int x) {
	    return tailFactorial(x, 1);
	}
	
	public static int tailFactorial(int mynumber, int result) {
		if (mynumber == 1) {
			return result;
		} else {
			return tailFactorial(mynumber-1, result * mynumber);
		}
	}
}
