package dattatreya.jyotish.chart.processors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.util.LagnaUtil;


@Component("d10DasamsaChartProcessor")
@Order(value=7)
public class D10DasamsaChartProcessor implements ChartProcessor{
	
	@Autowired
	@Qualifier("d10DasamsaChart") 
	Chart horoscope;

	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
	}

	public String processChart(Chart d1Chart,Chart d10Chart) {
		
		if (LagnaUtil.isLagnaAquarius(d10Chart))
		{
			System.out.println ("Some sacrifice in career");
		}
		
		if (LagnaUtil.isLagnaScorpio(d10Chart))
		{
			System.out.println ("Career feel like a burden");
		}
		return null;
		
	}
}
