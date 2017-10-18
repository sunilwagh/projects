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
@Order(value = 2)
public final class Chandra implements Graha {

	// FEMALE

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	private final GrahaNames grahaName = GrahaNames.CHANDRA;
	private final RashiNames mooltrikonaRashi = RashiNames.TAURUS; // 0-3 degrees
	private final RashiNames exaltationRashi = RashiNames.TAURUS;
	private final RashiNames ownRashi = RashiNames.CANCER;
	private final Set<RashiNames> greatFriendSignsToGraha = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> friendSignsToGraha = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> nuetralSignsToGraha = new HashSet<RashiNames>(); // 12.5 %
	private final Set<RashiNames> enemySignsToGraha = new HashSet<RashiNames>(); // 6.25 %
	private final Set<RashiNames> greatEnemySignsToGraha = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.SCORPIO;

	private final Tattva tattva = Tattva.APA;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.KRISHNA;
	private final Mahavidya mahaVidya = Mahavidya.BHUVANESHWARI;

	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
	private final Guna guna = Guna.SATTVIC;
	private final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();
	private final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();
	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

	public Chandra() {
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
		nuetralSignsToGraha.add(RashiNames.ARIES);
		nuetralSignsToGraha.add(RashiNames.LIBRA);
		nuetralSignsToGraha.add(RashiNames.SAGITTAURIUS);
		nuetralSignsToGraha.add(RashiNames.CAPRICORN);
		nuetralSignsToGraha.add(RashiNames.ACQUARIUS);
		nuetralSignsToGraha.add(RashiNames.PISCES);

	}

	private void addEnemySignsToGraha() {
		// TODO Auto-generated method stub

	}

	private void addFriendSignsToGraha() {
		friendSignsToGraha.add(RashiNames.GEMINI);
		friendSignsToGraha.add(RashiNames.LEO);
		friendSignsToGraha.add(RashiNames.VIRGO);
	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.ROHINI);
		lordOfNakshatras.add(NakshatraNames.HASTA);
		lordOfNakshatras.add(NakshatraNames.SHRAVANA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.CANCER);

	}

	public void addKarakasToGraha() {

	}

	public void addEnemiesToGraha() {

	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.SURYA);
		friendsToGraha.add(GrahaNames.BUDHA);

	}

	public void addNuetralToGraha() {
		nuetralToGraha.add(GrahaNames.MANGAL);
		nuetralToGraha.add(GrahaNames.GURU);
		nuetralToGraha.add(GrahaNames.SHANI);
		nuetralToGraha.add(GrahaNames.SHUKRA);

	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA4);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA5);
		strongInBhavas.add(BhavaNames.BHAVA9);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		nuetralInBhavas.add(BhavaNames.BHAVA1);
		nuetralInBhavas.add(BhavaNames.BHAVA2);
		nuetralInBhavas.add(BhavaNames.BHAVA3);

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA6);
		weakInBhavas.add(BhavaNames.BHAVA8);
		weakInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeakest() {
		weakestInBhavas.add(BhavaNames.BHAVA10);

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

	public RashiNames getMooltrikonaRashi() {
		return mooltrikonaRashi;
	}

	public RashiNames getExaltationRashi() {
		return exaltationRashi;
	}

	public RashiNames getOwnRashi() {
		return ownRashi;
	}

	public Set<RashiNames> getGREAT_FRIEND_SIGNS_TO_GRAHA() {
		return greatFriendSignsToGraha;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return friendSignsToGraha;
	}

	public Set<RashiNames> getNUETRAL_SIGNS_TO_GRAHA() {
		return nuetralSignsToGraha;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return enemySignsToGraha;
	}

	public Set<RashiNames> getGREAT_ENEMY_SIGNS_TO_GRAHA() {
		return greatEnemySignsToGraha;
	}

	public RashiNames getDebilitationRashi() {
		return debilitationRashi;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public VISHNU_AVATARS getVishnuAvatar() {
		return vishnuAvatar;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
	}

	public Set<NakshatraNames> getLordOfNakshatras() {
		return lordOfNakshatras;
	}

	public Guna getGuna() {
		return guna;
	}

	public Set<RashiNames> getLordOfRashis() {
		return lordOfRashis;
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
