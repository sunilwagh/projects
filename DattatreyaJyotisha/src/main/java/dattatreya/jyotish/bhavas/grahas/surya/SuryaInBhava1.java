package dattatreya.jyotish.bhavas.grahas.surya;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("suryaInBhava1")
@Order(value=1)
public final class SuryaInBhava1 implements SuryaInBhava{

	public String getInfoAboutSuryaInBhava() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("\n Surya in 1st House: \n");
		sb.append("");
		return sb.toString();
	}

}
