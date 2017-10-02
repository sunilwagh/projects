package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vishkumbha")
@Order(value=1)
public class Vishkumbha implements Yoga {

	public String getFeature() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("(Supported) — prevails over others, victorious over enemies, obtains property, wealthy.");
		return sb.toString();
	}

}
