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
import dattatreya.jyotish.horoscope.Horoscope;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

@Component("analyzeBhava8")
public class AnalyzeBhava8 implements AnalyzeBhava{
	
	@Autowired
	@Qualifier("randharaBhavaHelper")
	HouseLordPlacedInBhava houseLordPlacedInBhava;
	
	@Autowired
	@Qualifier("grahaInBhava3")
	GrahaInBhava grahaInBhava;
	
	@Autowired
	@Qualifier("rashiInBhava3")
	RashiInBhava rashiInBhava;

	public String analyzeBhava(Horoscope horoscope) {
		
		StringBuilder sbAnalyzeBhava8 = new StringBuilder();
		
		Bhava1 bhava1 = (Bhava1) horoscope.getBhava1();
		Bhava2 bhava2 = (Bhava2) horoscope.getBhava2();
		Bhava3 bhava3 = (Bhava3) horoscope.getBhava3();
		Bhava4 bhava4 = (Bhava4) horoscope.getBhava4();
		Bhava5 bhava5 = (Bhava5) horoscope.getBhava5();
		Bhava6 bhava6 = (Bhava6) horoscope.getBhava6();
		Bhava7 bhava7 = (Bhava7) horoscope.getBhava7();
		Bhava8 bhava8 = (Bhava8) horoscope.getBhava8();
		Bhava9 bhava9 = (Bhava9) horoscope.getBhava9();
		Bhava10 bhava10 = (Bhava10) horoscope.getBhava10();
		Bhava11 bhava11 = (Bhava11) horoscope.getBhava11();
		Bhava12 bhava12 = (Bhava12) horoscope.getBhava12();

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava8.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 1 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 2 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 3 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 4 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 5 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 6 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 7 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 8 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 9 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 10 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 11 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 12 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
		}

		return sbAnalyzeBhava8.toString();

	}
}
