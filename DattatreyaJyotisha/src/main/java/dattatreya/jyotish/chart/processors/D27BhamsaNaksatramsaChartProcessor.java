package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;



@Component("d27BhamsaNaksatramsaChartProcessor")
@Order(value=15)
public final class D27BhamsaNaksatramsaChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d27BhamsaNaksatramsaChart") 
	Chart horoscope;

	
	
	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
		
	}

	public String processChart(Chart d1Chart,Chart d27Chart) {
		if (LagnaUtil.isLagnaAquarius(d27Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d27Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}

	

	
}
