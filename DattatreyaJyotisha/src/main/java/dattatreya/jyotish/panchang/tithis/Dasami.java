package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("dasami")
@Order(value=10)
public class Dasami implements Tithi {

	public final GrahaNames ruler = GrahaNames.CHANDRA;
	public final TithiGroup tithiGroup = TithiGroup.Purna;
}
