package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava5")
@Order(value=5)
public final class GuruInBhava5 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 5th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
