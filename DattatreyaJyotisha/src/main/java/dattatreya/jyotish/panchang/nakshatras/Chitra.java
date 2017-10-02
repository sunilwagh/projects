package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("chitra")
@Order(value=14)
public final class Chitra implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.CHITRA;
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.MRUDU;


    public Chitra() {
		addFeatures();

	}

	public void addFeatures() {
		features.add("Beauty");
		features.add("Highly Creative");
		features.add("Good Deeds");
		features.add("Brilliant");
		features.add("Creativity during gloom of life");
		features.add("Ambigiuos or Unbalanced");
		features.add("Sudden flashes of insight");
		features.add("Hardworking");
		features.add("Problem with child and family rivalry");
		features.add("Vindictive or Manipulative");
		features.add("They are very good at queuing up. They are very disciplined at dinner table.");
		features.add("They are very good at ambush marketing and guerilla warfare- taking the enemy by surprise");
		features.add("They may be good mimics");

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
