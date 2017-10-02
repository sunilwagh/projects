package dattatreya.jyotish.panchang.karana;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("nag")
@Order(value = 10)
public class Nag implements Karana {

	public String getInfoAboutKarana() {
		// TODO Auto-generated method stub
		return null;
	}

}
