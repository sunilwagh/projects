package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshtraDiety;
import dattatreya.jyotish.util.NakshatraTypes;
import dattatreya.jyotish.util.NakshatraGana;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Tattva;

@Component("ashwini")
@Order(value=1)
public final class Ashwini implements Nakshatra {

	private final NakshtraDiety Diety = NakshtraDiety.ASHWINI_KUMARS;
	private final GrahaNames NAKSHATRA_LORD = GrahaNames.KETU;
	private final Tattva TATTVA = Tattva.PRITHVI;

	private final NakshatraGana GANA = NakshatraGana.DEVA;
    private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.KSHIPRA;

	static {

		features.add("Fast and swift");
		features.add("Helpful");
		features.add("Travelers");
		features.add("Love for horses");
		features.add("Knower of secret knowledge");
		features.add("Charming,Elegant and Stylist");
		features.add("Skilled at healing");
		features.add("Have a strange association with number 3");
		features.add("Impulsive behaviour");
		features.add("Match Maker or Breaker");
		features.add(
				"Best people to be appointed as the head of task force - group of people especially organized for work.");
		features.add("Love honey or maybe required to consume honey as medication.");
		features.add("While talking they like to look at themsleves in the mirror.");

	}

}
