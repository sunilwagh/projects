package dattatreya.jyotish.grahas.util;

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
import dattatreya.jyotish.util.JyotishEnumUtil;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;

public class GrahaUtil {
	
	public static Name_Of_Graha displayGrahaDetails(Graha graha) {
		if (graha instanceof Surya) {
			return Name_Of_Graha.SURYA;
		}

		if (graha instanceof Chandra) {
			return Name_Of_Graha.CHANDRA;
		}

		if (graha instanceof Mangal) {
			return Name_Of_Graha.MANGAL;
		}

		if (graha instanceof Budha) {
			return Name_Of_Graha.BUDHA;
		}

		if (graha instanceof Guru) {
			return Name_Of_Graha.GURU;
		}

		if (graha instanceof Shukra) {
			return Name_Of_Graha.SHUKRA;
		}

		if (graha instanceof Shani) {
			return Name_Of_Graha.SHANI;
		}

		if (graha instanceof Rahu) {
			return Name_Of_Graha.RAHU;
		}

		if (graha instanceof Ketu) {
			return Name_Of_Graha.KETU;
		}

		return null;

	}


}
