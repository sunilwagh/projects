package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("saptami")
@Order(value=7)
public class Saptami implements Tithi{
	
	public final TithiNames tithiName = TithiNames.SAPTAMI;
	public final GrahaNames ruler = GrahaNames.SHANI;
	public final TithiGroup tithiGroup = TithiGroup.BHADRA;
	public final GrahaNames tithiGroupRuler = GrahaNames.BUDHA;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}

}
