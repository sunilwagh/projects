package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

@Component("guru")
@Order(value = 5)
public class Guru implements Graha {

	// Male
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	private final GrahaNames grahaName = GrahaNames.GURU;

	private final RashiNames MOOLTRIKONARASHI = RashiNames.SAGITTAURIUS;
	private final RashiNames EXALTATION = RashiNames.CANCER;
	private final RashiNames OWN = RashiNames.PISCES;
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final RashiNames DEBILITATION = RashiNames.CAPRICORN;

	private final Tattva TATTVA = Tattva.AKASH;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.VAMANA;
	private final Mahavidya mahaVidya = Mahavidya.UGRATARA_NEELATARA;
	
	
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final Guna GUNA = Guna.SATTVIC;
	private final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	public Guru() {
		addFriendsToGraha();
		addEnemiesToGraha();
		addLordOfNakshatrasToGraha();
		addKarakasToGraha();
		addLordOfRashisToGraha();
		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();
		addFriendSigns();
		addEnemySigns();
		addNuetralSigns();

	}

	private void addNuetralSigns() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		
	}

	private void addEnemySigns() {
		
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.TAURUS);
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
	    ENEMY_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);

	}

	private void addFriendSigns() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.SCORPIO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.VIRGO);
		

	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.PUNARVASU);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.VISHAKA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.PURVA_BHADRAPADA);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.PISCES);
		LORD_OF_RASHIS.add(RashiNames.SAGITTAURIUS);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.BUDHA);
		ENEMIES_TO_GRAHA.add(GrahaNames.SHUKRA);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SURYA);
		FRIENDS_TO_GRAHA.add(GrahaNames.CHANDRA);
		FRIENDS_TO_GRAHA.add(GrahaNames.MANGAL);

	}

	public void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(GrahaNames.SHANI);

	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA1);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA5);
		STRONG.add(BhavaNames.BHAVA9);
		STRONG.add(BhavaNames.BHAVA10);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		NUETRAL.add(BhavaNames.BHAVA2);
		NUETRAL.add(BhavaNames.BHAVA3);
		NUETRAL.add(BhavaNames.BHAVA4);
		NUETRAL.add(BhavaNames.BHAVA6);
		NUETRAL.add(BhavaNames.BHAVA8);
		NUETRAL.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA7);
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

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public RashiNames getOWN() {
		return OWN;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
	}

	public Guna getGUNA() {
		return GUNA;
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		return LORD_OF_RASHIS;
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

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	
	

}
