package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;


@Component("d2HoraChartProcessor")
@Order(value=2)
public class D2HoraChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d2HoraChart") 
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
	
	public String processChart(Chart d1Chart,Chart d2Chart) {
		if (LagnaUtil.isLagnaAquarius(d2Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d2Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}
}
