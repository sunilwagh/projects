package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.Mahavidya;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

@Component("ketu")
@Order(value = 9)
public class Ketu implements Graha {

	
	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;
	private StringBuilder notes = new StringBuilder();
	
	private final GrahaNames grahaName = GrahaNames.KETU;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.KALKI;
	private final Mahavidya mahaVidya = Mahavidya.BHAIRAVI;

	private final RashiNames exaltationRashi = RashiNames.SCORPIO;  // 100%
	private final RashiNames mooltrikonaRashi = RashiNames.VIRGO; //75%
	private final RashiNames ownRashi = RashiNames.GEMINI;    //50%
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.PISCES; // 0%

	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

	public Ketu() {

		addBhavasToStrongest();
		addBhavasToStrong();
		addBhavasToNuetral();
		addBhavasToWeak();
		addBhavasToWeakest();
		addNotes();
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

	private void addNotes() {
		
		notes.append("Ketu is the keeper of the knowledge of past lives.");
		notes.append("The aim of Ketu is renunciation.");
		notes.append(
				"Ketu overshadows the planet it is conjunct with, it pinpoints the Karma we are still attached too from the previous life and find it difficult to give up");
		notes.append(
				"Conjunct any planet, it will encourage you to give up something related to that planet's energy, as the planet symbolize relationships, something needs to be given up regarding that person.");

	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA12);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA3);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {

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

	public StringBuilder getNotes() {
		return notes;
	}

	public void setNotes(StringBuilder notes) {
		this.notes = notes;
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
