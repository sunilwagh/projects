package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava9")
@Order(value=9)
public final class MangalInBhava9 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Mangal in 9th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
