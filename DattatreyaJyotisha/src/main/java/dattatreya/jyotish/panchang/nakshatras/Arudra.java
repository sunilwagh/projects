package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("arudra")
@Order(value=6)
public final class Arudra implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.ARUDRA;
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.TIKSHNA;

	public Arudra() {
		addFeatures();
	}
	
	public void addFeatures() {
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

	public static List<String> getFeatures() {
		return features;
	}

	public static void setFeatures(List<String> features) {
		Arudra.features = features;
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}

	
	
	


}
