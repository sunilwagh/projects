package dattatreya.jyotish.bhavas.grahas.ketu;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ketuInBhava12")
@Order(value = 12)
public final class KetuInBhava12 implements KetuInBhava {

	public String getInfoAboutKetuInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Ketu in 12th House: \n");
		sb.append(
				"\n Ketu is a moksha karaka in his own house and we can get spiritual fulfillment and higher understanding. You are introspective and need to be alone a great deal. It represnts the knowledge gained as a part of karma from the continuing cycles of life and death which will be useful. \n");
		return sb.toString();
	}

}
