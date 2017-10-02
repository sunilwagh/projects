package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("variyan")
@Order(value=18)
public class Variyan implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"(Comfort) — loves ease and luxury, lazy, lascivious.");
		return sb.toString();
	}

}
