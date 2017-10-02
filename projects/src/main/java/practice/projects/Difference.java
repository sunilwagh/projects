package practice.projects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Difference
{
     
 
    public static void printDifferenceXPairs(ArrayList<Integer> numbers,int diff)
    {
        
        boolean[] binaryMap = new boolean[numbers.size()];
 
        for (int i=0; i<numbers.size(); ++i)
        {
            int temp = numbers.get(i)+diff;
 
            
            if (temp>=0 && binaryMap[temp])
            {
                System.out.println("(" + numbers.get(i) +", "+temp+")");
            }
            binaryMap[numbers.get(i)] = true;
        }
    }
 
    
    public static void main (String[] args)
    {
    	int X = 5;
    	ArrayList<Integer> numbers = new ArrayList<Integer>(
    		    Arrays.asList(1, 6, 45, 7, 40, 2));
    	
    	Collections.sort(numbers,Collections.reverseOrder());
        
    	printDifferenceXPairs(numbers,X);
    }
}
