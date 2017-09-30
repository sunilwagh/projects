package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava5")
@Order(value=5)
public final class RahuInBhava5 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("Less from children. Over indulgence in creativity will isolate you from others.");
		return sb.toString();
	}

}
