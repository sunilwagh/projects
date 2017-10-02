package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vaidhirithi")
@Order(value=27)
public class Vaidhirithi implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"(Poor Support) — critical, scheming nature; powerful and overwhelming mentally or physically.");
		return sb.toString();
	}

}
