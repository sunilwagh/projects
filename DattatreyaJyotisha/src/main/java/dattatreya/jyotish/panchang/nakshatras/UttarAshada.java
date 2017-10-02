package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

public final class UttarAshada implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.UTTAR_ASHADA;
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.STHIRA;

	public UttarAshada() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Unchallenged Victory");
		features.add("Strong Willpower");
		features.add("Forbearance");
		features.add("Righteousness");
		features.add("Regenerative ability");
		features.add("Confidence or certain about self");
		features.add("Unafraid of confrontation");
		features.add("Skilled at teamwork");
		features.add("Difficulty in finding partner");
		features.add("Highly ambitious");
		features.add("Trouble with getting along Rohini and Ashlesha");
		features.add("Swift in their actions");
		features.add("Good boxers and good at sport with quick reflexes");
	}

	public static List<String> getFeatures() {
		return features;
	}

	public static void setFeatures(List<String> features) {
		UttarAshada.features = features;
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	


}
