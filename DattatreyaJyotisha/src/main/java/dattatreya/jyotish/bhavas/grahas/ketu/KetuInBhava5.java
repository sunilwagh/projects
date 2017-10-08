package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava5")
@Order(value=5)
public final class KetuInBhava5 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 5th House: \n");
		sb.append(
				"Ketu in the 5th house of children/creativity will cause problems with children or creativity.");
		return sb.toString();
	}

}
