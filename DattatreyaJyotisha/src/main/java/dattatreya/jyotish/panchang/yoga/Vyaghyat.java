package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vyaghyat")
@Order(value=13)
public class Vyaghyat implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Beating) — cruel, intent on harming others.");
		return sb.toString();
	}

}
