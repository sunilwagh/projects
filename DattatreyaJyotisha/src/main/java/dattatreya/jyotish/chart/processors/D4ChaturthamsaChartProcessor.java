package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;

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

	public String processChart(Chart d1Chart,Chart d4Chart) {
		if (LagnaUtil.isLagnaAquarius(d4Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d4Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}

	
	
	

}
