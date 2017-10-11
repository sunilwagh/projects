package dattatreya.jyotish.chart.processors;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.PositiveStrengthOfGraha;

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
		
		PositiveStrengthOfGraha ps= getLevelForSurya(d1Chart,d9Chart);
		PositiveStrengthOfGraha pc=getLevelForChandra(d1Chart,d9Chart);
		PositiveStrengthOfGraha pm=getLevelForMangal(d1Chart,d9Chart);
		PositiveStrengthOfGraha pb=getLevelForBudha(d1Chart,d9Chart);
		PositiveStrengthOfGraha pg=getLevelForGuru(d1Chart,d9Chart);
		PositiveStrengthOfGraha psk=getLevelForShukra(d1Chart,d9Chart);
		PositiveStrengthOfGraha psh=getLevelForShani(d1Chart,d9Chart);
		PositiveStrengthOfGraha pr=getLevelForRahu(d1Chart,d9Chart);
		PositiveStrengthOfGraha pk=getLevelForKetu(d1Chart,d9Chart);
		System.out.println(" surya "+ps.toString()+" chandra "+pc.toString()+" mangal "+pm+" budha "+pb+" guru "+pg+" shukra "+psk+" shani "+psh);
		return ps.toString()+pc.toString();
		
		
	}

	public PositiveStrengthOfGraha getLevelForSurya(Chart d1Chart,Chart d9Chart){
		
		return getStrengthOfGraha(d9Chart,GrahaNames.SURYA);
		
	}

	private PositiveStrengthOfGraha getStrengthOfGraha(Chart d9Chart, GrahaNames grahaName) {
		Bhava[] bhavas = d9Chart.getBhavas();
		PositiveStrengthOfGraha pg = null;
		for(int i=0;i<bhavas.length;i++)
		{
			if (bhavas[i].getRashi().getGrahas()!=null)
			{
				ArrayList<Graha> grahas = (ArrayList<Graha>) bhavas[i].getRashi().getGrahas();
				
				for (Graha graha:grahas)
				{
					if (graha.getGrahaName() == grahaName)
					{
						pg = GrahaUtil.getGrahaStatus(bhavas[i],graha);
				    }
			    }
		}
		}
		return pg;
	}
	
	public PositiveStrengthOfGraha getLevelForChandra(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.CHANDRA);
	}
	
	public PositiveStrengthOfGraha getLevelForMangal(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.MANGAL);
	}
	
	public PositiveStrengthOfGraha getLevelForBudha(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.BUDHA);
	}
	
	public PositiveStrengthOfGraha getLevelForGuru(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.GURU);
	}
	
	public PositiveStrengthOfGraha getLevelForShukra(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.SHUKRA);
	}
	
	public PositiveStrengthOfGraha getLevelForShani(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.SHANI);
	}
	
	public PositiveStrengthOfGraha getLevelForRahu(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.RAHU);
	}
	
	public PositiveStrengthOfGraha getLevelForKetu(Chart d1Chart,Chart d9Chart){
		return getStrengthOfGraha(d9Chart,GrahaNames.KETU);
	}
	
	
}
