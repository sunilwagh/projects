package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("dwadashi")
@Order(value=12)
public class Dwadashi implements Tithi {
	
	public final GrahaNames ruler = GrahaNames.BUDHA;
	public final TithiGroup tithiGroup = TithiGroup.BHADRA;
	public final GrahaNames tithiGroupRuler = GrahaNames.BUDHA;

}
