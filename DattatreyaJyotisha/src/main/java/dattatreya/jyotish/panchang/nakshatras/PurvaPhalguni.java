package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("purvaphalguni")
@Order(value=11)
public final class PurvaPhalguni implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.PURVA_PHALGUNI;
	private final NakshatraTypes nakshatraType = NakshatraTypes.UGRA;
	private final List<String> features = new ArrayList<String>();

	public PurvaPhalguni()
	{
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Union or Procreation");	
		features.add("Renewal or Relaxation or Comfort");	
		features.add("Sexual Passion");	
		features.add("Indulgence");	
		features.add("Dramatic");	
		features.add("Gentle");	
		features.add("Over Achievers");	
		features.add("Luxury");	
		features.add("Talented");	
		features.add("Gifted");	
		features.add("They have cluttered workspace due to tendency to hoard");
		features.add("They buy even when somethign is not required.");	
		features.add("They have mark or scar near the eye.");
		features.add("Fashionistas");	
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
