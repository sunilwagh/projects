package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shoban")
@Order(value = 5)
public class Shobhan implements Yoga {

	public String getFeature() {

		StringBuilder sb = new StringBuilder();
		sb.append("(Splendor) — lustrous body and demeanor sensualist, obsessed with sex.");
		return sb.toString();
	}

}
