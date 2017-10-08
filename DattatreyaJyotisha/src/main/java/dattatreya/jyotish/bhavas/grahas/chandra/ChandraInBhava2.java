package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava2")
@Order(value=2)
public final class ChandraInBhava2 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 2nd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
