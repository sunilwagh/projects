package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vridhi")
@Order(value=11)
public class Vridhi implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Growth) — intelligent, opportunistic and discerning; life constantly improves with age.");
		return sb.toString();
	}

}
