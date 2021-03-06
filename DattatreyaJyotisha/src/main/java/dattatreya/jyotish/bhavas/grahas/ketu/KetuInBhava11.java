package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava11")
@Order(value=11)
public final class KetuInBhava11 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 11th House: \n");
		sb.append("\n Ketu in the 11th house gives you little pleasure in financial success. However it can give spiritual wealth. Wealth can come suddenly. \n");
		return sb.toString();
	}

}
