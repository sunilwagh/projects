package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("sukarma")
@Order(value=7)
public class Sukarma implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"(Virtuous) — performs noble deeds, magnanimous and charitable, wealthy.");
		return sb.toString();
	}

}
