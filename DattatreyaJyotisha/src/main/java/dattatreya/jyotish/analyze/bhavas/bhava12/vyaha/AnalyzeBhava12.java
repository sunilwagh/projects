package dattatreya.jyotish.analyze.bhavas.bhava12.vyaha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.analyze.bhavas.HouseLordPlacedInBhava;
import dattatreya.jyotish.analyze.bhavas.RashiInBhava;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.grahas.util.LordOfHouseUtil;
import dattatreya.jyotish.horoscope.D1RashiChart;
import dattatreya.jyotish.rashis.RashiUtil;


@Component("analyzeBhava12")
public class AnalyzeBhava12 implements AnalyzeBhava {

	
	
	@Autowired
	@Qualifier("vyahaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava12")
	GrahaInBhava grahaInBhava;

	@Autowired
	@Qualifier("rashiInBhava12")
	RashiInBhava rashiInBhava;
	
	public String analyzeBhava(Chart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhavas()[11]);
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhavas()[11]);
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(Chart horoscope) {
		 return LordOfHouseUtil.infoOnLordofTwelvethHouse(houseLordPlacedInBhava,horoscope);
	}
}
