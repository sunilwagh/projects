package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("purnima")
@Order(value=15)
public class Purnima implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.SHANI;

}
