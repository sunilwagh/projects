package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("purnima")
@Order(value=15)
public class Purnima implements Tithi{
	
	public final TithiNames tithiName = TithiNames.PURNIMA;
	public final GrahaNames ruler = GrahaNames.SHANI;
	public final TithiGroup tithiGroup = TithiGroup.PURNA;
	public final GrahaNames tithiGroupRuler = GrahaNames.GURU;

}
