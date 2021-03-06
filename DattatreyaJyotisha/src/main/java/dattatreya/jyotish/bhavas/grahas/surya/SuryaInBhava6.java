package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava6")
@Order(value = 6)
public class SuryaInBhava6 implements SuryaInBhava {

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 6th House: \n");
		sb.append("");
		return sb.toString();
	}

}
