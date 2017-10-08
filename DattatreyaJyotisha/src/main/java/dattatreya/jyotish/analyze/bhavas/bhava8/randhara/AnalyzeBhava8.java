package dattatreya.jyotish.analyze.bhavas.bhava8.randhara;

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
import dattatreya.jyotish.horoscope.Horoscope;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

@Component("analyzeBhava8")
public class AnalyzeBhava8 implements AnalyzeBhava{
	
	@Autowired
	@Qualifier("randharaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava8")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava8")
	RashiInBhava rashiInBhava;

	public String analyzeBhava(Horoscope horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhava1());
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhava1());
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(Horoscope horoscope) {
		 return LordOfHouseUtil.infoOnLordofEightHouse(houseLordPlacedInBhava,horoscope);
	}
}
