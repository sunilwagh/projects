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
import dattatreya.jyotish.util.Colors;
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

// http://www.astrojyoti.com/9planets.htm
@Component("shani")
@Order(value=7)
public final class Shani implements Graha {

	private final GrahaNames grahaName = GrahaNames.SHANI;
	private final Set<RashiNames> lordOfRashi = new HashSet<RashiNames>();
	
	private final RashiNames mooltrikonaRashi = RashiNames.ACQUARIUS;
	private final RashiNames exaltationRashi = RashiNames.LIBRA;
	private final RashiNames ownRashi = RashiNames.CAPRICORN;
	private final Set<RashiNames> greatFriendSignsToGraha = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> friendSignsToGraha = new HashSet<RashiNames>();
	private final Set<RashiNames> nuetralSignsToGraha = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> enemySignsToGraha = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> greatEnemySignsToGraha = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.ARIES;
    private final Tattva tattva = Tattva.VAYU;
	private final Guna guna = Guna.TAMASIC;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.KURMA;
	private final Mahavidya mahaVidya = Mahavidya.DAKSHINAKALI;
	private final Colors color = Colors.BLUE;
	private final Direction direction = Direction.WEST;
	
	
	private final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();
	
	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
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

	public Shani()
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
		addKarakasInLifeForGraha();

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
	
	private void addFriendSignsToGraha() {
		friendSignsToGraha.add(RashiNames.GEMINI);
		friendSignsToGraha.add(RashiNames.TAURUS);
		friendSignsToGraha.add(RashiNames.VIRGO);
		
		
	}
	
	private void addNuetralSignsToGraha() {
		nuetralSignsToGraha.add(RashiNames.SCORPIO);
		nuetralSignsToGraha.add(RashiNames.CANCER);
		nuetralSignsToGraha.add(RashiNames.LEO);	
		
	
	}

	private void addEnemySignsToGraha() {
		
		enemySignsToGraha.add(RashiNames.PISCES);
		enemySignsToGraha.add(RashiNames.SAGITTAURIUS);			
	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.PUSHYA);
		lordOfNakshatras.add(NakshatraNames.ANURADHA);
		lordOfNakshatras.add(NakshatraNames.UTTAR_BHADRAPADA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashi.add(RashiNames.CAPRICORN);
		lordOfRashi.add(RashiNames.ACQUARIUS);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.SURYA);
		enemiesToGraha.add(GrahaNames.CHANDRA);
		enemiesToGraha.add(GrahaNames.MANGAL);
	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.BUDHA);
		friendsToGraha.add(GrahaNames.SHUKRA);
	}

	public void addNuetralToGraha() {
		nuetralToGraha.add(GrahaNames.GURU);
	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA7);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA3);
		strongInBhavas.add(BhavaNames.BHAVA6);
		strongInBhavas.add(BhavaNames.BHAVA10);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA2);
		weakInBhavas.add(BhavaNames.BHAVA4);
		weakInBhavas.add(BhavaNames.BHAVA5);
		weakInBhavas.add(BhavaNames.BHAVA9);
		weakInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeakest() {
		weakestInBhavas.add(BhavaNames.BHAVA1);

	}

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

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



	public Set<RashiNames> getLordOfRashi() {
		return lordOfRashi;
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



	public Tattva getTattva() {
		return tattva;
	}



	public Guna getGuna() {
		return guna;
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



	public Direction getDirection() {
		return direction;
	}



	public Set<NakshatraNames> getLordOfNakshatra() {
		return lordOfNakshatras;
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



	public Set<RashiNames> getLordOfRashis() {
		return lordOfRashis;
	}



	public Set<NakshatraNames> getLordOfNakshatras() {
		return lordOfNakshatras;
	}

	
	
	
	

	
	

}
