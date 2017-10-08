package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava3")
@Order(value=3)
public final class ChandraInBhava3 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 3rd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
