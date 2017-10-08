package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava9")
@Order(value=9)
public final class BudhaInBhava9 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 9th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
