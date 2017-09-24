package dattatreya.jyotish.panchang.yoga;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component("vyatipat")
@Order(value=17)
public class Vyatipat implements Yoga {
	
	private final String feature ="According to Vedic Astrology, a person born in Vyatipat Yoga faces many problems in his childhood. As he grows all his sorrows turn into happiness. "
			+ "In adolescence he enjoys a blissful life and gains fame.";
	
	public String getFeature() {
		return feature;
	}

}
