package dattatreya.jyotish.bhavas.grahas.mangal;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("mangalInBhava10")
@Order(value=10)
public class MangalInBhava10 implements MangalInBhava {

	public String getInfoAboutMangalInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		return sb.toString();
	}

}
