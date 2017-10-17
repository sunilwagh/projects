package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava11")
@Order(value=11)
public final class ShukraInBhava11 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 11th House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
