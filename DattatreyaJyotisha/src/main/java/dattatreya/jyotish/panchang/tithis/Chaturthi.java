package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("chaturthi")
@Order(value=4)
public class Chaturthi implements Tithi{
	
	public final TithiNames tithiName = TithiNames.CHATURTHI;
	public final GrahaNames ruler = GrahaNames.BUDHA;
	public final TithiGroup tithiGroup = TithiGroup.RIKTA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHANI;
	
	public String getInfoOnTithi() {
		// TODO Auto-generated method stub
		return null;
	}
	

}
