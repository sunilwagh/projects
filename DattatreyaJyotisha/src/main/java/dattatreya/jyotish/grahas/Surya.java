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

	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.RAAMA;
	private final Mahavidya mahaVidya = Mahavidya.MATANGI;
	private final GrahaNames grahaName = GrahaNames.SURYA;
	private final RashiNames mooltrikonaRashi = RashiNames.LEO;
	private final RashiNames exaltationRashi = RashiNames.ARIES;
	private final RashiNames debilitationRashi = RashiNames.LIBRA;
	private final RashiNames ownRashi = RashiNames.LEO;
	private final Set<RashiNames> greatFriendSignsToGraha = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> friendSignsToGraha = new HashSet<RashiNames>();
	private final Set<RashiNames> nuetralSignsToGraha = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> enemySignsToGraha = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> greatEnemySignsToGraha = new HashSet<RashiNames>(); // 3.25 %
	private final Tattva tattva = Tattva.AKASH;
	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
	private final Guna guna = Guna.SATTVIC;
	private final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();

	private final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	private final Set<String> karakaInLife = new HashSet<String>();
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();
	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

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
		lordOfNakshatras.add(NakshatraNames.KRITTIKA);
		lordOfNakshatras.add(NakshatraNames.UTTAR_PHALGUNI);
		lordOfNakshatras.add(NakshatraNames.UTTAR_ASHADA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.LEO);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

	}

	public void addKarakasInLifeForGraha() {
		karakaInLife.add("Father");
		karakaInLife.add("Government");
		karakaInLife.add("Royalty");
		karakaInLife.add("Ruling Powers");
		karakaInLife.add("Places of Worship");
		karakaInLife.add("Prana");
		karakaInLife.add("Self");
		karakaInLife.add("Soul");

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.SHANI);
		enemiesToGraha.add(GrahaNames.SHUKRA);
	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.CHANDRA);
		friendsToGraha.add(GrahaNames.MANGAL);
		friendsToGraha.add(GrahaNames.GURU);

	}

	public void addNuetralToGraha() {

		nuetralToGraha.add(GrahaNames.BUDHA);

	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA10);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA3);
		strongInBhavas.add(BhavaNames.BHAVA6);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		nuetralInBhavas.add(BhavaNames.BHAVA1);
		nuetralInBhavas.add(BhavaNames.BHAVA2);
		nuetralInBhavas.add(BhavaNames.BHAVA5);
		nuetralInBhavas.add(BhavaNames.BHAVA7);
		nuetralInBhavas.add(BhavaNames.BHAVA9);
		nuetralInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA4);

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

	public VISHNU_AVATARS getVishnuAvatar() {
		return vishnuAvatar;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
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

	public RashiNames getDebilitationRashi() {
		return debilitationRashi;
	}

	public RashiNames getOwnRashi() {
		return ownRashi;
	}

	public Set<RashiNames> getGreatFriendSignsToGraha() {
		return greatFriendSignsToGraha;
	}

	public Set<RashiNames> getFriendSignsToGraha() {
		return friendSignsToGraha;
	}

	public Set<RashiNames> getNuetralSignsToGraha() {
		return nuetralSignsToGraha;
	}

	public Set<RashiNames> getEnemySignsToGraha() {
		return enemySignsToGraha;
	}

	public Set<RashiNames> getGreatEnemySignsToGraha() {
		return greatEnemySignsToGraha;
	}

	public Tattva getTattva() {
		return tattva;
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

	public Set<String> getKarakaInLife() {
		return karakaInLife;
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
