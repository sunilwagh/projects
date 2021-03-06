package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava10")
@Order(value=10)
public final class RahuInBhava10 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 10th House: \n");
		sb.append("\n A belief that you should make a name for yourself. \n");
		return sb.toString();
	}

}
