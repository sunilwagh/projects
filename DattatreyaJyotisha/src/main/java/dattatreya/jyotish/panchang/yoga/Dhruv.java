package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("dhruv")
@Order(value=12)
public class Dhruv implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("Constant — steady character, able to concentrate and persist, wealthy.");
		return sb.toString();
	}


}
