package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("ashtami")
@Order(value=8)
public class Ashthami implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.RAHU;

}
