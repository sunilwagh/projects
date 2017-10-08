package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava3")
@Order(value=3)
public final class GuruInBhava3 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 3rd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
