package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.NakshatraTypes;

@Component("dhanishta")
@Order(value = 23)
public final class Dhanishta implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.DHANISHTA;
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.CHARA;

	public Dhanishta() {
		addFeatures();

	}

	public void addFeatures() {
		features.add("Wealthy (Greedy if afflicted)");
		features.add("Famous");
		features.add("Love for music");
		features.add("Ability to manifest from nothing");
		features.add("Courageous or motivated");
		features.add("Punctual (if afflicted lacking sense of time)");
		features.add("Organized");
		features.add("Sense of loneliness");
		features.add("Marital Issues");
		features.add("Wise and Charitable");
		features.add("Will not leave his/her family easily");
		features.add("This despite they have bad marriage karma, difficult or delayed marriage");
		features.add("True to their word");
		features.add("They are youthful looking - Avitam is the root of Sedge Root used for making Chawanprash");

	}

}
