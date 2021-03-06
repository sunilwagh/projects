package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava9")
@Order(value=9)
public class ShaniInBhava9 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 9th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
