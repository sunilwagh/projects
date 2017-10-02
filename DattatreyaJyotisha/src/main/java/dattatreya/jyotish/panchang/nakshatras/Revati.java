package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("pushya")
@Order(value=27)
public final class Revati implements Nakshatra {
	
	private final NakshatraNames nakshatraName = NakshatraNames.REVATI;
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.MRUDU;

	public Revati() {
		addFeatures();
	}

	public void addFeatures() {
		features.add("Ability to nourish, protect and foster one and all");
		features.add("Good sense of direction");
		features.add("Secret evolution and creativity");
		features.add("Spiritual");
		features.add("Accomplished in arts");
		features.add("Possesor of esoteric knowledge");
		features.add("Sensitive and emphathetic");
		features.add("Communicative");
		features.add("Fortunate");
		features.add("Refined and Sophisticated");
		features.add("In the new environment they tend to reamin all of or hide from others");
		features.add("They have broken or damaged front teeth");
		features.add("A Revati spouse is shorter than her");
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public List<String> getFeatures() {
		return features;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	

}
