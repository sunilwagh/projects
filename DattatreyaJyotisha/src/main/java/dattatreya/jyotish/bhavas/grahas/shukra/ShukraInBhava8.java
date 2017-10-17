package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava8")
@Order(value=8)
public class ShukraInBhava8 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 8th House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
