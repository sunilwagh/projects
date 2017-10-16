package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava11")
@Order(value=11)
public final class ShaniInBhava11 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 11th House: \n");
		sb.append("\n  \n");
		return sb.toString();
	}

}
