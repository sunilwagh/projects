package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava2")
@Order(value=2)
public final class GuruInBhava2 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 2nd House: \n");
		sb.append("\nBig Family\n");
		return sb.toString();
	}

}
