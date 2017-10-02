package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("balav")
@Order(value = 2)
public class Balav implements Karana {

	public String getInfoAboutKarana() {
		StringBuilder sb= new StringBuilder();
		sb.append("Spiritual nature to a person");
		return sb.toString();
	}

}
