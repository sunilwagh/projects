package dattatreya.jyotish.rashis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dattatreya.jyotish.analyze.bhavas.RashiInBhava;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.bhavas.Bhava10;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.rashis.aquarius.Aquarius;
import dattatreya.jyotish.rashis.aries.Aries;
import dattatreya.jyotish.rashis.cancer.Cancer;
import dattatreya.jyotish.rashis.capricorn.Capricorn;
import dattatreya.jyotish.rashis.gemini.Gemini;
import dattatreya.jyotish.rashis.leo.Leo;
import dattatreya.jyotish.rashis.libra.Libra;
import dattatreya.jyotish.rashis.pisces.Pisces;
import dattatreya.jyotish.rashis.sagittarius.Sagittaurius;
import dattatreya.jyotish.rashis.scorpio.Scorpio;
import dattatreya.jyotish.rashis.taurus.Taurus;
import dattatreya.jyotish.rashis.virgo.Virgo;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;

public class RashiUtil {

	private static Map<RashiNames, GrahaNames> rashiLordMap

			= new HashMap<RashiNames, GrahaNames>();

	static {
		rashiLordMap.put(RashiNames.ARIES, GrahaNames.MANGAL);
		rashiLordMap.put(RashiNames.TAURUS, GrahaNames.SHUKRA);
		rashiLordMap.put(RashiNames.GEMINI, GrahaNames.BUDHA);
		rashiLordMap.put(RashiNames.CANCER, GrahaNames.CHANDRA);
		rashiLordMap.put(RashiNames.LEO, GrahaNames.SURYA);
		rashiLordMap.put(RashiNames.VIRGO, GrahaNames.BUDHA);
		rashiLordMap.put(RashiNames.LIBRA, GrahaNames.SHUKRA);
		rashiLordMap.put(RashiNames.SCORPIO, GrahaNames.MANGAL);
		rashiLordMap.put(RashiNames.SAGITTAURIUS, GrahaNames.GURU);
		rashiLordMap.put(RashiNames.CAPRICORN, GrahaNames.SHANI);
		rashiLordMap.put(RashiNames.ACQUARIUS, GrahaNames.SHANI);
		rashiLordMap.put(RashiNames.PISCES, GrahaNames.GURU);
	}

	public static Map<RashiNames, GrahaNames> getRashiLordMap() {
		return rashiLordMap;
	}

	public static void setRashiLordMap(Map<RashiNames, GrahaNames> rashiLordMap) {
		RashiUtil.rashiLordMap = rashiLordMap;
	}

	public static RashiNames findRashiInBhava(Rashi rashi) {
		if (rashi instanceof Aries) {
			return RashiNames.ARIES;
		}

		if (rashi instanceof Taurus) {
			return RashiNames.TAURUS;
		}

		if (rashi instanceof Gemini) {
			return RashiNames.GEMINI;
		}

		if (rashi instanceof Cancer) {
			return RashiNames.CANCER;
		}

		if (rashi instanceof Leo) {
			return RashiNames.LEO;
		}

		if (rashi instanceof Virgo) {
			return RashiNames.VIRGO;
		}
		
		if (rashi instanceof Libra) {
			return RashiNames.LIBRA;

		}

		if (rashi instanceof Scorpio) {
			return RashiNames.SCORPIO;
		}

		if (rashi instanceof Sagittaurius) {
			return RashiNames.SAGITTAURIUS;
		}

		if (rashi instanceof Capricorn) {
			return RashiNames.CAPRICORN;
		}

		if (rashi instanceof Aquarius) {
			return RashiNames.ACQUARIUS;
		}

		if (rashi instanceof Pisces) {
			return RashiNames.PISCES;
		}
		return null;
	}

	public static List<GrahaNames> getGrahasInRashi(Rashi rashi) {
		List<GrahaNames> grahaNameList = new ArrayList<GrahaNames>();
		if (rashi instanceof Aries) {
		
			Aries ariesRashi = (Aries) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) ariesRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Taurus) {
			Taurus taurusRashi = (Taurus) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) taurusRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Gemini) {
			Gemini geminiRashi = (Gemini) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) geminiRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;

		}

		if (rashi instanceof Cancer) {
			Cancer cancerRashi = (Cancer) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) cancerRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;

		}

		if (rashi instanceof Leo) {
			Leo leoRashi = (Leo) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) leoRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Virgo) {
			Virgo virgoRashi = (Virgo) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) virgoRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Libra) {
			Libra libraRashi = (Libra) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) libraRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Scorpio) {
			Scorpio scorpioRashi = (Scorpio) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) scorpioRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Sagittaurius) {
			Sagittaurius sagittariusRashi = (Sagittaurius) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) sagittariusRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Capricorn) {
			Capricorn capricornRashi = (Capricorn) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) capricornRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Aquarius) {
			Aquarius acquariusRashi = (Aquarius) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) acquariusRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Pisces) {
			Pisces piscesRashi = (Pisces) rashi;
			ArrayList<Graha> grahaList = (ArrayList<Graha>) piscesRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		return null;
	}

	private static void addGrahasToList(List<GrahaNames> grahaNameList, ArrayList<Graha> grahaList) {

		if (grahaList != null && grahaList.size() > 0) {
			for (int i = 0; i < grahaList.size(); i++) {
				Graha graha = grahaList.get(i);
				grahaNameList.add(GrahaUtil.displayGrahaDetails(graha));
			}
		}
	}
	
	public static String infoAboutRashiInHouse(RashiInBhava rashiInBhava,Bhava bhava) {
		Rashi rashi = bhava.getRashi();
		StringBuilder strBuilder = new StringBuilder();
		switch (rashi.getNameOfRashi()) {
		case ARIES:
			strBuilder.append(rashiInBhava.ariesInBhava());
			break;
		case TAURUS:
			strBuilder.append(rashiInBhava.taurusInBhava());
			break;
		case GEMINI:
			strBuilder.append(rashiInBhava.geminiInBhava());
			break;
		case CANCER:
			strBuilder.append(rashiInBhava.cancerInBhava());
			break;
		case LEO:
			strBuilder.append(rashiInBhava.leoInBhava());
			break;
		case VIRGO:
			strBuilder.append(rashiInBhava.virgoInBhava());
			break;
		case LIBRA:
			strBuilder.append(rashiInBhava.libraInBhava());
			break;
		case SCORPIO:
			strBuilder.append(rashiInBhava.scorpioInBhava());
			break;
		case SAGITTAURIUS:
			strBuilder.append(rashiInBhava.sagittariusInBhava());
			break;
		case CAPRICORN:
			strBuilder.append(rashiInBhava.capricornInBhava());
			break;
		case ACQUARIUS:
			strBuilder.append(rashiInBhava.aquariusInBhava());
			break;
		case PISCES:
			strBuilder.append(rashiInBhava.piscesInBhava());
			break;
		default:
			strBuilder.append("");
			break;
		}

		return strBuilder.toString();

	}
	
	

}
