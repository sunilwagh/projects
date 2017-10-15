package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava4")
@Order(value=4)
public final class GuruInBhava4 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 4th House: \n");
		sb.append("\nHave little knowledge but will advise eveyrbody.\n");
		return sb.toString();
	}

}
