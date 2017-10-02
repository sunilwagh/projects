package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("brahma")
@Order(value=25)
public class Brahma implements Yoga {

	public String getFeature() {
		StringBuilder sb = new StringBuilder();
		sb.append("(Priest, God) — trustworthy and confidential, ambitious, good discernment and judgment.");
		return sb.toString();
	}

}
