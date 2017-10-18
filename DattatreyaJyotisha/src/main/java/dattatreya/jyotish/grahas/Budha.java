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

@Component("budha")
@Order(value = 4)
public final class Budha implements Graha {

	private final GrahaNames grahaName = GrahaNames.BUDHA;
	private final VISHNU_AVATARS vishnuAvatar= VISHNU_AVATARS.BUDHA;
	private final Mahavidya mahaVidya = Mahavidya.TRIPURASUNDARI;
	private final Tattva tattva = Tattva.PRITHVI;
	private final Guna guna = Guna.RAJASIC;
	
	private final RashiNames exaltationRashi = RashiNames.VIRGO;  // 100%
	private final RashiNames mooltrikonaRashi = RashiNames.VIRGO; //75%
	private final RashiNames ownRashi = RashiNames.GEMINI;    //50%
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.PISCES; // 0%

	private final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
    private final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
    private final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private final Set<String> KARAKA_IN_LIFE = new HashSet<String>();

	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();

	private  final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

	public Budha() {
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
	
	private void addFriendSignsToGraha() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.TAURUS);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
		
	}
	
	private void addNuetralSignsToGraha() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.SCORPIO);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.CAPRICORN);
		
		
	}

	private void addEnemySignsToGraha() {
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.CANCER);
		
		
	}

	

	public void addKarakasInLifeForGraha() {
		KARAKA_IN_LIFE.add("Intellect");
		KARAKA_IN_LIFE.add("Childhood");
		KARAKA_IN_LIFE.add("Speech");
		KARAKA_IN_LIFE.add("Maternal Uncle");
		KARAKA_IN_LIFE.add("Short Journeys");
		KARAKA_IN_LIFE.add("Medical Profession");
		KARAKA_IN_LIFE.add("Trade");
		KARAKA_IN_LIFE.add("Computer and Internet");
		KARAKA_IN_LIFE.add("Knowledge of Shashtras");
		KARAKA_IN_LIFE.add("Accounts");
		KARAKA_IN_LIFE.add("Mathematics");
		KARAKA_IN_LIFE.add("Journalism");
		KARAKA_IN_LIFE.add("Printing and Publishing");
	}

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.ASHLESHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.JYESTHA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.REVATI);
	}

	private void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.VIRGO);
		LORD_OF_RASHIS.add(RashiNames.GEMINI);

	}

	public void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.CHANDRA);

	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.SURYA);
		friendsToGraha.add(GrahaNames.SHUKRA);

	}

	public void addNuetralToGraha() {
		nuetralToGraha.add(GrahaNames.MANGAL);
		nuetralToGraha.add(GrahaNames.GURU);
		nuetralToGraha.add(GrahaNames.SHANI);

	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA1);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA2);
		strongInBhavas.add(BhavaNames.BHAVA4);
		strongInBhavas.add(BhavaNames.BHAVA5);
		strongInBhavas.add(BhavaNames.BHAVA9);
		strongInBhavas.add(BhavaNames.BHAVA10);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		nuetralInBhavas.add(BhavaNames.BHAVA3);

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA6);
		weakInBhavas.add(BhavaNames.BHAVA8);
		weakInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeakest() {
		weakestInBhavas.add(BhavaNames.BHAVA7);

	}

	private Rashi lagnaKundaliRashi;
	private Nakshatra nakshatra;
	private Bhava bhava;
	private Pada pada;
	private double degrees;

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

	public VISHNU_AVATARS getVishnuAvatar() {
		return vishnuAvatar;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public Guna getGuna() {
		return guna;
	}

	public RashiNames getExaltationRashi() {
		return exaltationRashi;
	}

	public RashiNames getMooltrikonaRashi() {
		return mooltrikonaRashi;
	}

	public RashiNames getOwnRashi() {
		return ownRashi;
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

	public RashiNames getDebilitationRashi() {
		return debilitationRashi;
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

	public Set<String> getKARAKA_IN_LIFE() {
		return KARAKA_IN_LIFE;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		return friendsToGraha;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		return nuetralToGraha;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		return enemiesToGraha;
	}

	public Set<BhavaNames> getStrongestInBhavas() {
		return strongestInBhavas;
	}

	public Set<BhavaNames> getStrongInBhavas() {
		return strongInBhavas;
	}

	public Set<BhavaNames> getNuetralInBhavas() {
		return nuetralInBhavas;
	}

	public Set<BhavaNames> getWeakInBhavas() {
		return weakInBhavas;
	}

	public Set<BhavaNames> getWeakestInBhavas() {
		return weakestInBhavas;
	}

	

	

	

}
