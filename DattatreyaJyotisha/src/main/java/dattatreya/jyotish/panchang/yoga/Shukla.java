package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukla")
@Order(value=24)
public class Shukla implements Yoga {

	public String getFeature() {

		StringBuilder sb = new StringBuilder();
		sb.append(" (Bright White) — garrulous and flighty, impatient and impulsive; unsteady and changeable mind.");
		return sb.toString();

}
}