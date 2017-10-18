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
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.VARAHA;
	private final Mahavidya mahaVidya = Mahavidya.CHINNAMASTA;
	
	
	private final RashiNames exaltationRashi = RashiNames.TAURUS;  // 100%
	private final RashiNames mooltrikonaRashi = RashiNames.VIRGO; //75%
	private final RashiNames ownRashi = RashiNames.GEMINI;    //50%
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.PISCES; // 0%
	
	private final Tattva tatva = Tattva.AGNI;
	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
	private final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();

	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

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
		strongestInBhavas.add(BhavaNames.BHAVA11);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA3);
		strongInBhavas.add(BhavaNames.BHAVA6);
		strongInBhavas.add(BhavaNames.BHAVA10);

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

	public VISHNU_AVATARS getVishnuAvatar() {
		return vishnuAvatar;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
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

	public Tattva getTatva() {
		return tatva;
	}

	public Set<NakshatraNames> getLordOfNakshatras() {
		return lordOfNakshatras;
	}

	public Set<BhavaNames> getKarakaForBhavas() {
		return karakaForBhavas;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		return enemiesToGraha;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		return friendsToGraha;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		return nuetralToGraha;
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
