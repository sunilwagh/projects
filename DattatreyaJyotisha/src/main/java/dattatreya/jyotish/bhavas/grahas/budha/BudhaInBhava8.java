package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava8")
@Order(value=8)
public final class BudhaInBhava8 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 8th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
