package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("amavasya")
@Order(value=16)
public class Amavasya implements Tithi {
	
	public final GrahaNames ruler = GrahaNames.RAHU;
	public final TithiGroup tithiGroup = TithiGroup.PURNA;
	public final GrahaNames tithiGroupRuler = GrahaNames.GURU;


}
