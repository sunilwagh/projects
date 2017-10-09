package dattatreya.jyotish.analyze.bhavas.bhava11.labha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.analyze.bhavas.HouseLordPlacedInBhava;
import dattatreya.jyotish.analyze.bhavas.RashiInBhava;
import dattatreya.jyotish.bhavas.Bhava1;
import dattatreya.jyotish.bhavas.Bhava10;
import dattatreya.jyotish.bhavas.Bhava11;
import dattatreya.jyotish.bhavas.Bhava12;
import dattatreya.jyotish.bhavas.Bhava2;
import dattatreya.jyotish.bhavas.Bhava3;
import dattatreya.jyotish.bhavas.Bhava4;
import dattatreya.jyotish.bhavas.Bhava5;
import dattatreya.jyotish.bhavas.Bhava6;
import dattatreya.jyotish.bhavas.Bhava7;
import dattatreya.jyotish.bhavas.Bhava8;
import dattatreya.jyotish.bhavas.Bhava9;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.grahas.util.LordOfHouseUtil;
import dattatreya.jyotish.horoscope.D1RashiChart;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

@Component("analyzeBhava11")
public class AnalyzeBhava11 implements AnalyzeBhava{

	@Autowired
	@Qualifier("labhaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava11")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava11")
	RashiInBhava rashiInBhava;
	
	public String analyzeBhava(Chart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhava11());
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhava11());
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}
	
	private String infoAboutHouseLord(Chart horoscope) {
		 return LordOfHouseUtil.infoOnLordofEleventhHouse(houseLordPlacedInBhava,horoscope);
	}
	
	
}
