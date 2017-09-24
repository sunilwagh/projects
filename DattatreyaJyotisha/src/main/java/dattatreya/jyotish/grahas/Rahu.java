package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("rahu")
@Order(value=8)
public class Rahu implements Graha{
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private final static GrahaNames grahaName = GrahaNames.RAHU;
	private final static RashiNames MOOLTRIKONARASHI=RashiNames.ARIES;
	private final static RashiNames EXALTATION=RashiNames.CAPRICORN;
	private final static RashiNames DEBILITATION=RashiNames.CANCER;
	private final static Tattva tatva = Tattva.AGNI;
	private final static RashiNames moolTrikonaRashi=RashiNames.CANCER;
	private final static RashiNames OWN=RashiNames.GEMINI;
	private final static Tattva tattva = Tattva.PRITHVI;
	private final static Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final static Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final static Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final static Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final static Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	
	
	public Rashi getLagnaKundaliRashi() {
		return lagnaKundaliRashi;
	}
	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		this.lagnaKundaliRashi = lagnaKundaliRashi;
	}
	public Nakshatra getNakshatra() {
		return nakshatra;
	}
	public void setNakshatra(Nakshatra nakshatra) {
		this.nakshatra = nakshatra;
	}
	public Bhava getBhava() {
		return bhava;
	}
	public void setBhava(Bhava bhava) {
		this.bhava = bhava;
	}
	public Pada getPada() {
		return pada;
	}
	public void setPada(Pada pada) {
		this.pada = pada;
	}
	
	public double getDegrees() {
		return degrees;
	}
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	
	
	

}
