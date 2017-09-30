package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava4")
@Order(value = 4)
public final class KetuInBhava4 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Ketu in the fourth house is very strong. Emotional problems and difficult relationship with mother.");
		return sb.toString();
	}

}
