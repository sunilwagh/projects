package dattatreya.jyotish.bhavas.util;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.bhavas.Bhava;

public class BhavasUtil {

	public Bhava getBhava(Bhava bhava, Chart chart, int atPosition)
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
		
		resultBhavaPosition = (currentBhavaPosition + atPosition) % 11;
		
		if (resultBhavaPosition < 0) {resultBhavaPosition = 12 + resultBhavaPosition;}
		
		return chart.getBhavas()[resultBhavaPosition];
	}
	
	public Bhava nextBhava(Bhava bhava, Chart chart, int atPosition)
	{
		return getBhava(bhava,chart,1);
	}
	
	public Bhava prevBhava(Bhava bhava, Chart chart, int atPosition)
	{
		return getBhava(bhava,chart,-1);
	}
	
	
	
	public Bhava secondBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,2);
	}
	
	public Bhava thirdBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,3);
	}
	
	public Bhava fourthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,4);
	}
	
	public Bhava fifthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,5);
	}
	
	public Bhava sixthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,6);
	}
	
	public Bhava seventhBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,7);
	}
	
	public Bhava eightBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,8);
	}
	
	public Bhava ninthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,9);
	}
	
	public Bhava tenthBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,10);
	}
	
	public Bhava eleventhBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,11);
	}
	
	public Bhava twelvethBhavaFrom(Bhava bhava, Chart chart)
	{
		return getBhava(bhava,chart,12);
	}
	
	
	
}
