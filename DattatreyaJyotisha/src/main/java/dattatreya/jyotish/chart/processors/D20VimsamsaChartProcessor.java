package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;



@Component("d20VimsamsaChartProcessor")
@Order(value=10)
public final class D20VimsamsaChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d20VimsamsaChart") 
	Chart horoscope;

	
	
	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
		
	}

	public String processChart(Chart d1Chart,Chart d20Chart) {
		return null;
		
	}
	

	
}
