package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava5")
@Order(value=5)
public final class MangalInBhava5 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return sb.toString();
	}

}
