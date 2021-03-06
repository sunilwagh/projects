package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("swati")
@Order(value = 15)
public final class Swati implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.SWATI;
	private final NakshatraTypes nakshatraType = NakshatraTypes.CHARA;
	private static List<String> features = new ArrayList<String>();

	public Swati() {
          addFeatures();
	}

	public void addFeatures() {
		features.add("Transformation");
		features.add("Individualistic or Independent");
		features.add("Dextorous and Resourceful");
		features.add("Travel and Speed");
		features.add("Hardworking");
		features.add("Freedom Loving");
		features.add("Powerful");
		features.add("Dynamic Achiever");
		features.add("Unforgiving or Indulgences or");
		features.add("Impulsive");
		features.add("Fearless");
		features.add("They love spending a long time in the bathtub");
		features.add("Very good with multiple musical instruments");
		features.add("Could have a medicinal herb garden");
	}

	public static List<String> getFeatures() {
		return features;
	}

	public static void setFeatures(List<String> features) {
		Swati.features = features;
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	

}
