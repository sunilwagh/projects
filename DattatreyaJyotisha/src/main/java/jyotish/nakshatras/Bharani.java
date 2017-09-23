package jyotish.nakshatras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Tattva;
import util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import util.NakshatraEnumUtil.NAKSHTRA_GANA;
import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

public class Bharani implements Nakshatra,Serializable{
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.YAMA;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.SHUKRA;
	private final Tattva TATTVA = Tattva.PRITHVI;
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.KSHIPRA;
	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.MANUSHYA;
	private static final List<String> features = new ArrayList<String>();

	static {

		features.add("Fast and swift");
		features.add("Constrained");
	    features.add("Mature");
		features.add("Secretive");
		features.add("Sustenance");
		features.add("Generous");
		features.add("Detached");
		features.add("Faces Struggle");
		features.add("Sexual expression is seen");
		features.add("Upholder of truth");
		features.add("Many transformation are seen");
		features.add("Desire to have a large family");
		features.add("Have a large appetite");
        features.add("Wealth");
	}
	
	
}
