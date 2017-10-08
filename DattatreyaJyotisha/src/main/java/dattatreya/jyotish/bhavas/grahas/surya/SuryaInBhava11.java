package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava11")
@Order(value=11)
public class SuryaInBhava11 implements SuryaInBhava{

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 11th House: \n");
		sb.append("");
		return sb.toString();
	}

}
