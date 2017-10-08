package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava4")
@Order(value=4)
public final class RahuInBhava4 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 4th House: \n");
		sb.append("");
		return sb.toString();
	}

}
