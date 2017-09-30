package dattatreya.jyotish.panchang.tithis;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.GrahaNames;

@Component("trayodashi")
@Order(value=13)
public class Trayodashi implements Tithi {

	public final GrahaNames ruler = GrahaNames.GURU;
}
