package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava7")
@Order(value=7)
public final class KetuInBhava7 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 7th House: \n");
		sb.append(
				"Ketu in the 7th house makes you feel internally dissatisfied with the relationship you may create problems which may cause your partner to leave.");
		return sb.toString();
	}

}
