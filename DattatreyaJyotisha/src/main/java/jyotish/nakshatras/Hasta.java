package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("hasta")
@Order(value=13)
public final class Hasta implements Nakshatra{
	
	private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.KSHIPRA;
	
	
	static {
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
    
    
   
    
    

}
