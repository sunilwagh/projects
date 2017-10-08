package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava9")
@Order(value = 9)
public class SuryaInBhava9 implements SuryaInBhava {

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 9th House: \n");
		sb.append("");
		return sb.toString();
	}

}
