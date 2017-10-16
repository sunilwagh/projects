package dattatreya.jyotish.bhavas.util;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.bhavas.Bhava;

public class BhavasUtil {

	public static Bhava getBhava(Bhava bhava, Chart chart, int atPosition)
	{
		int currentBhavaPosition = 0;
		int resultBhavaPosition = 0;
		
		for (int i=0;i<chart.getBhavas().length;i++)
		{
		if (chart.getBhavas()[i].getName() == bhava.getName())
		{
		    currentBhavaPosition = i;
			break;
		}
		}
		
		resultBhavaPosition = (currentBhavaPosition + atPosition) % 12;
		
		if (resultBhavaPosition < 0) {resultBhavaPosition = 12 + resultBhavaPosition;}
		
		return chart.getBhavas()[resultBhavaPosition];
	}
	
	public static Bhava nextBhava(Bhava bhava, Chart chart, int atPosition)
	{
		return getBhava(bhava,chart,1);
	}
	
	public static Bhava prevBhava(Bhava bhava, Chart chart, int atPosition)
	{
		return getBhava(bhava,chart,-1);
	}
	
	
	
	public static Bhava secondBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,1);
	}
	
	public static Bhava thirdBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,2);
	}
	
	public static Bhava fourthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,3);
	}
	
	public static Bhava fifthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,4);
	}
	
	public static Bhava sixthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,5);
	}
	
	public static Bhava seventhBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,6);
	}
	
	public static Bhava eightBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,7);
	}
	
	public static Bhava ninthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,8);
	}
	
	public static Bhava tenthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,9);
	}
	
	public static Bhava eleventhBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,10);
	}
	
	public static Bhava twelvethBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,11);
	}
	
	
	
}
