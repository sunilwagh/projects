package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava4")
@Order(value = 4)
public final class SuryaInBhava4 implements SuryaInBhava {

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 4th House: \n");
		sb.append("");
		return sb.toString();
	}

}
