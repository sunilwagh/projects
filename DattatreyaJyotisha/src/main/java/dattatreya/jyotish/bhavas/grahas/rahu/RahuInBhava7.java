package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava7")
@Order(value = 7)
public final class RahuInBhava7 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {

		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 7th House: \n");
		sb.append(
				"Relationships will dominate your life and you have to experience them in every hue. Learn to relate to others and acknowledge there are two sides of any story.");
		return sb.toString();
	}

}
