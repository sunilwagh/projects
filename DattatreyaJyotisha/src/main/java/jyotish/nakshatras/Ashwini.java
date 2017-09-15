package jyotish.nakshatras;

import java.util.ArrayList;
import java.util.List;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Diety;
import util.JyotishEnumUtil.Tattva;

public class Ashwini implements Nakshatra {

	private static Diety diety;

	private static Tattva tattva;

	private Graha graha;

	private static List<String> features = new ArrayList<String>();

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

	public Diety getDiety() {
		return diety;
	}

	public void setDiety(Diety diety) {
		this.diety = diety;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public void setTattva(Tattva tattva) {
		this.tattva = tattva;
	}

	public Graha getGraha() {
		return graha;
	}

	public void setGraha(Graha graha) {
		this.graha = graha;
	}

}
