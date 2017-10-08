package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava10")
@Order(value=10)
public final class KetuInBhava10 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 10th House: \n");
		sb.append("\n Ketu in the 10th house gives you alternate career or a career in history,astrology or antiques. \n");
		return sb.toString();
	}

}
