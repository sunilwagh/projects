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
import dattatreya.jyotish.util.GenderOfGraha;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

//http://zodiopedia.com/2014/11/astrology/chapter-5-planet-relationship-with-signs-html

@Component("mangal")
@Order(value = 3)
public final class Mangal implements Graha {

	private final GrahaNames grahaName = GrahaNames.MANGAL;
	
	private final RashiNames EXALTATION = RashiNames.CAPRICORN;
	private final RashiNames MOOLTRIKONARASHI = RashiNames.ARIES;
    private final RashiNames OWN = RashiNames.SCORPIO;
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames DEBILITATION = RashiNames.PISCES; // 0%
	

	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();

	private final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();

	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<String> KARAKA_IN_LIFE = new HashSet<String>();

	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();

	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	private final Guna GUNA = Guna.TAMASIC;
	private final Tattva TATTVA = Tattva.AGNI;
	private final GenderOfGraha GENDER_OF_GRAHA = GenderOfGraha.MALE;
	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.NARASIMHA;
	private final Mahavidya mahaVidya = Mahavidya.BAGALAMUKHI;
	// Male

	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	public Mangal() {
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
		addKarakasInLifeForGraha();
		addFriendSignsToGraha();
		addEnemySignsToGraha();
		addNuetralSignsToGraha();

	}

	private void addNuetralSignsToGraha() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.TAURUS);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		
	}

	private void addEnemySignsToGraha() {
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.VIRGO);
		
	}

	private void addFriendSignsToGraha() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.SAGITTAURIUS);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.PISCES);
		
	}

	public void addKarakasInLifeForGraha() {
		KARAKA_IN_LIFE.add("Brothers");
		KARAKA_IN_LIFE.add("Courage");
	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.MRIGASHIRSHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.CHITRA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.DHANISHTA);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.ARIES);
		LORD_OF_RASHIS.add(RashiNames.SCORPIO);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.SURYA);
		FRIENDS_TO_GRAHA.add(GrahaNames.CHANDRA);
		FRIENDS_TO_GRAHA.add(GrahaNames.GURU);

	}

	public void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(GrahaNames.SHUKRA);
		NUETRAL_TO_GRAHA.add(GrahaNames.SHANI);

	}

	public void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA10);
	}

	public void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA6);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		NUETRAL.add(BhavaNames.BHAVA1);
		NUETRAL.add(BhavaNames.BHAVA2);
		NUETRAL.add(BhavaNames.BHAVA5);
		NUETRAL.add(BhavaNames.BHAVA7);
		NUETRAL.add(BhavaNames.BHAVA8);
		NUETRAL.add(BhavaNames.BHAVA9);
		NUETRAL.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {

	}

	public void addBhavasToWeakest() {

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

	
	public Set<String> getKARAKA_IN_LIFE() {
		return KARAKA_IN_LIFE;
	}

	public GenderOfGraha getGENDER_OF_GRAHA() {
		return GENDER_OF_GRAHA;
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

	public RashiNames getDEBILITATION() {
		return DEBILITATION;
	}

	public RashiNames getOWN() {
		return OWN;
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

	public GrahaNames getGrahaName() {
		return grahaName;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA() {
		return NUETRAL_SIGNS_TO_GRAHA;
	}

	public Bhava getBhava() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBhava(Bhava bhava) {
		// TODO Auto-generated method stub
		
	}

	public Set<RashiNames> getGREAT_FRIEND_SIGNS_TO_GRAHA() {
		return GREAT_FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getGREAT_ENEMY_SIGNS_TO_GRAHA() {
		return GREAT_ENEMY_SIGNS_TO_GRAHA;
	}



	

}
