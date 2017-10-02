package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("drithi")
@Order(value=8)
public class Drithi implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Determination — enjoys the wealth, goods and spouses of others; indulges in the hospitality of others.");
		return sb.toString();
	}

}
