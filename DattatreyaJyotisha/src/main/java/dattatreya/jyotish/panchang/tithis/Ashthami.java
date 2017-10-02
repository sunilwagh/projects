package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("ashtami")
@Order(value=8)
public class Ashthami implements Tithi{
	
	public final TithiNames tithiName = TithiNames.ASHTAMI;
	public final GrahaNames ruler = GrahaNames.RAHU;
	public final TithiGroup tithiGroup = TithiGroup.JAYA;
	public final GrahaNames tithiGroupRuler = GrahaNames.MANGAL;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}

}
