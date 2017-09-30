package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("shasthi")
@Order(value=6)
public class Shashti implements Tithi{
	
	public final GrahaNames ruler = GrahaNames.SHUKRA;

}
