package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("punarvasu")
@Order(value=7)
public final class Punarvasu implements Nakshatra {

	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.CHARA;

	static {

		features.add("Wealthy");
		features.add("Material Instincts");
		features.add("Repeated Events");
		features.add("Talented or one exceptional male child");
		features.add("Regenerative properties");
		features.add("Protected");
		features.add("Accomodating");
		features.add("Warehouse of Energy");
		features.add("Success on repeated attempts");
		features.add("Technocrats");
		features.add(
				"Adoption is prominent in Punarvasu natives. They can take an on the spot decision to adopt, easily.");
		features.add("Changing health fetish, moving from one diet to another.");
		features.add(
				"Is Jupiters abode, often noticed to drink a lot of water. They are very obedient to their parents.");

	}
}