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
import dattatreya.jyotish.util.GrahaNames;

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


}
