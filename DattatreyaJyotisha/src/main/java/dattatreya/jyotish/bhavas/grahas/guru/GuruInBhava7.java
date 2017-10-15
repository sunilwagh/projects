package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava7")
@Order(value=7)
public class GuruInBhava7 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 7th House: \n");
		sb.append("\nWill give advice but will not take it. Will be egoistic, will say 'look u shud have taken my advice, now you are in bad state'\n");
		return sb.toString();
	}

}
