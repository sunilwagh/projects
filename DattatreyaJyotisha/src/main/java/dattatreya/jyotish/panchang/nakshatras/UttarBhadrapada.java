package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

public final class UttarBhadrapada implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.UTTAR_BHADRAPADA;
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.STHIRA;

	public UttarBhadrapada() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Ability to provide stability");
		features.add("Wisdom");
		features.add("Acts rather than react");
		features.add("Restrained");
		features.add("Ability to see all side of things and work out all things");
		features.add("Interest in occult or psychic ability");
		features.add("Shy and reserved (lazy if afflicated)");
		features.add("Prosperity");
		features.add("Travelers");
		features.add("Careless if afflicted");
		features.add("They are highly knowledgeable people - like Vasuki the serpent god of earth treasure");
		features.add("They are generous in sharing this knowledge");
		features.add("They may have a slow gait");
		features.add("Ahirbudhnya is connected with Ketu. Ketu's placement is important.");
	}

	public static List<String> getFeatures() {
		return features;
	}

	public static void setFeatures(List<String> features) {
		UttarBhadrapada.features = features;
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	


}
