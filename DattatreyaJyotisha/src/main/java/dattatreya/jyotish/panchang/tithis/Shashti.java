package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("shasthi")
@Order(value=6)
public class Shashti implements Tithi{
	
	public final TithiNames tithiName = TithiNames.SHASHTI;
	public final GrahaNames ruler = GrahaNames.SHUKRA;
	public final TithiGroup tithiGroup = TithiGroup.NANDA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHUKRA;

}
