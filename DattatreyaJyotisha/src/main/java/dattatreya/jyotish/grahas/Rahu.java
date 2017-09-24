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
	
	private final  GrahaNames grahaName = GrahaNames.RAHU;
	private final  RashiNames MOOLTRIKONARASHI=RashiNames.ARIES;
	private final  RashiNames EXALTATION=RashiNames.GEMINI;
	private final  RashiNames DEBILITATION=RashiNames.CANCER;
	private final  Tattva tatva = Tattva.AGNI;
	private final  RashiNames moolTrikonaRashi=RashiNames.CANCER;
	private final  RashiNames OWN=RashiNames.GEMINI;
	private final  Tattva tattva = Tattva.PRITHVI;
	private final  Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final  Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final  Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final  Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final  Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	
	public Rahu()
	{
		
	}
	
	
	
	
	
	
	

}
