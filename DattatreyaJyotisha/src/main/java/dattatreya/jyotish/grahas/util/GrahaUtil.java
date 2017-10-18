package dattatreya.jyotish.grahas.util;

import java.util.ArrayList;
import java.util.List;

import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.grahas.Budha;
import dattatreya.jyotish.grahas.Chandra;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.Guru;
import dattatreya.jyotish.grahas.Ketu;
import dattatreya.jyotish.grahas.Mangal;
import dattatreya.jyotish.grahas.Rahu;
import dattatreya.jyotish.grahas.Shani;
import dattatreya.jyotish.grahas.Shukra;
import dattatreya.jyotish.grahas.Surya;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.rashis.RashiUtil;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.PositiveStrengthOfGraha;

public class GrahaUtil {

	public static GrahaNames displayGrahaDetails(Graha graha) {
		if (graha instanceof Surya) {
			return GrahaNames.SURYA;
		}

		if (graha instanceof Chandra) {
			return GrahaNames.CHANDRA;
		}

		if (graha instanceof Mangal) {
			return GrahaNames.MANGAL;
		}

		if (graha instanceof Budha) {
			return GrahaNames.BUDHA;
		}

		if (graha instanceof Guru) {
			return GrahaNames.GURU;
		}

		if (graha instanceof Shukra) {
			return GrahaNames.SHUKRA;
		}

		if (graha instanceof Shani) {
			return GrahaNames.SHANI;
		}

		if (graha instanceof Rahu) {
			return GrahaNames.RAHU;
		}

		if (graha instanceof Ketu) {
			return GrahaNames.KETU;
		}

		return null;

	}

	public static String infoAboutGrahasInHouse(GrahaInBhava grahaInBhava, Bhava bhava) {

		ArrayList<GrahaNames> grahas = (ArrayList<GrahaNames>) RashiUtil.getGrahasInRashi(bhava.getRashi());
		StringBuilder strBuilder = new StringBuilder();

		if (grahas != null && grahas.size() > 0) {
			for (int i = 0; i < grahas.size(); i++) {
				switch (grahas.get(i)) {
				case SURYA:
					strBuilder.append(grahaInBhava.suryaInBhava());
					break;
				case CHANDRA:
					strBuilder.append(grahaInBhava.chandraInBhava());
					break;
				case MANGAL:
					strBuilder.append(grahaInBhava.mangalInBhava());
					break;
				case BUDHA:
					strBuilder.append(grahaInBhava.budhaInBhava());
					break;
				case GURU:
					strBuilder.append(grahaInBhava.guruInBhava());
					break;
				case SHUKRA:
					strBuilder.append(grahaInBhava.shukraInBhava());
					break;
				case SHANI:
					strBuilder.append(grahaInBhava.shaniInBhava());
					break;
				case RAHU:
					strBuilder.append(grahaInBhava.rahuInBhava());
					break;
				case KETU:
					strBuilder.append(grahaInBhava.ketuInBhava());
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

	public static StringBuilder analyzeHouseLord(GrahaNames lordOfRashi, Bhava bhava, StringBuilder sbAnalyzeBhava) {

		Graha grahaToBeAnalyzed = getGrahaInformation(lordOfRashi, bhava);
        sbAnalyzeBhava.append("\nLord is in it's "+ getGrahaStatus(bhava,grahaToBeAnalyzed) + " sign ("+ grahaToBeAnalyzed.getGrahaName()+ "->" + bhava.getRashi().getNameOfRashi()+")");
		return sbAnalyzeBhava;
	}

	private static Graha getGrahaInformation(GrahaNames lordOfRashi, Bhava bhava) {
		
        Rashi rashi = bhava.getRashi();
		List<Graha> grahas = (ArrayList<Graha>) rashi.getGrahas();
		Graha grahaToBeAnalyzed = null;
		
		if (grahas != null & grahas.size() > 0) {
			
			for (int i = 0; i < grahas.size(); i++) {
				
				GrahaNames grahaName = grahas.get(i).getGrahaName();
				if (lordOfRashi == grahaName) {
					
					grahaToBeAnalyzed = grahas.get(i);
					break;
				}
				
			}
		}
		return grahaToBeAnalyzed;
	}
	
	public static PositiveStrengthOfGraha getGrahaStatus(Bhava bhava,Graha grahaToBeAnalyzed)
	{
		Rashi rashi = bhava.getRashi();
		if (grahaToBeAnalyzed != null) {

			
			if (rashi.getNameOfRashi() == grahaToBeAnalyzed.getExaltationRashi()) {
				return PositiveStrengthOfGraha.EXALTATION;
			}

			if (rashi.getNameOfRashi() == grahaToBeAnalyzed.getMooltrikonaRashi()) {
				return PositiveStrengthOfGraha.MOOLTRIKONA;
			}

			if (rashi.getNameOfRashi() == grahaToBeAnalyzed.getOwnRashi()) {
				return PositiveStrengthOfGraha.OWN_SIGN;
			}

			if (grahaToBeAnalyzed.getFRIEND_SIGNS_TO_GRAHA() != null && grahaToBeAnalyzed.getFRIEND_SIGNS_TO_GRAHA().contains(rashi.getNameOfRashi())) {
				return PositiveStrengthOfGraha.FRIENDS;
			}
			
			if (grahaToBeAnalyzed.getNUETRAL_SIGNS_TO_GRAHA() != null && grahaToBeAnalyzed.getNUETRAL_SIGNS_TO_GRAHA().size() >0 && grahaToBeAnalyzed.getNUETRAL_SIGNS_TO_GRAHA().contains(rashi.getNameOfRashi())) {
				return PositiveStrengthOfGraha.NUETRAL;
			}

			if (grahaToBeAnalyzed.getENEMY_SIGNS_TO_GRAHA() != null && grahaToBeAnalyzed.getENEMY_SIGNS_TO_GRAHA().contains(rashi.getNameOfRashi())) {
				return PositiveStrengthOfGraha.ENEMY;
			}

			if (rashi.getNameOfRashi() == grahaToBeAnalyzed.getDebilitationRashi()) {
				return PositiveStrengthOfGraha.DEBILITATION;
			}
		
	}
		return PositiveStrengthOfGraha.DEBILITATION;

   }
}
