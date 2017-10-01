package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("ekadashi")
@Order(value=11)
public class Ekadashi implements Tithi {
	
	public final TithiNames tithiName = TithiNames.EKADASHI;
	public final GrahaNames ruler = GrahaNames.MANGAL;
	public final TithiGroup tithiGroup = TithiGroup.NANDA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHUKRA;

}
