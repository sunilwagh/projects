package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava6")
@Order(value=6)
public class GuruInBhava6 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 6th House: \n");
		sb.append("\nJupiter in 6th suppresses the disease factor, protects from debt and also enemies. It can give some difference of opinion with the children. Important point to remember is that Jupiter can suppress the house where it sits but its aspect is more powerful. Hence being in 6th, it aspects 10th house and can give power and position in the workplace.  \n");
		return sb.toString();
	}

}
