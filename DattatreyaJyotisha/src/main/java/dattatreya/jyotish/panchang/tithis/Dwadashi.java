package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("dwadashi")
@Order(value=12)
public class Dwadashi implements Tithi {
	
	public final TithiNames tithiName = TithiNames.DWADASHI;
	public final GrahaNames ruler = GrahaNames.BUDHA;
	public final TithiGroup tithiGroup = TithiGroup.BHADRA;
	public final GrahaNames tithiGroupRuler = GrahaNames.BUDHA;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}

}
