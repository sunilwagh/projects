package dattatreya.jyotish.grahas.util;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.HouseLordPlacedInBhava;
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
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

public class LordOfHouseUtil {

	public static String infoOnLordofFirstHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava1 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava1.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 1 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 2 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 3 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 4 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 5 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 6 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 7 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 8 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 9 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 10 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 11 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 12 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava1 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava1);
		}

		return sbAnalyzeBhava1.toString();
	}

	public static String infoOnLordofSecondHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
        StringBuilder sbAnalyzeBhava2 = new StringBuilder();
		
		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava2.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 1 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 2 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 3 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 4 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 5 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 6 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 7 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 8 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 9 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 10 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 11 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava2);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava2.append("Lord of 2 in 12 \n");
			sbAnalyzeBhava2.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava2 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava2);
		}

		return sbAnalyzeBhava2.toString();
	}

	public static String infoOnLordofThirdHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava3 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava3.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 1 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 2 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 3 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 4 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 5 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava3);
			
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 6 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 7 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 8 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 9 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 10 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 11 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava3);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava3.append("Lord of 3 in 12 \n");
			sbAnalyzeBhava3.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava3 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava3);
		}

		return sbAnalyzeBhava3.toString();
	}

	public static String infoOnLordofFourthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava4 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava4.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 1 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 2 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 3 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 4 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 5 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 6 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 7 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 8 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 9 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 10 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 11 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava4);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava4.append("Lord of 4 in 12 \n");
			sbAnalyzeBhava4.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava4 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava4);
		}

		return sbAnalyzeBhava4.toString();
	}

	public static String infoOnLordofFifthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava5 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava5.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 1 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 2 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 3 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 4 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 5 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 6 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 7 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 8 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 9 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 10 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 11 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava5);
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava5);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava5.append("Lord of 5 in 12 \n");
			sbAnalyzeBhava5.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava5);
			sbAnalyzeBhava5 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava5);
		}

		return sbAnalyzeBhava5.toString();
	}

	public static String infoOnLordofSixthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava6 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava6.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 1 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 2 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 3 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 4 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 5 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 6 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 7 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 8 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 9 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 10 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 11 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava6);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava6.append("Lord of 6 in 12 \n");
			sbAnalyzeBhava6.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava6 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava6);
		}

		return sbAnalyzeBhava6.toString();
	}

	public static String infoOnLordofSeventhHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava7 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava7.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 1 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 2 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 3 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 4  \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 5 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 6 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava7);
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 7 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava7);
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 8 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 9 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 10 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 11 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava7);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava7.append("Lord of 7 in 12 \n");
			sbAnalyzeBhava7.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava7 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava7);
		}

		return sbAnalyzeBhava7.toString();

	}

	public static String infoOnLordofEightHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava8 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava8.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 1 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 2 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 3 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 4 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 5 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 6 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 7 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 8 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 9 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 10 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 11 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava8);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava8.append("Lord of 8 in 12 \n");
			sbAnalyzeBhava8.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava8 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava8);
		}

		return sbAnalyzeBhava8.toString();
	}

	public static String infoOnLordofNinthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava9 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava9.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 1 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 2 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 3 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 4 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 5 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 6 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 7 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava9);
			
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 8 \\n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 9 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 10 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 11 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava9);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 12 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava9 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava9);
		}

		return sbAnalyzeBhava9.toString();
	}

	public static String infoOnLordofTenthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava10 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava10.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 1 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 2 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 3 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava10);
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 4 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 5 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 6 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 7 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 8 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 9 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava10);
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 10 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 11 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava10);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 12 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava10 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava10);
		}

		return sbAnalyzeBhava10.toString();
	}

	public static String infoOnLordofEleventhHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava11 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava11.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 1 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 2 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 3 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 4 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 5 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 6 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 7 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 8 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 9 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 10 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 11 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava11);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 12 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava11 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava11);
		}

		return sbAnalyzeBhava11.toString();

	}

	public static String infoOnLordofTwelvethHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Chart horoscope) {
		StringBuilder sbAnalyzeBhava12 = new StringBuilder();

		Bhava1 bhava1 = (Bhava1) horoscope.getBhavas()[0];
		Bhava2 bhava2 = (Bhava2) horoscope.getBhavas()[1];
		Bhava3 bhava3 = (Bhava3) horoscope.getBhavas()[2];
		Bhava4 bhava4 = (Bhava4) horoscope.getBhavas()[3];
		Bhava5 bhava5 = (Bhava5) horoscope.getBhavas()[4];
		Bhava6 bhava6 = (Bhava6) horoscope.getBhavas()[5];
		Bhava7 bhava7 = (Bhava7) horoscope.getBhavas()[6];
		Bhava8 bhava8 = (Bhava8) horoscope.getBhavas()[7];
		Bhava9 bhava9 = (Bhava9) horoscope.getBhavas()[8];
		Bhava10 bhava10 = (Bhava10) horoscope.getBhavas()[9];
		Bhava11 bhava11 = (Bhava11) horoscope.getBhavas()[10];
		Bhava12 bhava12 = (Bhava12) horoscope.getBhavas()[11];

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava12.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 1 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 2 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 3 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 4 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 5 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 6 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 7 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 8 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 9 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 10 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 11 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava12);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 12 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			sbAnalyzeBhava12 = GrahaUtil.analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava12);
		}

		return sbAnalyzeBhava12.toString();
	}

}
