package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava12")
@Order(value=12)
public final class ShukraInBhava12 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 12th House: \n");
		sb.append("\n Sudden Gains \n");
		return sb.toString();
	}

}
