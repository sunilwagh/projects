package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ayushman")
@Order(value = 3)
public class Ayushman implements Yoga {

	public String getFeature() {

		StringBuilder sb = new StringBuilder();
		sb.append("Long-lived — good health and longevity, energetic.");
		return sb.toString();
	}

}
