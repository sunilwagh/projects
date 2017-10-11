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
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

@Component("rahu")
@Order(value = 8)
public class Rahu implements Graha {

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	private final GrahaNames grahaName = GrahaNames.RAHU;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.VARAHA;
	private final Mahavidya mahaVidya = Mahavidya.CHINNAMASTA;
	private final RashiNames MOOLTRIKONARASHI = RashiNames.ARIES;
	private final RashiNames EXALTATION = RashiNames.GEMINI;
	private final RashiNames DEBILITATION = RashiNames.CANCER;
	private final Tattva tatva = Tattva.AGNI;
	private final RashiNames moolTrikonaRashi = RashiNames.CANCER;
	private final RashiNames OWN = RashiNames.GEMINI;
	private final Tattva tattva = Tattva.PRITHVI;
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();

	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	public Rahu() {
		
		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();

	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA11);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA6);
		STRONG.add(BhavaNames.BHAVA10);

	}

	public void addBhavasToNuetral() {

	}

	public void addBhavasToWeak() {

	}

	public void addBhavasToWeakest() {

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

	public GrahaNames getGrahaName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getEXALTATION() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDEBILITATION() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOWN() {
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

	public Tattva getTATTVA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGUNA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKARAKA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getENEMIES_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFRIENDS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNUETRAL_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getSTRONGEST() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getSTRONG() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getNUETRAL() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAK() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWEAKEST() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
