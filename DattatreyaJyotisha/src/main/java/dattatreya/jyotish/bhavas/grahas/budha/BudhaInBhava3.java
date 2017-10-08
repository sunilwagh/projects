package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava3")
@Order(value=3)
public final class BudhaInBhava3 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 3rd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
