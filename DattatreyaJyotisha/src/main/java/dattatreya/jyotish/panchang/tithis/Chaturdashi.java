package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.TithiGroup;
import dattatreya.jyotish.util.TithiNames;

@Component("chaturdashi")
@Order(value=14)
public class Chaturdashi implements Tithi {

	public final TithiNames tithiName = TithiNames.CHATURDASHI;
	public final GrahaNames ruler = GrahaNames.SHUKRA;
	public final TithiGroup tithiGroup = TithiGroup.RIKTA;
	public final GrahaNames tithiGroupRuler = GrahaNames.SHANI;
}
