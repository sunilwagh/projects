package dattatreya.jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_GANA;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("kritikka")
@Order(value=3)
public class Krittika implements Nakshatra{
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.AGNI;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.SURYA;
	private final Tattva TATTVA = Tattva.PRITHVI;

	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.RAKSHASHA;
    private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.MISHRA;


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
