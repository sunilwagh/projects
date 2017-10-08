package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava8")
@Order(value = 8)
public final class KetuInBhava8 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {

		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 8th House: \n");
		sb.append(" Reason of death is unknown");
		return sb.toString();

	}

}
