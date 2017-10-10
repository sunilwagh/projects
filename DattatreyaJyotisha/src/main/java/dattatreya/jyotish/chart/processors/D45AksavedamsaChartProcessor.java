package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.horoscope.D9NavamsaChart;

@Component("d45AksavedamsaChartProcessor")
@Order(value = 15)
public class D45AksavedamsaChartProcessor implements ChartProcessor {

	@Autowired
	@Qualifier("d45AksavedamsaChart")
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
