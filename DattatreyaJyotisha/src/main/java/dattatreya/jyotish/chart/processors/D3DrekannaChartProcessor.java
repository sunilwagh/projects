package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;


@Component("d3DrekannaChartProcessor")
@Order(value=3)
public class D3DrekannaChartProcessor implements ChartProcessor{
	
	@Autowired
	@Qualifier("d3DrekannaChart") 
	Chart horoscope;

	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
	}

	public String processChart(Chart d1Chart,Chart d3Chart) {
		
		if (LagnaUtil.isLagnaAquarius(d3Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d3Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}

}
