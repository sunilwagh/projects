package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava9")
@Order(value=9)
public class KetuInBhava9 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append(
				"Ketu in the ninth house shows a strong need to follow the path of enlightment. Difficult rleationship with parents.");
		return sb.toString();
	}

}
