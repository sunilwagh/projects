package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("navami")
@Order(value=9)
public class Navami implements Tithi {
	
	public final GrahaNames ruler = GrahaNames.SURYA;

}
