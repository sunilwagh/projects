package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

@Component("surya")
@Order(value = 1)
public final class Surya implements Graha {

	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private final VISHNU_AVATARS VISHNU_AVATAR = VISHNU_AVATARS.RAAMA;
	private final Mahavidya mahaVidya = Mahavidya.MATANGI;
	private final GrahaNames grahaName = GrahaNames.SURYA;
	private final RashiNames MOOLTRIKONARASHI = RashiNames.LEO;
	private final RashiNames EXALTATION = RashiNames.ARIES;
	private final RashiNames DEBILITATION = RashiNames.LIBRA;
	private final RashiNames OWN = RashiNames.LEO;
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final Tattva TATTVA = Tattva.AKASH;
	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private final Guna GUNA = Guna.SATTVIC;
	private final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();

	private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<String> KARAKA_IN_LIFE = new HashSet<String>();
	private final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	public Surya() {
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

	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.KRITTIKA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_PHALGUNI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_ASHADA);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.LEO);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addKarakasInLifeForGraha() {
		KARAKA_IN_LIFE.add("Father");
		KARAKA_IN_LIFE.add("Government");
		KARAKA_IN_LIFE.add("Royalty");
		KARAKA_IN_LIFE.add("Ruling Powers");
		KARAKA_IN_LIFE.add("Places of Worship");
		KARAKA_IN_LIFE.add("Prana");
		KARAKA_IN_LIFE.add("Self");
		KARAKA_IN_LIFE.add("Soul");

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.SHANI);
		ENEMIES_TO_GRAHA.add(GrahaNames.SHUKRA);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.CHANDRA);
		FRIENDS_TO_GRAHA.add(GrahaNames.MANGAL);
		FRIENDS_TO_GRAHA.add(GrahaNames.GURU);

	}

	public void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(GrahaNames.BUDHA);

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
		NUETRAL.add(BhavaNames.BHAVA9);
		NUETRAL.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA4);

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

	public VISHNU_AVATARS getVISHNU_AVATAR() {
		return VISHNU_AVATAR;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
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

	public Set<String> getKARAKA_IN_LIFE() {
		return KARAKA_IN_LIFE;
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
		return TATTVA;
	}



	

	
}
