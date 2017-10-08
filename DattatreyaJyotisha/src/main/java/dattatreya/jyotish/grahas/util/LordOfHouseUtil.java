package dattatreya.jyotish.grahas.util;

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
import dattatreya.jyotish.horoscope.Horoscope;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;

public class LordOfHouseUtil {

	public static String infoOnLordofFirstHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		StringBuilder sbAnalyzeBhava1 = new StringBuilder();

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

	public static String infoOnLordofSecondHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofThirdHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofFourthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofFifthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofSixthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofSeventhHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		return null;
	}

	public static String infoOnLordofEightHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
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

	public static String infoOnLordofNinthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		StringBuilder sbAnalyzeBhava9 = new StringBuilder();

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

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava9.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 1 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 2 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 3 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 4 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 5 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 6 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 7 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 8 \\n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 9 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 10 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 11 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 12 \n");
			sbAnalyzeBhava9.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
		}

		return sbAnalyzeBhava9.toString();
	}

	public static String infoOnLordofTenthHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		StringBuilder sbAnalyzeBhava10 = new StringBuilder();

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

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava10.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 1 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 2 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 3 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 4 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 5 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 6 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 7 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 8 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 9 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 10 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 11 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava10.append("Lord of 10 in 12 \n");
			sbAnalyzeBhava10.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
		}

		return sbAnalyzeBhava10.toString();
	}

	public static String infoOnLordofEleventhHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		StringBuilder sbAnalyzeBhava11 = new StringBuilder();

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

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava11.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 1 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 2 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 3 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 4 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 5 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 6 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 7 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 8 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 9 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 10 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 11 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava11.append("Lord of 11 in 12 \n");
			sbAnalyzeBhava11.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
		}

		return sbAnalyzeBhava11.toString();

	}

	public static String infoOnLordofTwelvethHouse(HouseLordPlacedInBhava houseLordPlacedInBhava, Horoscope horoscope) {
		StringBuilder sbAnalyzeBhava12 = new StringBuilder();

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

		GrahaNames lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava12.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 1 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava1());
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 2 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 3 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 4 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 5 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 6 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 7 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 8 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 9 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 10 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 11 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava12.append("Lord of 12 in 12 \n");
			sbAnalyzeBhava12.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
		}

		return sbAnalyzeBhava12.toString();
	}

}
