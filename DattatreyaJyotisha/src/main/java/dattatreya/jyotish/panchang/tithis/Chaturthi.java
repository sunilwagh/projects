package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;

@Component("chaturthi")
@Order(value=4)
public class Chaturthi implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.BUDHA;
	public final TithiGroup tithiGroup = TithiGroup.Rikta;
	

}
