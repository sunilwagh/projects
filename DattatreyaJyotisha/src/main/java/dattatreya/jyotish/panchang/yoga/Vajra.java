package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vajra")
@Order(value=15)
public class Vajra implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"(Diamond, Thunderbolt) — well-off, lecherous, unpredictable, forceful.");
		return sb.toString();
	}

}
