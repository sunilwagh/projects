package dattatreya.jyotish.analyze.bhavas;

public interface ChartProcessor {
	

	public String processChart(Chart d1Chart,Chart divChart);
	public Chart getHoroscope();
    public void setHoroscope(Chart horoscope);
    
}
