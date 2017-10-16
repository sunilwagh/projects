package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava2")
@Order(value=2)
public class ShaniInBhava2 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 2nd House \n");
		sb.append("\n Separation from family and break in education. \n");
		return sb.toString();
	}

}
