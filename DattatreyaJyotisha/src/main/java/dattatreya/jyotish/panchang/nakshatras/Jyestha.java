package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("jyestha")
@Order(value=18)
public final class Jyestha implements Nakshatra{
	
	
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.TIKSHNA;

	public Jyestha() {
		addFeatures();

	}
	
	public void addFeatures() {
		features.add("Sovereign and Senior Most");
		features.add("Ability to defeat and overcome challenges");
		features.add("Mental Fortitude");
		features.add("Fierce");
		features.add("Work towards economic prosperity");
		features.add("Can suffer the wrath of married woman");
		features.add("Amorous and seducer or virile");
		features.add("Addictions");
		features.add("Moving in to unchartered territory");
		features.add("Dysfunctional family (if afflicted, may victimize family members)");
		features.add("They do well when it doesnt involve being part of a team. They fail to acknowledge the contribution of others - haughty");
		features.add("Change their jobs or professions frequently -uncertain about their goals.");
	}

}
