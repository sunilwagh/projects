package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava11")
@Order(value=11)
public final class RahuInBhava11 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 11th House: \n");
		sb.append("Best position for Rahu. It can bring much material success.");
		return sb.toString();
	}

}
