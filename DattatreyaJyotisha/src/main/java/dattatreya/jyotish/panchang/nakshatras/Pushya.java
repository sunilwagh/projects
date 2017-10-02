package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;

@Component("pushya")
@Order(value=8)
public final class Pushya implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.PUSHYA;
	private static List<String> features = new ArrayList<String>();

	public Pushya(){
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Nourishing and caring or giving");
		features.add("Spiritual, Divine Knowledge or Powers");
	    features.add("Prosperous");
		features.add("Benevelonce or Generous");
		features.add("Protective");
		features.add("Dependable,Reliable or Helpful");
		features.add("Patience and Goal Oriented");
		features.add("Can be vicitimized by others or taken advantage of");
		features.add("Hospitable");
		features.add("Marital Issues");
		features.add("They benefit from consuming amla (indian gooseberry)");
		features.add("Monogamy is not their trait");
		features.add("Have a large appetite");
        features.add("Flamboyant");
	}
	
	
	

}
