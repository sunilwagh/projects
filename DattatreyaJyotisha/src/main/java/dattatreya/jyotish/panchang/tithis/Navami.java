package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("navami")
@Order(value=9)
public class Navami implements Tithi {
	
	public final GrahaNames ruler = GrahaNames.SURYA;
	public final TithiGroup tithiGroup = TithiGroup.Rikta;

}
