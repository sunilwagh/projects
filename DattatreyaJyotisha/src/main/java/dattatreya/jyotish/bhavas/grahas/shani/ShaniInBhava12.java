package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava12")
@Order(value=12)
public class ShaniInBhava12 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 12th House: \n");
		sb.append("\n Delay in all the work \n");
		return sb.toString();
	}

}
