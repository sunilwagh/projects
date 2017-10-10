package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;



@Component("d30TrimsamsaChartProcessor")
@Order(value=13)
public final class D30TrimsamsaChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d30TrimsamsaChart") 
	Chart horoscope;

	
	
	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
		
	}

	public String processChart(Chart chart) {

		return null;

	}

	

	
}
