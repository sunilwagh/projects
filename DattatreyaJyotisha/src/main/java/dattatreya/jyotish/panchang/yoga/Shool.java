package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shool")
@Order(value=9)
public class Shool implements Yoga {

	public String getFeature() {

		StringBuilder sb = new StringBuilder();
		sb.append("(Spear, Pain) — confrontational and contrary, quarrelsome, angry.");
		return sb.toString();
	}

}
