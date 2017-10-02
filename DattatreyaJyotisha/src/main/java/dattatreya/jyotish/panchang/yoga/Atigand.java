package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("atigand")
@Order(value=6)
public class Atigand implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Danger or obstacles) — difficult life due to numerous obstacles and accidents; revengeful and angry.");
		return sb.toString();
	}
	
	

}
