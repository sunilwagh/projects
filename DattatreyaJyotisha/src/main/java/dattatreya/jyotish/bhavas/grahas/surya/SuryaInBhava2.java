package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava2")
@Order(value = 2)
public final class SuryaInBhava2 implements SuryaInBhava {

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 2nd House: \n");
		sb.append("");
		return sb.toString();
	}

}
