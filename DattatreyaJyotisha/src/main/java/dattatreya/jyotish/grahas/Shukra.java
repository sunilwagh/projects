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

@Component("shukra")
@Order(value=6)
public final class Shukra implements Graha {

	private final GrahaNames grahaName = GrahaNames.SHUKRA;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.PARASHURAMA;
	private final Mahavidya mahaVidya = Mahavidya.KAMALATMIKA;
	private  final Guna GUNA = Guna.RAJASIC;
	private  final Tattva TATTVA = Tattva.AKASH;

	
	private  final RashiNames MOOLTRIKONARASHI = RashiNames.LIBRA;
	private  final RashiNames EXALTATION = RashiNames.PISCES;
	private  final RashiNames OWN = RashiNames.LIBRA;
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private  final RashiNames DEBILITATION = RashiNames.VIRGO;
	private  final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private  final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private  final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private  final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	public Shukra() 
	{
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
		addFriendSignsToGraha();
		addEnemySignsToGraha();
		addNuetralSignsToGraha();

	}
	
	private void addFriendSignsToGraha() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.CAPRICORN);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.SAGITTAURIUS);
		
	}
	
	private void addNuetralSignsToGraha() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.SCORPIO);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
	
		
		
	}

	private void addEnemySignsToGraha() {
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.CANCER);
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		
		
	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.BHARANI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.PURVA_PHALGUNI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.PURVA_ASHADA);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.TAURUS);
		LORD_OF_RASHIS.add(RashiNames.LIBRA);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.SURYA);
		ENEMIES_TO_GRAHA.add(GrahaNames.CHANDRA);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SHANI);
		FRIENDS_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(GrahaNames.MANGAL);
		NUETRAL_TO_GRAHA.add(GrahaNames.GURU);
	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA4);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA1);
		STRONG.add(BhavaNames.BHAVA5);
		STRONG.add(BhavaNames.BHAVA9);
		STRONG.add(BhavaNames.BHAVA11);
		STRONG.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToNuetral() {
		NUETRAL.add(BhavaNames.BHAVA2);
		NUETRAL.add(BhavaNames.BHAVA3);
		NUETRAL.add(BhavaNames.BHAVA7);

	}

	public void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA6);
		WEAK.add(BhavaNames.BHAVA8);
		WEAK.add(BhavaNames.BHAVA10);
	}

	public static void addBhavasToWeakest() {

	}

	

	public Nakshatra getNakshatra() {
		return nakshatra;
	}

	public void setNakshatra(Nakshatra nakshatra) {
		this.nakshatra = nakshatra;
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

	

	public Rashi getLagnaKundaliRashi() {
		return lagnaKundaliRashi;
	}

	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		this.lagnaKundaliRashi = lagnaKundaliRashi;
	}

	public VISHNU_AVATARS getVISHNU_AVATAR() {
		return VISHNU_AVATAR;
	}

	public Bhava getBhava() {
		return bhava;
	}

	public void setBhava(Bhava bhava) {
		this.bhava = bhava;
	}

	public GrahaNames getGrahaName() {
		return grahaName;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
	}

	public Guna getGUNA() {
		return GUNA;
	}

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public RashiNames getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public RashiNames getEXALTATION() {
		return EXALTATION;
	}

	public RashiNames getOWN() {
		return OWN;
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

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public Set<NakshatraNames> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
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

	public Set<RashiNames> getGREAT_FRIEND_SIGNS_TO_GRAHA() {
		return GREAT_FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getGREAT_ENEMY_SIGNS_TO_GRAHA() {
		return GREAT_ENEMY_SIGNS_TO_GRAHA;
	}


	

	

	
}
