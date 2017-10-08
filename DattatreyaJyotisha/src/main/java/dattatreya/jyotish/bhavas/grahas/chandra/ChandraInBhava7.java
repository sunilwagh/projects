package dattatreya.jyotish.bhavas.grahas.chandra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("chandraInBhava7")
@Order(value=7)
public class ChandraInBhava7 implements ChandraInBhava {

	public String getInfoAboutChandraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Chandra in 7th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
