package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;


import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Tattva;
import util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import util.NakshatraEnumUtil.NAKSHTRA_GANA;
import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

public final class Ashwini implements Nakshatra {
	
	private static final NAKSHATRA_DIETY Diety=NAKSHATRA_DIETY.ASHWINI_KUMARS;
	private static final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.KETU;
	private static final Tattva TATTVA = Tattva.PRITHVI;
	private static final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.KSHIPRA;
	private static final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.DEVA;
	

		private static List<String> features = new ArrayList<String>();

	static {

		features.add("Fast and swift");
		features.add("Helpful");
		features.add("Travelers");
		features.add("Love for horses");
		features.add("Knower of secret knowledge");
		features.add("Charming,Elegant and Stylist");
		features.add("Skilled at healing");
		features.add("Have a strange association with number 3");
		features.add("Impulsive behaviour");
		features.add("Match Maker or Breaker");
		features.add(
				"Best people to be appointed as the head of task force - group of people especially organized for work.");
		features.add("Love honey or maybe required to consume honey as medication.");
		features.add("While talking they like to look at themsleves in the mirror.");

	}

	

}
