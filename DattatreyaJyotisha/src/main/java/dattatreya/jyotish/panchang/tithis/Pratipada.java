package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("pratipada")
@Order(value=1)
public class Pratipada implements Tithi{
	
	public final TithiNames tithiName = TithiNames.PRATIPADA;
	public final GrahaNames ruler = GrahaNames.SURYA;
	public final TithiGroup tithiGroup = TithiGroup.NANDA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHUKRA;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
