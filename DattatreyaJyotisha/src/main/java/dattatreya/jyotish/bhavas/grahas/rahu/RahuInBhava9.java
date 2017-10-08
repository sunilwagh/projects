package dattatreya.jyotish.bhavas.grahas.rahu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("rahuInBhava9")
@Order(value = 9)
public final class RahuInBhava9 implements RahuInBhava {

	public String getInfoAboutRahuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Rahu in 9th House: \n");
		sb.append(
				"Rahu in the 9th house, you will need to control people through knowledge. You have a potential to become a great teacher but poorly placed it will result in to extreme self righteousness and teaching wrong kind of doctrine.Cult gurus and politicians have this.");
		return sb.toString();
	}

}
