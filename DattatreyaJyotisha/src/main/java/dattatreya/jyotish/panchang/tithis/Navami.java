package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("navami")
@Order(value=9)
public class Navami implements Tithi {
	
	public final TithiNames tithiName = TithiNames.NAVAMI;
	public final GrahaNames ruler = GrahaNames.SURYA;
	public final TithiGroup tithiGroup = TithiGroup.RIKTA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHANI;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}

}
