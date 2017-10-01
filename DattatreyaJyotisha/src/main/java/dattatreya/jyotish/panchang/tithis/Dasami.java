package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("dasami")
@Order(value=10)
public class Dasami implements Tithi {

	public final TithiNames tithiName = TithiNames.DASAMI;
	public final GrahaNames ruler = GrahaNames.CHANDRA;
	public final TithiGroup tithiGroup = TithiGroup.PURNA;
	public final GrahaNames tithiGroupRuler = GrahaNames.GURU;
}
