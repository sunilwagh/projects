package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import util.NakshatraEnumUtil.NAKSHTRA_TYPE;

@Component("purvabhadrapada")
@Order(value=25)
public final class PurvaBhadrapada implements Nakshatra{
	
	private static List<String> features = new ArrayList<String>();
	private final NAKSHTRA_TYPE NAKSHATRA_TYPE = NAKSHTRA_TYPE.UGRA;

	static {
		
		features.add("Ability to be futuristic in thoughts and actions");
		features.add("Ability to lend support to all who need it");
		features.add("Extremely active with trials and tribulations");
		features.add("Sacrifice");
		features.add("Dual Personality");
		features.add("Attraction towards balck magic");
		features.add("Love and dedication to spouse");
		features.add("Tenacious");
		features.add("Huge amount of nervous energy");
		features.add("Inability to let go of past");
		features.add("They like to stand with all leg on one feet or practice Vruksha Asana or one foot pose");
		features.add("They have tempest like anger which is beyond their own control");
		features.add("They like using Ottomon or foot stool");
		features.add("They make excellent dancers");

		

	}


}
