package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava8")
@Order(value=8)
public class ChandraInBhava8 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 8th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
