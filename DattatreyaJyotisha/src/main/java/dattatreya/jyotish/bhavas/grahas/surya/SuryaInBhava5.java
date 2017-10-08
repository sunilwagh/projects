package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava5")
@Order(value = 5)
public class SuryaInBhava5 implements SuryaInBhava {

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 5th House: \n");
		sb.append("");
		return sb.toString();
	}

}
