package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("gar")
@Order(value = 5)
public class Gar implements Karana {

	public String getInfoAboutKarana() {
		StringBuilder sb= new StringBuilder();
		sb.append("They will get their objective by hardwork and effort.");
		return sb.toString();
	}

}
