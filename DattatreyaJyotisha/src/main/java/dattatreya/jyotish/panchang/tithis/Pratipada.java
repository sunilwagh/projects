package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("pratipada")
@Order(value=1)
public class Pratipada implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.SURYA;
	

}
