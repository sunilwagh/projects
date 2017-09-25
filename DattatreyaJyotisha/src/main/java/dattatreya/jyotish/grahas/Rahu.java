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
import dattatreya.jyotish.util.Guna;
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
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final  Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final  Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final  Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final  Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	
	public Rahu()
	{
		
	}

	public Rashi getLagnaKundaliRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		// TODO Auto-generated method stub
		
	}

	public Nakshatra getNakshatra() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setNakshatra(Nakshatra nakshatra) {
		// TODO Auto-generated method stub
		
	}

	public Bhava getBhava() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBhava(Bhava bhava) {
		// TODO Auto-generated method stub
		
	}

	public Pada getPada() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setPada(Pada pada) {
		// TODO Auto-generated method stub
		
	}

	public double getDegrees() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setDegrees(double degrees) {
		// TODO Auto-generated method stub
		
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		// TODO Auto-generated method stub
		return null;
	}

	public GrahaNames getGrahaName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMooltrikonarashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getExaltation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDebilitation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOwn() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tattva getTattva() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKaraka() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGuna() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrongest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeak() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeakest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public Tattva getTatva() {
		return tatva;
	}

	public RashiNames getMoolTrikonaRashi() {
		return moolTrikonaRashi;
	}

	public RashiNames getOWN() {
		return OWN;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
	}

	public Set<BhavaNames> getKARAKA() {
		return KARAKA;
	}

	public Set<GrahaNames> getENEMIES_TO_GRAHA() {
		return ENEMIES_TO_GRAHA;
	}

	public Set<GrahaNames> getFRIENDS_TO_GRAHA() {
		return FRIENDS_TO_GRAHA;
	}

	public Set<GrahaNames> getNUETRAL_TO_GRAHA() {
		return NUETRAL_TO_GRAHA;
	}
	
	
	
	
	
	
	

}
