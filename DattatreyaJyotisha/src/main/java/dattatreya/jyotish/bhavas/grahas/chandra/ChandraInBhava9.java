package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava9")
@Order(value=9)
public class ChandraInBhava9 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 9th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
