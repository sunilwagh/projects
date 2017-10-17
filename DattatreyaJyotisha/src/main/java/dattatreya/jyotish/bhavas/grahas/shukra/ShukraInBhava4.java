package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava4")
@Order(value=4)
public class ShukraInBhava4 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 4th House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
