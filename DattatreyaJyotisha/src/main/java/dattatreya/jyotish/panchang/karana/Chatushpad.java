package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chatuspada")
@Order(value = 9)
public class Chatushpad implements Karana{

	public String getInfoAboutKarana() {
	StringBuilder sb= new StringBuilder();
	sb.append("Respect educated people and love animals. They can become animal doctors.");
	return sb.toString();
	}

}
