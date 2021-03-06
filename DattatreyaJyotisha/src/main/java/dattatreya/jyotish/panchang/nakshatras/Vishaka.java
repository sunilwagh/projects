package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("vishaka")
@Order(value=16)
public final class Vishaka implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.VISHAKA;
	private final NakshatraTypes nakshatraType = NakshatraTypes.MISHRA;
	private final List<String> features = new ArrayList<String>();
	
	public Vishaka() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Manifestation");			
		features.add("New Oppurtunities");				
		features.add("Courageous");				
		features.add("Indiscriminate");				
		features.add("Sexual Gratification");				
		features.add("Highly Individualistic and Self Reliant");				
		features.add("Aspire for higher position and authority in life");				
		features.add("Ability to overcome obstacles");				
		features.add("Unforgiving or Indulgences or");				
		features.add("Determination and Persistance");				
		features.add("Enthusiastic");				
		features.add("The diety is Indragni, who are binary. Indra is zero and Agni is one. There is internal conflict between opposing desires.");				
		features.add("Always in state of readiness. Always focussed like Arjuna focussed on the eye on the fish.");
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}

	public List<String> getFeatures() {
		return features;
	}
	
	

}
