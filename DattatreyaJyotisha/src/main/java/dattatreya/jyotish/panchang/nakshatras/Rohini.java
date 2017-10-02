package dattatreya.jyotish.panchang.nakshatras;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.NakshtraDiety;
import dattatreya.jyotish.util.NakshatraTypes;
import dattatreya.jyotish.util.NakshatraGana;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Tattva;

@Component("rohini")
@Order(value=4)
public final class Rohini implements Nakshatra {
	
	private final NakshatraNames nakshatraName = NakshatraNames.ROHINI;
	private final NakshtraDiety diety = NakshtraDiety.AGNI;
	private final GrahaNames nakshatraLord = GrahaNames.CHANDRA;
	private final Tattva tattva = Tattva.PRITHVI;
	private final NakshatraTypes nakshatraType = NakshatraTypes.STHIRA;
	private final NakshatraGana gana = NakshatraGana.MANUSHYA;
    private final List<String> features = new ArrayList<String>();

	public Rohini()
	{
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Passion");
		features.add("Growth and fertitlity");
		features.add("Abundance");
		features.add("Highly productive and financially sound");
		features.add("Creative");
		features.add("Magnetism");
		features.add("Vehicle and Movement");
		features.add("Family Oriented");
		features.add("Goal Oriented");
		features.add("Jealousy (Natives can be subject to it)");
		features.add("They may consider surrogate and foster mother hood seriously.");
		features.add("Very devoted parent till early childhood.");
		features.add("Separate early from parents");
		features.add("Father in law curse is dangerous for Rohini");
		features.add(
				"Wealthy powerfull and well placed but there weakness is rage. Once their temper flares they lose it. They should chanting 'Om' and 'Gayatri'");
	}

	public NakshatraNames getNakshatraName() {
		return nakshatraName;
	}

	public NakshtraDiety getDiety() {
		return diety;
	}

	public GrahaNames getNakshatraLord() {
		return nakshatraLord;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}

	public NakshatraGana getGana() {
		return gana;
	}

	public List<String> getFeatures() {
		return features;
	}
	
	

}
