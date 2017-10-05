package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava6")
@Order(value = 6)
public class KetuInBhava6 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Ketu in the 6th house creates powerful enemies (real and imagined) and certain disenchantment with work. Sudden illness can happen. Unhappy with day to day life. ");
		return sb.toString();
	}

}
