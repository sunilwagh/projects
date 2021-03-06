package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava11")
@Order(value=11)
public final class BudhaInBhava11 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 11th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
