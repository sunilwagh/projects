package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava9")
@Order(value=9)
public class GuruInBhava9 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 9th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
