package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava12")
@Order(value=12)
public final class GuruInBhava12 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 12th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
