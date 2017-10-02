package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("sadhya")
@Order(value=22)
public class Sadhya implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(" (Amenable) — well behaved, accomplished manners and etiquette.");
		return sb.toString();
	}

}
