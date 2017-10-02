package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("preeti")
@Order(value=2)
public class Preeti implements Yoga {

public String getFeature() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("(Fondness) — well-liked, attracted to the opposite sex, enjoys life with contentment.");
		return sb.toString();
	}

}
