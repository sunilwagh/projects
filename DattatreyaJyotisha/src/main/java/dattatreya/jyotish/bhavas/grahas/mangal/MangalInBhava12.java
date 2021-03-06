package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava12")
@Order(value=12)
public final class MangalInBhava12 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Mangal in 12th House: \n");
		sb.append("\n Brothers early death or relation with brother will be spolied. \n");
		return sb.toString();
	}

}
