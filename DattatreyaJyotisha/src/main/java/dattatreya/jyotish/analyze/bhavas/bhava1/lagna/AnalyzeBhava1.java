package dattatreya.jyotish.analyze.bhavas.bhava1.lagna;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.analyze.bhavas.HouseLordPlacedInBhava;
import dattatreya.jyotish.analyze.bhavas.RashiInBhava;
import dattatreya.jyotish.analyze.bhavas.bhava11.labha.LabhaBhavaHelper;
import dattatreya.jyotish.bhavas.Bhava;
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
import dattatreya.jyotish.bhavas.util.BhavasUtil;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.grahas.util.LordOfHouseUtil;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

@Component("analyzeBhava1")
public class AnalyzeBhava1 implements AnalyzeBhava {

	@Autowired
	@Qualifier("lagnaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;

	@Autowired
	@Qualifier("grahaInBhava1")
	GrahaInBhava grahaInBhava;

	@Autowired
	@Qualifier("rashiInBhava1")
	RashiInBhava rashiInBhava;

	public String analyzeBhava(Chart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		//System.out.println("****"+BhavasUtil.secondBhavaFrom(horoscope.getBhavas()[9],horoscope).getName());
		//System.out.println("****"+BhavasUtil.twelvethBhavaFrom(horoscope.getBhavas()[9],horoscope).getName());
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhavas()[0]);
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhavas()[0]);
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(Chart horoscope) {
		 return LordOfHouseUtil.infoOnLordofFirstHouse(houseLordPlacedInBhava,horoscope);
	}

	
}
