package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava7")
@Order(value=7)
public class GuruInBhava7 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 7th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
