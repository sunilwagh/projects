package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("anuradha")
@Order(value=17)
public final class Anuradha implements Nakshatra {
	
	
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.MRUDU;

	static {

		features.add("Promoter of congenial relationship");
		features.add("Success");
		features.add("Krishna Devotee");
		features.add("Ability to see through facade");
		features.add("Sexual Gratification");
		features.add("Researcher");
		features.add("Knowledgeable");
		features.add("Spotless reputation and goofwill (if not afflicted)");
		features.add("Ever Vigialant (Somehow comes to know everything)");
		features.add("Behaves royally (ability to command respect)");
		features.add("Organizational Skill");
		features.add("Associated with Lord Yama. So they have a dont do list (yama) and do list (niyama).");
		features.add(
				"Saddam Hussain had his moon/mars/ rahu in anuradha and on being asked why did he attack kuwait. he said ' when i get something in my head i act'");
	}

}
