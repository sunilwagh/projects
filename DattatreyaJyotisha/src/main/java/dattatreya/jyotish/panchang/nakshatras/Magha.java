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

@Component("magha")
@Order(value=10)
public final class Magha implements Nakshatra{
	
	private final NakshatraNames nakshatraName = NakshatraNames.MAGHA;
	private final NakshtraDiety diety = NakshtraDiety.PITRI;
	private final GrahaNames nakshatraLord = GrahaNames.KETU;
	private final Tattva tattva = Tattva.PRITHVI;
    private final NakshatraGana gana = NakshatraGana.RAKSHASHA;
	private static List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.UGRA;

	public Magha() {
		addFeatures();
	}
	
	public void addFeatures() {
		features.add("Magnificient");	
		features.add("Achievement");
		features.add("Hereditary or Ancestors");	
		features.add("Traditional or Ancient Knowledge");	
		features.add("Authority");	
		features.add("Ethical");
		features.add("Egoistic");	
		features.add("Left Hand of Magic (darker side of tantra)");	
		features.add("Duty or Honor");
		features.add("Reserved");
		features.add("They make friends very easily and hate being separated from them.");	
		features.add("They may speak in very low tones");
		features.add("They may have bruxism or grinding their teeth while asleep.");
	}

	public static List<String> getFeatures() {
		return features;
	}

	public static void setFeatures(List<String> features) {
		Magha.features = features;
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

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	

}
