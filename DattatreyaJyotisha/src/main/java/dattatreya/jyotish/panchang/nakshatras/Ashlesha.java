package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("ashlesha")
@Order(value = 9)
public final class Ashlesha implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.ASHLESHA;
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.TIKSHNA;

	public Ashlesha() {

		addFeatures();
	}

	public void addFeatures() {
		features.add("Clinging");
		features.add("Dangerous or Devious");
		features.add("Deceptive");
		features.add("Intuitive or Perception or Wisdom");
		features.add("Concentration");
		features.add("Sexual");
		features.add("Instinctive");
		features.add("Genetic Issue or Genetic Heritage");
		features.add("Calculative");
		features.add("Spiritual Awakening");
		features.add("They consume or should consume Spirulina");
		features.add("They could be very keen on activating their Kundalini");
		features.add(
				"They are willing to go any extent for their own folks. 1st part is good for politics and social work.");

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
