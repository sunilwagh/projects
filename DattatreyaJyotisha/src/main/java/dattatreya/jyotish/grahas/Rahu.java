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
	
	
	private final RashiNames EXALTATION = RashiNames.TAURUS;  // 100%
	private final RashiNames MOOLTRIKONARASHI = RashiNames.VIRGO; //75%
	private final RashiNames OWN = RashiNames.GEMINI;    //50%
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames DEBILITATION = RashiNames.PISCES; // 0%
	
	private final Tattva tatva = Tattva.AGNI;
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
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
		addFriendSignsToGraha();
		addEnemySignsToGraha();
		addNuetralSignsToGraha();

	}
	
	private void addFriendSignsToGraha() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.VIRGO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.SAGITTAURIUS);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.CAPRICORN);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.PISCES);
		
	}
	
	private void addNuetralSignsToGraha() {
				
		
	}

	private void addEnemySignsToGraha() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.CANCER);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		
		
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

	public GrahaNames getGrahaName() {
		return grahaName;
	}

	public VISHNU_AVATARS getVISHNU_AVATAR() {
		return VISHNU_AVATAR;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public Set<RashiNames> getGREAT_FRIEND_SIGNS_TO_GRAHA() {
		return GREAT_FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA() {
		return NUETRAL_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getGREAT_ENEMY_SIGNS_TO_GRAHA() {
		return GREAT_ENEMY_SIGNS_TO_GRAHA;
	}

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public Tattva getTatva() {
		return tatva;
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

	public Set<BhavaNames> getSTRONGEST() {
		return STRONGEST;
	}

	public Set<BhavaNames> getSTRONG() {
		return STRONG;
	}

	public Set<BhavaNames> getNUETRAL() {
		return NUETRAL;
	}

	public Set<BhavaNames> getWEAK() {
		return WEAK;
	}

	public Set<BhavaNames> getWEAKEST() {
		return WEAKEST;
	}

	public Tattva getTATTVA() {
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

	

}
