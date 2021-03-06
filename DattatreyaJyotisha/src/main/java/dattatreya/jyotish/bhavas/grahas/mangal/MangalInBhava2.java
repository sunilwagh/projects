package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava2")
@Order(value=2)
public final class MangalInBhava2 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Mangal in 2nd House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
