package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("tritiya")
@Order(value=3)
public class Tritiya implements Tithi{

	public final GrahaNames ruler = GrahaNames.MANGAL;
}
