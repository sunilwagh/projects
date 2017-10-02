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

@Component("kritikka")
@Order(value=3)
public class Krittika implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.KRITTIKA;
	private final NakshtraDiety diety = NakshtraDiety.AGNI;
	private final GrahaNames nakshatraLord = GrahaNames.SURYA;
	private final Tattva tattva = Tattva.PRITHVI;
    private final NakshatraGana gana = NakshatraGana.RAKSHASHA;
    private final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.MISHRA;


	public Krittika()
	{
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Cleansing or cutting");
		features.add("Fostering and encouraging");
		features.add("Bravery");
		features.add("Infidelity");
		features.add("Cheating");
		features.add("Impersonating");
		features.add("Bravery");
		features.add("Restoration of Justice and Goodness");
		features.add("Intelligence");
		features.add("Strong Will Power");
		features.add(
				"Express displeasure by stomping their foot.");
		features.add("Very sharp long term memory and very good at rememebering faces.");
		features.add("Fasting on six consequtive kritikka nakshatra days can give progeny.");
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

	public NakshatraGana getGana() {
		return gana;
	}

	public List<String> getFeatures() {
		return features;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	
}
