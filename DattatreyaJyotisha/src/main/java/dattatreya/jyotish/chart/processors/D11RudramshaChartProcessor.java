package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;
import dattatreya.jyotish.horoscope.D9NavamsaChart;

@Component("d11RudramshaChartProcessor")
@Order(value=11)
public class D11RudramshaChartProcessor implements ChartProcessor{
	
	@Autowired
	@Qualifier("d11RudramsaChart") 
	Chart horoscope;

	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
	}

	public String processChart(Chart d1Chart,Chart d5Chart) {
		if (LagnaUtil.isLagnaAquarius(d5Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d5Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}
}
