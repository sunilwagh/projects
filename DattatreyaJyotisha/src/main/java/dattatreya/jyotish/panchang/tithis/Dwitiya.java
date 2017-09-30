package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("dwitiya")
@Order(value=1)
public class Dwitiya implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.CHANDRA;
	public final TithiGroup tithiGroup = TithiGroup.Badra;

}
