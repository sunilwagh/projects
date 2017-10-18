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
		friendSignsToGraha.add(RashiNames.TAURUS);
		friendSignsToGraha.add(RashiNames.LEO);
		friendSignsToGraha.add(RashiNames.LIBRA);
		
	}
	
	private void addNuetralSignsToGraha() {
		nuetralSignsToGraha.add(RashiNames.SCORPIO);
		nuetralSignsToGraha.add(RashiNames.ARIES);
		nuetralSignsToGraha.add(RashiNames.ACQUARIUS);
		nuetralSignsToGraha.add(RashiNames.CAPRICORN);
		
		
	}

	private void addEnemySignsToGraha() {
		enemySignsToGraha.add(RashiNames.CANCER);
		
		
	}

	

	public void addKarakasInLifeForGraha() {
		karakaInLife.add("Intellect");
		karakaInLife.add("Childhood");
		karakaInLife.add("Speech");
		karakaInLife.add("Maternal Uncle");
		karakaInLife.add("Short Journeys");
		karakaInLife.add("Medical Profession");
		karakaInLife.add("Trade");
		karakaInLife.add("Computer and Internet");
		karakaInLife.add("Knowledge of Shashtras");
		karakaInLife.add("Accounts");
		karakaInLife.add("Mathematics");
		karakaInLife.add("Journalism");
		karakaInLife.add("Printing and Publishing");
	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.ASHLESHA);
		lordOfNakshatras.add(NakshatraNames.JYESTHA);
		lordOfNakshatras.add(NakshatraNames.REVATI);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.VIRGO);
		lordOfRashis.add(RashiNames.GEMINI);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

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
