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

@Component("chandra")
@Order(value=2)
public final class Chandra implements Graha{
	
	//FEMALE
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private  final GrahaNames grahaName = GrahaNames.CHANDRA;
	private  final RashiNames MOOLTRIKONARASHI = RashiNames.TAURUS;
	private  final RashiNames EXALTATION = RashiNames.TAURUS;
	private  final RashiNames OWN = RashiNames.CANCER;
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private  final RashiNames DEBILITATION = RashiNames.SCORPIO;
	
	
	
	private  final Tattva TATTVA = Tattva.APA;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.KRISHNA;
	private final Mahavidya mahaVidya = Mahavidya.BHUVANESHWARI;
	
	private  final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private  final Guna GUNA = Guna.SATTVIC;
	private  final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private  final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private  final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private  final Set<BhavaNames> STRONGEST_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> STRONG_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> NUETRAL_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAK_IN_BHAVAS = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> WEAKEST_IN_BHAVAS = new HashSet<BhavaNames>();

	public Chandra() 
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

	private void addNuetralSignsToGraha() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.SAGITTAURIUS);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.CAPRICORN);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.PISCES);
		
		
		
	}

	private void addEnemySignsToGraha() {
		// TODO Auto-generated method stub
		
	}

	private void addFriendSignsToGraha() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.VIRGO);
	}

	public  void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.ROHINI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.HASTA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.SHRAVANA);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.CANCER);
		

	}

	public  void addKarakasToGraha() {
		

	}

	public  void addEnemiesToGraha() {
		

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SURYA);
		FRIENDS_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(GrahaNames.MANGAL);
		NUETRAL_TO_GRAHA.add(GrahaNames.GURU);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHANI);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHUKRA);

	}

	public  void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(BhavaNames.BHAVA4);
	}

	public  void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA5);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA9);
		STRONG_IN_BHAVAS.add(BhavaNames.BHAVA11);
		
	}

	public  void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA1);
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA2);
		NUETRAL_IN_BHAVAS.add(BhavaNames.BHAVA3);

	}

	public  void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA6);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA8);
		WEAK_IN_BHAVAS.add(BhavaNames.BHAVA12);

	}

	public  void addBhavasToWeakest() {
		WEAKEST_IN_BHAVAS.add(BhavaNames.BHAVA10);

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

	public RashiNames getOWN() {
		return OWN;
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

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public VISHNU_AVATARS getVISHNU_AVATAR() {
		return VISHNU_AVATAR;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
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

	public Set<BhavaNames> getSTRONGEST_IN_BHAVAS() {
		return STRONGEST_IN_BHAVAS;
	}

	public Set<BhavaNames> getSTRONG_IN_BHAVAS() {
		return STRONG_IN_BHAVAS;
	}

	public Set<BhavaNames> getNUETRAL_IN_BHAVAS() {
		return NUETRAL_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAK_IN_BHAVAS() {
		return WEAK_IN_BHAVAS;
	}

	public Set<BhavaNames> getWEAKEST_IN_BHAVAS() {
		return WEAKEST_IN_BHAVAS;
	}

	
	
	
	
	

}
