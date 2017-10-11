package dattatreya.jyotish.analyze.bhavas.bhava3.sahaj;

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
import dattatreya.jyotish.rashis.RashiUtil;


@Component("analyzeBhava3")
public class AnalyzeBhava3 implements AnalyzeBhava{

	
	
	@Autowired
	@Qualifier("sahajBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava3")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava3")
	RashiInBhava rashiInBhava;
	
	public String analyzeBhava(Chart horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = GrahaUtil.infoAboutGrahasInHouse(grahaInBhava,horoscope.getBhavas()[2]);
		String infoAboutRashiInHouse = RashiUtil.infoAboutRashiInHouse(rashiInBhava,horoscope.getBhavas()[2]);
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutHouseLord(Chart horoscope) {
		 return LordOfHouseUtil.infoOnLordofThirdHouse(houseLordPlacedInBhava,horoscope);
	}
}
