package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;

@Component("d9NavamsaChartProcessor")
@Order(value = 6)
public class D9NavamsaChartProcessor implements ChartProcessor {

	@Autowired
	@Qualifier("d9NavamsaChart")
	Chart horoscope;

	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
	}

	public String processChart(Chart d1Chart,Chart d9Chart) {
		return null;
		
	}

}
