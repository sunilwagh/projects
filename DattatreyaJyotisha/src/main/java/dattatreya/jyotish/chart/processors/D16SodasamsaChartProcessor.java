package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;



@Component("d16SodasamsaChartProcessor")
@Order(value=13)
public final class D16SodasamsaChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d16SodasamsaChart") 
	Chart horoscope;

	
	
	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
		
	}

	public String processChart(Chart d1Chart,Chart d16Chart) {
		if (LagnaUtil.isLagnaAquarius(d16Chart))
		{
			System.out.println ("Some sacrifice in ..");
		}
		
		if (LagnaUtil.isLagnaScorpio(d16Chart))
		{
			System.out.println (".. feel like a burden");
		}
		return null;
		
	}

	

	
}
