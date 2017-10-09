package dattatreya.jyotish.analyze.bhavas.bhava4.sukha;

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

@Component("analyzeBhava4")
public class AnalyzeBhava4 implements AnalyzeBhava{
	
	@Autowired
	@Qualifier("sukhaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava4")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava4")
	RashiInBhava rashiInBhava;
	

	public String analyzeBhava(D1RashiChart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhava4());
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhava4());
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(D1RashiChart horoscope) {
		 return LordOfHouseUtil.infoOnLordofFourthHouse(houseLordPlacedInBhava,horoscope);
	}
}
