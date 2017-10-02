package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("paridh")
@Order(value=19)
public class Paridh implements Yoga{

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Obstruction) — encounters many obstacles to progress in life; irritable and meddlesome.");
		return sb.toString();
	}

}
