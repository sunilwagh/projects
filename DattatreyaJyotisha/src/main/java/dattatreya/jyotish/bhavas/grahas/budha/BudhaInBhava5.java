package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava5")
@Order(value=5)
public final class BudhaInBhava5 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 5th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
