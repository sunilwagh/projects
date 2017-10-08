package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava8")
@Order(value=8)
public final class RahuInBhava8 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 8th House: \n");
		sb.append(
				"Urge to explore the dark recess of the society. Urge to dive in to the still dark recess of human knowledge is strong.");
		return sb.toString();
	}

}
