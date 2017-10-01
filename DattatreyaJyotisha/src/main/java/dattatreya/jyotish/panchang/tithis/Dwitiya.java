package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("dwitiya")
@Order(value=1)
public class Dwitiya implements Tithi{
	
	public final TithiNames tithiName = TithiNames.DWITIYA;
	public final GrahaNames ruler = GrahaNames.CHANDRA;
	public final TithiGroup tithiGroup = TithiGroup.BHADRA;
	public final GrahaNames tithiGroupRuler = GrahaNames.BUDHA;

}
