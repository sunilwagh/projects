package dattatreya.jyotish.grahas.util;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.Baladi_Avastas;
import dattatreya.jyotish.util.EvenOdd;

public class AvasthaUtil {

	public Baladi_Avastas getSuryaAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}
	
	public Baladi_Avastas getChandraAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getMangalAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getBudhaAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getGuruAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getShukraAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getShaniAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getRahuAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	public Baladi_Avastas getKetuAvastha(Graha graha, Bhava bhava) {
		return getGrahaAvasta(graha, bhava);

	}

	private Baladi_Avastas getGrahaAvasta(Graha graha, Bhava bhava) {
		double degrees = graha.getDegrees();

		if (bhava.getRashi().getEvenOddSign() == EvenOdd.ODD) {
			return getAvastaForOddSign(degrees);
		} else {
			return getAvastaForEvenSign(degrees);

		}
	}

	private Baladi_Avastas getAvastaForEvenSign(double degrees) {
		if (degrees >= 0 && degrees < 6) {
			return Baladi_Avastas.Mrit;
		} else if (degrees >= 6 && degrees < 12) {
			return Baladi_Avastas.Vriddh;
		} else if (degrees >= 12 && degrees < 18) {
			return Baladi_Avastas.Yuva;
		} else if (degrees >= 18 && degrees < 24) {
			return Baladi_Avastas.Kumara;
		} else {

			return Baladi_Avastas.Bala;
		}
	}

	private Baladi_Avastas getAvastaForOddSign(double degrees) {
		if (degrees >= 0 && degrees < 6) {
			return Baladi_Avastas.Bala;
		} else if (degrees >= 6 && degrees < 12) {
			return Baladi_Avastas.Kumara;
		} else if (degrees >= 12 && degrees < 18) {
			return Baladi_Avastas.Yuva;
		} else if (degrees >= 18 && degrees < 24) {
			return Baladi_Avastas.Vriddh;
		} else {

			return Baladi_Avastas.Mrit;
		}
	}

	

}
