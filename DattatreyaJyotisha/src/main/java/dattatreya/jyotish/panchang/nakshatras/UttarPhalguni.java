package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("uttarphalguni")
@Order(value=12)
public final class UttarPhalguni implements Nakshatra{
	
	private static List<String> features = new ArrayList<String>();

	static {
		features.add("Prosperity through Marriage");				
		features.add("Chivalry or Honor");				
		features.add("Protective or Popular");				
		features.add("Self Dependent Self Confident");				
		features.add("Competitive");				
		features.add("Stable");				
		features.add("Flexible");				
		features.add("Testing Periods");				
		features.add("Ability to see beyond mundane");			
		features.add("Victory");				
		features.add("They are perfectionists. They have every 'i' dotted and every 't' crossed. They have eye for detail.");				
		features.add( "They have strong sense of smell and dislike perfume.");				
		features.add("They are aggressive and unpredictable.");		
	}

}
