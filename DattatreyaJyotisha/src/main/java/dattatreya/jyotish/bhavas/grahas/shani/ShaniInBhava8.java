package dattatreya.jyotish.bhavas.grahas.shani;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("shaniInBhava8")
@Order(value=8)
public class ShaniInBhava8 implements ShaniInBhava {

	public String getInfoAboutShaniInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Shani in 8th House: \n");
		sb.append("\n Long life but bedridden \n");
		return sb.toString();
	}

}
