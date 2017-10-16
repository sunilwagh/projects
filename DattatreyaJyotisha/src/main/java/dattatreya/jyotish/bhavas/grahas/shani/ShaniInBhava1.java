package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava1")
@Order(value=1)
public final class ShaniInBhava1 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 1st House: \n");
		sb.append("\n Poor Health or Loss of Money \n");
		return sb.toString();
	}

}
