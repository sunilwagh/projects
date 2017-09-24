package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shoban")
@Order(value=5)
public class Shobhan implements Yoga {
	
	private final String feature ="A person born in Saubhagya Yoga will be fortunate. He will be very lucky, talented and enriched with good qualities. "
			+ "He will get respect for his qualities. He will also have great interest for opposite sex. He gets attracted to beautiful women or handsome men.";

	public String getFeature() {
		return feature;
	}

    

}
