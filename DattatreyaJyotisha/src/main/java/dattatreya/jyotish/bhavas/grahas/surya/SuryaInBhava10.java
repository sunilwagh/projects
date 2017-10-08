package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava10")
@Order(value=10)
public final class SuryaInBhava10 implements SuryaInBhava{

	public String getInfoAboutSuryaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 10th House: \n");
		sb.append("");
		return sb.toString();
	}

}
