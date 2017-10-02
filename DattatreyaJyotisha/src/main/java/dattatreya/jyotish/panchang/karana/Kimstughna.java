package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("kimstughna")
@Order(value = 11)
public class Kimstughna implements Karana {

	public String getInfoAboutKarana() {
		StringBuilder sb= new StringBuilder();
		sb.append("Very lucky. Do charity. Get contentment in life. Quality educationa and wealth.");
		return sb.toString();
	}

}
