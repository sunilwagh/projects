package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Tattva;
import util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import util.NakshatraEnumUtil.NAKSHTRA_GANA;
import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("rohini")
@Order(value=4)
public final class Rohini implements Nakshatra {
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.AGNI;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.CHANDRA;
	private final Tattva TATTVA = Tattva.PRITHVI;
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.STHIRA;
	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.MANUSHYA;
    private static List<String> features = new ArrayList<String>();

	static {

		features.add("Passion");
		features.add("Growth and fertitlity");
		features.add("Abundance");
		features.add("Highly productive and financially sound");
		features.add("Creative");
		features.add("Magnetism");
		features.add("Vehicle and Movement");
		features.add("Family Oriented");
		features.add("Goal Oriented");
		features.add("Jealousy (Natives can be subject to it)");
		features.add("They may consider surrogate and foster mother hood seriously.");
		features.add("Very devoted parent till early childhood.");
		features.add("Separate early from parents");
		features.add("Father in law curse is dangerous for Rohini");
		features.add(
				"Wealthy powerfull and well placed but there weakness is rage. Once their temper flares they lose it. They should chanting 'Om' and 'Gayatri'");

	}

}
