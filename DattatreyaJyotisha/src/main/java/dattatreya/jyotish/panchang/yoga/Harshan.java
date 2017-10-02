package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("harshan")
@Order(value=14)
public class Harshan implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Thrilling) — intelligent, delights in merriment and humor.");
		return sb.toString();
	}

}
