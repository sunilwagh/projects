package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava1")
@Order(value=1)
public final class GuruInBhava1 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 1st House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
