package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("hasta")
@Order(value=13)
public final class Hasta implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.HASTA;
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.KSHIPRA;
	
	 public Hasta() {
			addFeatures();

		}
	
	
	public void addFeatures() {
		features.add("High mental faculty");	
		features.add("Stimulation to do work");
		features.add("Work with hands for gains or dexterous");	
		features.add("Awareness");	
		features.add("Transformation or transforming ability");	
		features.add("Exceptional Children");
		features.add("Perfectionist");	
		features.add("Highly Knowledgable");	
		features.add("Easily Stressed");
		features.add("Charming or Manipulative");
		features.add("Take fencing as a sport");	
		features.add("Benefit from Bhastrika Pranayama");
		features.add("Very Punctual");
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
