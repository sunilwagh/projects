package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava2")
@Order(value=2)
public final class RahuInBhava2 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return sb.toString();
	}

}
