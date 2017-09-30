package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava1")
@Order(value=1)
public final class KetuInBhava1 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ability to hold memories. let go of the past or there would be health problems.");
		return sb.toString();
	}

}
