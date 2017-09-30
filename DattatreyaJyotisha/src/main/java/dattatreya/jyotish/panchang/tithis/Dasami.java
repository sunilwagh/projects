package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("dasami")
@Order(value=10)
public class Dasami implements Tithi {

	public final GrahaNames ruler = GrahaNames.CHANDRA;
}
