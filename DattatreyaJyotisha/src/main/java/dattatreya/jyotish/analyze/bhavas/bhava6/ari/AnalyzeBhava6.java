package dattatreya.jyotish.analyze.bhavas.bhava6.ari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
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

@Component("analyzeBhava6")
public class AnalyzeBhava6 implements AnalyzeBhava{
	
	@Autowired
	@Qualifier("ariBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava6")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava6")
	RashiInBhava rashiInBhava;

	public String analyzeBhava(D1RashiChart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhava6());
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhava6());
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(D1RashiChart horoscope) {
		 return LordOfHouseUtil.infoOnLordofSixthHouse(houseLordPlacedInBhava,horoscope);
	}
}
