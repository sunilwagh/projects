package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava1")
@Order(value=1)
public final class RahuInBhava1 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 1st House: \n");
        sb.append("\n Rahu in 1st house can make a person intensely materialistic and ambition. Desire to get wealth and power is strong. The native wants to leave a personal mark on the society. \n");
		return sb.toString();
	}

}
