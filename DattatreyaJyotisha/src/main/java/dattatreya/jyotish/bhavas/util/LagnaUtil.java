package dattatreya.jyotish.bhavas.util;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.RashiNames;

public class LagnaUtil {
	
	public static boolean isLagnaAries(Chart chart)
	{
		return isLagna(chart,RashiNames.ARIES);
	}
	
	public static boolean isLagnaTaurus(Chart chart)
	{
		return isLagna(chart,RashiNames.TAURUS);
	}
	
	public static boolean isLagnaGemini(Chart chart)
	{
		return isLagna(chart,RashiNames.GEMINI);
	}
	
	public static boolean isLagnaCancer(Chart chart)
	{
		return isLagna(chart,RashiNames.CANCER);
	}
	
	public static boolean isLagnaLeo(Chart chart)
	{
		return isLagna(chart,RashiNames.LEO);
	}
	
	public static boolean isLagnaVirgo(Chart chart)
	{
		return isLagna(chart,RashiNames.VIRGO);
	}
	
	public static boolean isLagnaLibra(Chart chart)
	{
		return isLagna(chart,RashiNames.LIBRA);
	}
	
	public static boolean isLagnaScorpio(Chart chart)
	{
		return isLagna(chart,RashiNames.SCORPIO);
	}
	
	public static boolean isLagnaSagittarius(Chart chart)
	{
		return isLagna(chart,RashiNames.SAGITTAURIUS);
	}
	
	public static boolean isLagnaCapricorn(Chart chart)
	{
		return isLagna(chart,RashiNames.CAPRICORN);
	}
	
	public static  boolean isLagnaAquarius(Chart chart)
	{
		return isLagna(chart,RashiNames.ACQUARIUS);
	}
	
	public static boolean isLagnaPisces(Chart chart)
	{
		return isLagna(chart,RashiNames.PISCES);
	}

	private static boolean isLagna(Chart chart, RashiNames rashiName) {
		
		if (RashiUtil.findRashiInBhava(chart.getBhavas()[0].getRashi()) == rashiName){return true;}
		else
		{
		return false;
		}
	}

}
