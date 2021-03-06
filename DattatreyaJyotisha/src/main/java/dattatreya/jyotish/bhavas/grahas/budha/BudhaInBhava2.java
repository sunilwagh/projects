package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava2")
@Order(value=2)
public final class BudhaInBhava2 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 2nd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
