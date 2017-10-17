package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava2")
@Order(value=2)
public class ShukraInBhava2 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 2nd House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
