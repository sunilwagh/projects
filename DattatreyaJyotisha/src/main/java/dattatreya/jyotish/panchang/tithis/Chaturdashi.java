package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("chaturdashi")
@Order(value=14)
public class Chaturdashi implements Tithi {

	public final GrahaNames ruler = GrahaNames.SHUKRA;
}
