package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Tattva;
import util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import util.NakshatraEnumUtil.NAKSHTRA_GANA;
import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

public class Krittika implements Nakshatra{
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.AGNI;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.SURYA;
	private final Tattva TATTVA = Tattva.PRITHVI;
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.MISHRA;
	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.RAKSHASHA;
    private static List<String> features = new ArrayList<String>();


	static {
		
		features.add("Cleansing or cutting");
		features.add("Fostering and encouraging");
		features.add("Bravery");
		features.add("Infidelity");
		features.add("Cheating");
		features.add("Impersonating");
		features.add("Bravery");
		features.add("Restoration of Justice and Goodness");
		features.add("Intelligence");
		features.add("Strong Will Power");
		features.add(
				"Express displeasure by stomping their foot.");
		features.add("Very sharp long term memory and very good at rememebering faces.");
		features.add("Fasting on six consequtive kritikka nakshatra days can give progeny.");

	}
}
