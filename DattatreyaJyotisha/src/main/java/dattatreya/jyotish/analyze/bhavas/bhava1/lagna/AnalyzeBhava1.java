package dattatreya.jyotish.analyze.bhavas.bhava1.lagna;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
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
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.horoscope.Horoscope;
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

	public String analyzeBhava(Horoscope horoscope) {

		String infoAboutHouseLord = infoAboutHouseLord(horoscope);
		String infoAboutGrahasInHouse = infoAboutGrahasInHouse(horoscope.getBhava1());
		String infoAboutRashiInHouse = infoAboutRashiInHouse(horoscope.getBhava1());
		return infoAboutHouseLord + "\n" + infoAboutGrahasInHouse + "\n" + infoAboutRashiInHouse;

	}

	private String infoAboutRashiInHouse(Bhava bhava) {
		Rashi rashi = bhava.getRashi();
		StringBuilder strBuilder = new StringBuilder();
		switch (rashi.getNameOfRashi()) {
		case ARIES:
			strBuilder.append(rashiInBhava.AriesInBhava());
			break;
		case TAURUS:
			strBuilder.append(rashiInBhava.TaurusInBhava());
			break;
		case GEMINI:
			strBuilder.append(rashiInBhava.GeminiInBhava());
			break;
		case CANCER:
			strBuilder.append(rashiInBhava.CancerInBhava());
			break;
		case LEO:
			strBuilder.append(rashiInBhava.LeoInBhava());
			break;
		case VIRGO:
			strBuilder.append(rashiInBhava.VirgoInBhava());
			break;
		case LIBRA:
			strBuilder.append(rashiInBhava.LibraInBhava());
			break;
		case SCORPIO:
			strBuilder.append(rashiInBhava.ScorpioInBhava());
			break;
		case SAGITTAURIUS:
			strBuilder.append(rashiInBhava.SagittariusInBhava());
			break;
		case CAPRICORN:
			strBuilder.append(rashiInBhava.CapricornInBhava());
			break;
		case ACQUARIUS:
			strBuilder.append(rashiInBhava.AcquariusInBhava());
			break;
		case PISCES:
			strBuilder.append(rashiInBhava.PiscesInBhava());
			break;
		default:
			strBuilder.append("");
			break;
		}

		return strBuilder.toString();

	}

	private String infoAboutGrahasInHouse(Bhava bhava) {

		ArrayList<GrahaNames> grahas = (ArrayList<GrahaNames>) RashiUtil.getGrahasInRashi(bhava.getRashi());
		StringBuilder strBuilder = new StringBuilder();

		if (grahas != null && grahas.size() > 0) {
			for (int i = 0; i < grahas.size(); i++) {
				switch (grahas.get(i)) {
				case SURYA:
					strBuilder.append(grahaInBhava.SuryaInBhava());
					break;
				case CHANDRA:
					strBuilder.append(grahaInBhava.ChandraInBhava());
					break;
				case MANGAL:
					strBuilder.append(grahaInBhava.MangalInBhava());
					break;
				case BUDHA:
					strBuilder.append(grahaInBhava.BudhaInBhava());
					break;
				case GURU:
					strBuilder.append(grahaInBhava.GuruInBhava());
					break;
				case SHUKRA:
					strBuilder.append(grahaInBhava.ShukraInBhava());
					break;
				case SHANI:
					strBuilder.append(grahaInBhava.ShaniInBhava());
					break;
				case RAHU:
					strBuilder.append(grahaInBhava.RahuInBhava());
					break;
				case KETU:
					strBuilder.append(grahaInBhava.KetuInBhava());
					break;
				default:
					strBuilder.append("");
					break;
				}
			}

			return strBuilder.toString();
		} else {
			return "";
		}

	}

	private String infoAboutHouseLord(Horoscope horoscope) {
		StringBuffer sbAnalyzeBhava1 = new StringBuffer();

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
			analyzeHouseLord(lordOfRashi, bhava1, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 2 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava2());
			analyzeHouseLord(lordOfRashi, bhava2, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 3 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava3());
			analyzeHouseLord(lordOfRashi, bhava3, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 4 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava4());
			analyzeHouseLord(lordOfRashi, bhava4, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 5 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava5());
			analyzeHouseLord(lordOfRashi, bhava5, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 6 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava6());
			analyzeHouseLord(lordOfRashi, bhava6, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 7 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava7());
			analyzeHouseLord(lordOfRashi, bhava7, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 8 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava8());
			analyzeHouseLord(lordOfRashi, bhava8, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 9 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava9());
			analyzeHouseLord(lordOfRashi, bhava9, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 10 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava10());
			analyzeHouseLord(lordOfRashi, bhava10, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 11 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava11());
			analyzeHouseLord(lordOfRashi, bhava11, sbAnalyzeBhava1);
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava1.append("Lord of 1 in 12 \n");
			sbAnalyzeBhava1.append(houseLordPlacedInBhava.infoAboutHouseLordPlacedInBhava12());
			analyzeHouseLord(lordOfRashi, bhava12, sbAnalyzeBhava1);
		}

		return sbAnalyzeBhava1.toString();
	}

	private void analyzeHouseLord(GrahaNames lordOfRashi, Bhava bhava, StringBuffer sbAnalyzeBhava1) {

		Rashi rashi = bhava.getRashi();
		Graha grahaToBeAnalyzed = null;

		ArrayList<Graha> grahas = (ArrayList<Graha>) rashi.getGrahas();

		for (int i = 0; i < grahas.size(); i++) {
			if (lordOfRashi.equals(grahas.get(i).getGrahaName())) {
				grahaToBeAnalyzed = grahas.get(i);
				break;
			}
		}

		if (rashi.getNameOfRashi().equals(grahaToBeAnalyzed.getExaltation())) {
			sbAnalyzeBhava1.append("Lord is Exalted");
		}

		if (rashi.getNameOfRashi().equals(grahaToBeAnalyzed.getMooltrikonarashi())) {
			sbAnalyzeBhava1.append("Lord is in it's Mooltrikona");
		}

		if (rashi.getNameOfRashi().equals(grahaToBeAnalyzed.getOwn())) {
			sbAnalyzeBhava1.append("Lord is in it's Own Rashi");
		}

		if (grahaToBeAnalyzed.getFRIEND_SIGNS_TO_GRAHA().contains(rashi.getNameOfRashi())) {
			sbAnalyzeBhava1.append("Lord is in friendly sign");
		}

		if (grahaToBeAnalyzed.getENEMY_SIGNS_TO_GRAHA().contains(rashi.getNameOfRashi())) {
			sbAnalyzeBhava1.append("Lord is in enemy sign");
		}

		if (rashi.getNameOfRashi().equals(grahaToBeAnalyzed.getDebilitation())) {
			sbAnalyzeBhava1.append("Lord is debilitated");
		}

	}
}
