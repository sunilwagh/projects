package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * http://astrobix.com/articles/Parts-of-Panchang-Karana.aspx
 * @author Sunil Sneha
 *
 */

@Component("bav")
@Order(value = 1)
public class Bav implements Karana {
	
	

	public String getInfoAboutKarana() {
		
		StringBuilder sb= new StringBuilder();
		sb.append("People born in this Karana are religious and like to be involved in sacred tasks. They are honest and believe in giving their best to any work that’s assigned to them. They keep their distance from illegal and impious activities. They have a sharp brain and are firmly grounded to reality. That is why do not take flights of fancy. "
				+ "They are respected and loved for their qualities by everybody.");
		return sb.toString();
	}

}
