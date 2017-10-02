package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("siddhi")
@Order(value=16)
public class Siddhi implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"(Success) — skillful and accomplished in several areas; protector and supporter of others.");
		return sb.toString();
	}

}
