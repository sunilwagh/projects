package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("gand")
@Order(value=10)
public class Gand implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Danger or obstacles) — flawed morals or ethics, troublesome personality.");
		return sb.toString();
	}

}
