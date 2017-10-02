package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("tritiya")
@Order(value=3)
public class Tritiya implements Tithi{

	public final TithiNames tithiName = TithiNames.TRITIYA;
	public final GrahaNames ruler = GrahaNames.MANGAL;
	public final TithiGroup tithiGroup = TithiGroup.JAYA;
	public final GrahaNames tithiGroupRuler = GrahaNames.MANGAL;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
