package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("shravana")
@Order(value=22)
public final class Shravana implements Nakshatra{
	
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.CHARA;
	private static List<String> features = new ArrayList<String>();

	static {
		features.add("Power of listening");
		features.add("Divine Guidance (given to gossip if afflicted)");
		features.add("Penship or orators or dancing");
		features.add("Seclusion (narrow mindness)");
		features.add("Perseverance or Attentivess");
		features.add("Obedience");
		features.add("Shrewd or upword moving");
		features.add("Socially active");
		features.add("Excessive Generosity");
		features.add("Setting goals and achieving them (single point focus)");
		features.add("Devoted to parents");
		features.add("Good administrators");
		features.add("May limp when connected to 12H/6H");
		features.add("May listen to Guru/teacher");
		

	}


}
