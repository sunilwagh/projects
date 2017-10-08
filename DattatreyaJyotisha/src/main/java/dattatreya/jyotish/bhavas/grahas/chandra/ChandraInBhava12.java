package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava12")
@Order(value=12)
public final class ChandraInBhava12 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 12th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
