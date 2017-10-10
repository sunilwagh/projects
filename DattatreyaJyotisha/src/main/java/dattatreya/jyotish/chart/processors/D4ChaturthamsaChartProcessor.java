package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;

@Component("d4ChaturthamsaChartProcessor")
@Order(value=4)
public class D4ChaturthamsaChartProcessor implements ChartProcessor{
	
	@Autowired
	@Qualifier("d4ChaturthamsaChart") 
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
