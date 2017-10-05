package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava2")
@Order(value=2)
public class KetuInBhava2 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Ketu in the 2nd house can symbolize a difficult childhood. Because the area is linked to speech the area will indicate speech problems, for example people with speech defects. ");
		return sb.toString();
	}

}
