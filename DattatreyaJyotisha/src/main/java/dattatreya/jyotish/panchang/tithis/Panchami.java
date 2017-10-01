package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("panchami")
@Order(value=5)
public class Panchami implements Tithi{
	
	public final TithiNames tithiName = TithiNames.PANCHAMI;
	public final GrahaNames ruler = GrahaNames.GURU;
	public final TithiGroup tithiGroup = TithiGroup.PURNA;
	public final GrahaNames tithiGroupRuler = GrahaNames.GURU;
	

}
