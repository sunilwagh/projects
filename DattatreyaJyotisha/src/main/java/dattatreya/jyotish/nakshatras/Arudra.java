package dattatreya.jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("arudra")
@Order(value=6)
public final class Arudra implements Nakshatra {

	
	private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.TIKSHNA;

	static {

		features.add("Fierce and Sharp");
		features.add("Achiever");
		features.add("Addictions");
		features.add("Researcher or Analytical");
		features.add("Sacrifices");
		features.add("Rash or Impulsive");
		features.add("Emotional");
		features.add("Easily pleased and easily angered");
		features.add("Ability to withstand pressure");
		features.add("Hardworking");
		features.add("Highly prone to mood swings");
		features.add(
				"Women with prominent Ardra may show symptoms of preganancy even when not pregnant. (Psuedosysis)");
		features.add("Patience is their forte, specially Ardra 4th are highly reputed and wealthy.");
	}

}