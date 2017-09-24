package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("ayushman")
@Order(value=3)
public class Ayushman implements Yoga {

	public String getFeature() {
		// TODO Auto-generated method stub
		return null;
	}

}
