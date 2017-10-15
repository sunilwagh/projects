package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava11")
@Order(value=11)
public final class GuruInBhava11 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 11th House: \n");
		sb.append("\nGood friend circle \n");
		return sb.toString();
	}

}
