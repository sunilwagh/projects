package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava1")
@Order(value=1)
public final class KetuInBhava1 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 1st House: \n");
		sb.append("Ketu in the lagna then there is ability to hold memories. Let go of the past or there would be health problems.");
		return sb.toString();
	}

}
