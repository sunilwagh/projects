package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("saubhagya")
@Order(value=4)
public class Saubhagya implements Yoga{

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("Good Fortune - The native will enjoy a comfortable life which is full of opportunities and happiness");
		return sb.toString();
	}

}
