package dattatreya.jyotish.panchang.nakshatras;

import java.io.Serializable;
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

@Component("bharani")
@Order(value = 2)
public class Bharani implements Nakshatra {

	private final NakshatraNames nakshatraName = NakshatraNames.BHARANI;
	private final NakshtraDiety diety = NakshtraDiety.YAMA;
	private final GrahaNames nakshatraLord = GrahaNames.SHUKRA;
	private final Tattva tattva = Tattva.PRITHVI;
	private final NakshatraGana gana = NakshatraGana.MANUSHYA;
	private static final List<String> features = new ArrayList<String>();
	private final NakshatraTypes nakshatraType = NakshatraTypes.UGRA;

	public Bharani() {
		addFeatures();
	}

	public void addFeatures() {
		features.add("Fast and swift");
		features.add("Constrained");
		features.add("Mature");
		features.add("Secretive");
		features.add("Sustenance");
		features.add("Generous");
		features.add("Detached");
		features.add("Faces Struggle");
		features.add("Sexual expression is seen");
		features.add("Upholder of truth");
		features.add("Many transformation are seen");
		features.add("Desire to have a large family");
		features.add("Have a large appetite");
		features.add("Wealth");

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

	public static List<String> getFeatures() {
		return features;
	}

	public NakshatraTypes getNakshatraType() {
		return nakshatraType;
	}
	
	

}
