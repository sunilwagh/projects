package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava4")
@Order(value=4)
public class ShaniInBhava4 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 4th House: \n");
		sb.append("\n Any new thing bought will have scratches. Advisable to donate medicine when buying a car. \n");
		return sb.toString();
	}

}
