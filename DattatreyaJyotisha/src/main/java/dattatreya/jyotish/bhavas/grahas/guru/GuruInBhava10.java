package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava10")
@Order(value=10)
public final class GuruInBhava10 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 10th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
