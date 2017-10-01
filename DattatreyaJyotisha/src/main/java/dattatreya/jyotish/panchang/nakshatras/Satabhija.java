package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("satabhija")
@Order(value=24)
public final class Satabhija implements Nakshatra{
	
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.CHARA;
	private static List<String> features = new ArrayList<String>();

	public Satabhija() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Ruthless");
		features.add("Steadfast(obstinate if afflicated)");
		features.add("Healer");
		features.add("Courage");
		features.add("Good Judgement Skill");
		features.add("Ambitious");
		features.add("Futuristic");
		features.add("Addictions");
		features.add("Can create a veil and pierce the veil");
		features.add("Many challenges in life");
		features.add("Illnesses due to hormonal imbalance");
		features.add("They may be snake oil salesman (fraud)");
		features.add("If Rahu is connected to Purva/Uttar Phalguni then the term confine to the bed may be applicable situationally.");
	}


}
