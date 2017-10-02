package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shubh")
@Order(value=23)
public class Shubh implements Yoga {

	public String getFeature() {

		StringBuilder sb = new StringBuilder();
		sb.append("(Auspicious) — lustrous body and personality, but problems with health; wealthy, irritable.");
		return sb.toString();
	}

}
