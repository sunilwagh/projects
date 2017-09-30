package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava6")
@Order(value=6)
public class KetuInBhava6 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Ketu in the fifth house of children/creativity will cause problems with children or creativity.");
		return sb.toString();
	}

}
