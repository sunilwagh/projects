package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshatraTypes;

@Component("purvaashada")
@Order(value=20)
public final class PurvaAshada implements Nakshatra{
	
	
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes NAKSHATRA_TYPE = NakshatraTypes.UGRA;

	static {

		features.add("Purification");
		features.add("Energetic");
		features.add("Victorius");
		features.add("Optimistic");
		features.add("Caretaker");
		features.add("Nurturer or abundance of food");
		features.add("Relentless Worker");
		features.add("Future Oriented");
		features.add("Segregating abilities (ability to separate things and see them clearly)");
		features.add("Confident");
		features.add("Men have mustaches");
		features.add("Women have to use electrolysis to get rid of moustache");
		features.add("More than others floss their teeth");

	}


}
