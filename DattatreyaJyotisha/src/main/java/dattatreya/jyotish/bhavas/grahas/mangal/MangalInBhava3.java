package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava3")
@Order(value=3)
public final class MangalInBhava3 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return sb.toString();
	}

}
