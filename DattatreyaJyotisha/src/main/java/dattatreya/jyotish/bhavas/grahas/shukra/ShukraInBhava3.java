package dattatreya.jyotish.bhavas.grahas.shukra;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shukraInBhava3")
@Order(value=3)
public class ShukraInBhava3 implements ShukraInBhava {

	public String getInfoAboutShukraInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shukra in 3rd House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
