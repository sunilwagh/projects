package dattatreya.jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("mrighashirsha")
@Order(value=5)
public final class Mrighashirsha implements Nakshatra {

	private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.MRUDU;

	static {

		features.add("Joyous");
		features.add("Soft,Mild and Gentle");
		features.add("Inquisitive");
		features.add("Suspicious");
		features.add("Licentious");
		features.add("Compassionate");
		features.add("Marital Issue");
		features.add("Ficleness or Inconsistency");
		features.add("Wild range of experiences in life before settling");
		features.add("Has a special power or quality");
		features.add("Very good reader of maps and keen sense of direction.");
		features.add("Very good at track and field events.");
		features.add("Hardworkers and research could be scientist.");
	}

}