package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("amavasya")
@Order(value=16)
public class Amavasya implements Tithi {
	
	public final GrahaNames ruler = GrahaNames.RAHU;

}
