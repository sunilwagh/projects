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

@Component("magha")
@Order(value=10)
public final class Magha implements Nakshatra{
	
	private final NAKSHATRA_DIETY Diety = NAKSHATRA_DIETY.PITRI;
	private final Name_Of_Graha NAKSHATRA_LORD = Name_Of_Graha.KETU;
	private final Tattva TATTVA = Tattva.PRITHVI;

	private final NAKSHTRA_GANA GANA = NAKSHTRA_GANA.RAKSHASHA;
	private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.UGRA;

	static {
	features.add("Magnificient");	
	features.add("Achievement");
	features.add("Hereditary or Ancestors");	
	features.add("Traditional or Ancient Knowledge");	
	features.add("Authority");	
	features.add("Ethical");
	features.add("Egoistic");	
	features.add("Left Hand of Magic (darker side of tantra)");	
	features.add("Duty or Honor");
	features.add("Reserved");
	features.add("They make friends very easily and hate being separated from them.");	
	features.add("They may speak in very low tones");
	features.add("They may have bruxism or grinding their teeth while asleep.");
	}

}
