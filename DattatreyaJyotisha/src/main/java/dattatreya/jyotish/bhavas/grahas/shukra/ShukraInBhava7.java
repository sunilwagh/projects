package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava7")
@Order(value=7)
public class ShukraInBhava7 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 7th House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
