package dattatreya.jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("mula")
@Order(value=19)
public final class Mula implements Nakshatra{
	
	
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.TIKSHNA;
	
	static {
		
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
