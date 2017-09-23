package dattatreya.jyotish.nakshatras;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHATRA_DIETY;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_GANA;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("bharani")
@Order(value=2)
public class Bharani implements Nakshatra,Serializable{
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.YAMA;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.SHUKRA;
	private final Tattva TATTVA = Tattva.PRITHVI;

	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.MANUSHYA;
	private static final List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.UGRA;

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
