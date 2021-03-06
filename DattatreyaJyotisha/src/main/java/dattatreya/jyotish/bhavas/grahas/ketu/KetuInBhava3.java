package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava3")
@Order(value=3)
public final class KetuInBhava3 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 3rd House: \n");
		sb.append(
				"Ketu in the 3rd house symbolizes that you live life in an unusual way. There is past life connections with siblings.");
		return sb.toString();
	}

}
