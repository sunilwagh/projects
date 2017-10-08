package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava4")
@Order(value=4)
public final class MangalInBhava4 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Mangal in 4th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
