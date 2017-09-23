package dattatreya.jyotish.rashis;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.bhavas.Bhava10;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.util.GrahaUtil;
import dattatreya.jyotish.util.JyotishEnumUtil;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;

public class RashiUtil {

	private static Map<Name_Of_Rashi, Name_Of_Graha> rashiLordMap

			= new HashMap<Name_Of_Rashi, Name_Of_Graha>();

	static {
		rashiLordMap.put(Name_Of_Rashi.ARIES, Name_Of_Graha.MANGAL);
		rashiLordMap.put(Name_Of_Rashi.TAURUS, Name_Of_Graha.SHUKRA);
		rashiLordMap.put(Name_Of_Rashi.GEMINI, Name_Of_Graha.BUDHA);
		rashiLordMap.put(Name_Of_Rashi.CANCER, Name_Of_Graha.CHANDRA);
		rashiLordMap.put(Name_Of_Rashi.LEO, Name_Of_Graha.SURYA);
		rashiLordMap.put(Name_Of_Rashi.VIRGO, Name_Of_Graha.BUDHA);
		rashiLordMap.put(Name_Of_Rashi.LIBRA, Name_Of_Graha.SHUKRA);
		rashiLordMap.put(Name_Of_Rashi.SCORPIO, Name_Of_Graha.MANGAL);
		rashiLordMap.put(Name_Of_Rashi.SAGITTAURIUS, Name_Of_Graha.GURU);
		rashiLordMap.put(Name_Of_Rashi.CAPRICORN, Name_Of_Graha.SHANI);
		rashiLordMap.put(Name_Of_Rashi.ACQUARIUS, Name_Of_Graha.SHANI);
		rashiLordMap.put(Name_Of_Rashi.PISCES, Name_Of_Graha.GURU);
	}

	public static Map<Name_Of_Rashi, Name_Of_Graha> getRashiLordMap() {
		return rashiLordMap;
	}

	public static void setRashiLordMap(Map<Name_Of_Rashi, Name_Of_Graha> rashiLordMap) {
		RashiUtil.rashiLordMap = rashiLordMap;
	}

	public static Name_Of_Rashi findRashiInBhava(Rashi rashi) {
		if (rashi instanceof Aries) {
			return Name_Of_Rashi.ARIES;
		}

		if (rashi instanceof Taurus) {
			return Name_Of_Rashi.TAURUS;
		}

		if (rashi instanceof Gemini) {
			return Name_Of_Rashi.GEMINI;
		}

		if (rashi instanceof Cancer) {
			return Name_Of_Rashi.CANCER;
		}

		if (rashi instanceof Leo) {
			return Name_Of_Rashi.LEO;
		}

		if (rashi instanceof Virgo) {
			return Name_Of_Rashi.VIRGO;
		}
		
		if (rashi instanceof Libra) {
			return Name_Of_Rashi.LIBRA;

		}

		if (rashi instanceof Scorpio) {
			return Name_Of_Rashi.SCORPIO;
		}

		if (rashi instanceof Sagittaurius) {
			return Name_Of_Rashi.SAGITTAURIUS;
		}

		if (rashi instanceof Capricorn) {
			return Name_Of_Rashi.CAPRICORN;
		}

		if (rashi instanceof Acquarius) {
			return Name_Of_Rashi.ACQUARIUS;
		}

		if (rashi instanceof Pisces) {
			return Name_Of_Rashi.PISCES;
		}
		return null;
	}

	public static List<Name_Of_Graha> getGrahasInRashi(Rashi rashi) {
		List<Name_Of_Graha> grahaNameList = new ArrayList<Name_Of_Graha>();
		if (rashi instanceof Aries) {
		
			Aries ariesRashi = (Aries) rashi;
			ArrayList<Graha> grahaList = ariesRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Taurus) {
			Taurus taurusRashi = (Taurus) rashi;
			ArrayList<Graha> grahaList = taurusRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Gemini) {
			Gemini geminiRashi = (Gemini) rashi;
			ArrayList<Graha> grahaList = geminiRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;

		}

		if (rashi instanceof Cancer) {
			Cancer cancerRashi = (Cancer) rashi;
			ArrayList<Graha> grahaList = cancerRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;

		}

		if (rashi instanceof Leo) {
			Leo leoRashi = (Leo) rashi;
			ArrayList<Graha> grahaList = leoRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Virgo) {
			Virgo virgoRashi = (Virgo) rashi;
			ArrayList<Graha> grahaList = virgoRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Libra) {
			Libra libraRashi = (Libra) rashi;
			ArrayList<Graha> grahaList = libraRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Scorpio) {
			Scorpio scorpioRashi = (Scorpio) rashi;
			ArrayList<Graha> grahaList = scorpioRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;

		}

		if (rashi instanceof Sagittaurius) {
			Sagittaurius sagittariusRashi = (Sagittaurius) rashi;
			ArrayList<Graha> grahaList = sagittariusRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Capricorn) {
			Capricorn capricornRashi = (Capricorn) rashi;
			ArrayList<Graha> grahaList = capricornRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		if (rashi instanceof Acquarius) {
			Acquarius acquariusRashi = (Acquarius) rashi;
			ArrayList<Graha> grahaList = acquariusRashi.getGrahas();
			addGrahasToList(grahaNameList, grahaList);
			return grahaNameList;
		}

		if (rashi instanceof Pisces) {
			Pisces piscesRashi = (Pisces) rashi;
			ArrayList<Graha> grahaList = piscesRashi.getGrahas();
            addGrahasToList(grahaNameList, grahaList);
            return grahaNameList;
		}

		return null;
	}

	private static void addGrahasToList(List<Name_Of_Graha> grahaNameList, ArrayList<Graha> grahaList) {

		if (grahaList != null && grahaList.size() > 0) {
			for (int i = 0; i < grahaList.size(); i++) {
				Graha graha = grahaList.get(i);
				grahaNameList.add(GrahaUtil.displayGrahaDetails(graha));
			}
		}
	}
	
	

}
