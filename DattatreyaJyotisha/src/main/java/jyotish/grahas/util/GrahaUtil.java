package jyotish.grahas.util;

import jyotish.grahas.Budha;
import jyotish.grahas.Chandra;
import jyotish.grahas.Graha;
import jyotish.grahas.Guru;
import jyotish.grahas.Ketu;
import jyotish.grahas.Mangal;
import jyotish.grahas.Rahu;
import jyotish.grahas.Shani;
import jyotish.grahas.Shukra;
import jyotish.grahas.Surya;
import util.JyotishEnumUtil;
import util.JyotishEnumUtil.Name_Of_Graha;

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
