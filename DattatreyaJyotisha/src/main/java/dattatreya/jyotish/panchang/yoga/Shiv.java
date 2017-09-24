package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shiv")
@Order(value=20)
public class Shiv implements Yoga {

	private final String feature ="A person born in Shiv Yoga is intelligent and loves to help others. He is not self-centered and he abandons his desires for others. "
			+ "He is an honest and kind-hearted person. He gets respect and honor in the society because of his simple nature.";

	public String getFeature() {
		return feature;
	}
	
}
