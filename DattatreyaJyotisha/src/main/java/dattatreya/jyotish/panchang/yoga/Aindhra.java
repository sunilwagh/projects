package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("aindhra")
@Order(value=26)
public class Aindhra implements Yoga{

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Chief) — interest in education and knowledge; helpful, well-off.");
		return sb.toString();
	}

}
