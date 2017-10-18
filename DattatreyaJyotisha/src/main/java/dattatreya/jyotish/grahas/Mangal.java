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
import dattatreya.jyotish.util.Metal;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.Colors;
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
	
	private final RashiNames exaltationRashi = RashiNames.CAPRICORN;
	private final RashiNames mooltrikonaRashi = RashiNames.ARIES; // 0-12 degrees
    private final RashiNames ownRashi = RashiNames.SCORPIO;
	private final Set<RashiNames> greatFriendSignsToGraha = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> friendSignsToGraha = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> nuetralSignsToGraha = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> enemySignsToGraha = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> greatEnemySignsToGraha = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.PISCES; // 0%
	

	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
    private final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();
    private final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	private final Set<String> karakaInLife = new HashSet<String>();

	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();

	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

	private final Guna guna = Guna.TAMASIC;
	private final Tattva tattva = Tattva.AGNI;
	private final GenderOfGraha GENDER_OF_GRAHA = GenderOfGraha.MALE;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.NARASIMHA;
	private final Mahavidya mahaVidya = Mahavidya.BAGALAMUKHI;
	private final Colors color = Colors.RED;
	private final Metal metal = Metal.COPPER;
	

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
		nuetralSignsToGraha.add(RashiNames.TAURUS);
		nuetralSignsToGraha.add(RashiNames.LIBRA);
		nuetralSignsToGraha.add(RashiNames.ACQUARIUS);
		
	}

	private void addEnemySignsToGraha() {
		enemySignsToGraha.add(RashiNames.GEMINI);
		enemySignsToGraha.add(RashiNames.VIRGO);
		
	}

	private void addFriendSignsToGraha() {
		friendSignsToGraha.add(RashiNames.LEO);
		friendSignsToGraha.add(RashiNames.SAGITTAURIUS);
		friendSignsToGraha.add(RashiNames.PISCES);
		
	}
	
	

	public void addKarakasInLifeForGraha() {
		karakaInLife.add("Brothers");
		karakaInLife.add("Courage");
		karakaInLife.add("Energy");
		karakaInLife.add("Armed Forces");
		karakaInLife.add("Police Forces");
		karakaInLife.add("Commanders");
		karakaInLife.add("Administrators");
		karakaInLife.add("men in high position");
	    karakaInLife.add("land");
		karakaInLife.add("engineering");
		karakaInLife.add("metals");
		karakaInLife.add("real estate agents");
		karakaInLife.add("surgery."); 
		
	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.MRIGASHIRSHA);
		lordOfNakshatras.add(NakshatraNames.CHITRA);
		lordOfNakshatras.add(NakshatraNames.DHANISHTA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.ARIES);
		lordOfRashis.add(RashiNames.SCORPIO);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.BUDHA);

	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.SURYA);
		friendsToGraha.add(GrahaNames.CHANDRA);
		friendsToGraha.add(GrahaNames.GURU);

	}

	public void addNuetralToGraha() {
		nuetralToGraha.add(GrahaNames.SHUKRA);
		nuetralToGraha.add(GrahaNames.SHANI);

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
		nuetralInBhavas.add(BhavaNames.BHAVA8);
		nuetralInBhavas.add(BhavaNames.BHAVA9);
		nuetralInBhavas.add(BhavaNames.BHAVA12);

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

	public GrahaNames getGrahaName() {
		return grahaName;
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

	public Set<NakshatraNames> getLordOfNakshatras() {
		return lordOfNakshatras;
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

	public Set<GrahaNames> getFriendsToGraha() {
		return friendsToGraha;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		return enemiesToGraha;
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

	public Guna getGuna() {
		return guna;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public GenderOfGraha getGENDER_OF_GRAHA() {
		return GENDER_OF_GRAHA;
	}

	public VISHNU_AVATARS getVishnuAvatar() {
		return vishnuAvatar;
	}

	public Mahavidya getMahaVidya() {
		return mahaVidya;
	}

	public Colors getColor() {
		return color;
	}

	public Metal getMetal() {
		return metal;
	}

	

	

	


	

}
