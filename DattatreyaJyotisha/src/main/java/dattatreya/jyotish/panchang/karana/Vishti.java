package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vishti")
@Order(value = 8)
public class Vishti implements Karana {

	public String getInfoAboutKarana() {
		StringBuilder sb= new StringBuilder();
		sb.append("Not fortunate");
		return sb.toString();
		}

}
