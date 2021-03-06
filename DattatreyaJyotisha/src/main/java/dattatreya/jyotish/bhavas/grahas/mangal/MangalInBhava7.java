package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava7")
@Order(value=7)
public final class MangalInBhava7 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Mangal in 7th House: \n");
		sb.append("\n \n");
		return sb.toString();
	}

}
