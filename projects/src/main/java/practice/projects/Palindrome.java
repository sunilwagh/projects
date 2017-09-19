package practice.projects;

public class Palindrome {

	public static void main(String[] args)
	{
		System.out.println(palindrome("malayalam"));
	}
	
	public static boolean palindrome(String str)
	{
	    String target = "";
	    
	    //System.out.println(str);
		
	    for (int i = str.length()-1;i>=0;i--)
		{
	    	
			target = target+str.charAt(i);
		}
	    
	    System.out.println(target);
	    if (str.equals(target)) return true;
		return false;
	}
}
