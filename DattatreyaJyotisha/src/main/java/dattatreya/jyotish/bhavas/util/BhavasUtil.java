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
}
