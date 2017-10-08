package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava12")
@Order(value=12)
public final class RahuInBhava12 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 12th House: \n");
		sb.append("Rahu creates a desire for highest level of Karmic salvation and transformation and leads you to highest spiritual path. On a non spiritual level, it can lead to over "
				+ "spending and wastage of effort on sex");
		return sb.toString();
	}

}
