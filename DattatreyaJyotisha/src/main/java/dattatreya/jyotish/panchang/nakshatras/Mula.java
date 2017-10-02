package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("mula")
@Order(value=19)
public final class Mula implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.MULA;
	private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshhatraType = NakshatraTypes.TIKSHNA;
	
	public Mula() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Total Destruction");
		features.add("Transformation");
		features.add("Painful experiences");;
		features.add("Grounded");
		features.add("Self Preservation");
		features.add("Responsible");
		features.add("Goes to the root of things");
		features.add("Unconventional");
		features.add("Rags to riches (VICE VERSA)");
		features.add("Emotional Swings");
		features.add("Good at balancing and might have interest in tight rope walking");
		features.add("Like to use bookmark or curtain/dapery with tassles");
	}


}
