package dattatreya.jyotish.analyze.bhavas;

public interface ChartProcessor {
	
	public String processChart(Chart chart);
	
	public Chart getHoroscope();

	public void setHoroscope(Chart horoscope);
}
