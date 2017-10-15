package dattatreya.jyotish.bhavas.grahas.guru;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("guruInBhava8")
@Order(value=8)
public class GuruInBhava8 implements GuruInBhava {

	public String getInfoAboutGuruInBhava() {
		StringBuilder sb = new StringBuilder();
		sb.append("\n Guru in 8th House: \n");
		sb.append("\nWill have blessings of departed. May get everything but the children would be away. Jupiter in 8th protects a person from accidents and gives longevity since it is a jeevakaraka planet. It gives all material pleasures in 8th except that it can affect the relations with the children i.e. one might not get the support from kids as one would have expected in the old age.  \n");
		return sb.toString();
	}

}
