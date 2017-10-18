package dattatreya.jyotish.bhavas.grahas.budha;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("budhaInBhava7")
@Order(value=7)
public final class BudhaInBhava7 implements BudhaInBhava {

	public String getInfoAboutBudhaInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Budha in 8th House: \n");
		sb.append("\n  Since Mercury is a dual planet and this is the house of commitment, you could have to choose between two people, or be married twice or have two long-term relationships in your life. You could also be drawn to those younger than yourself.\n");
		return sb.toString();
	}

}
