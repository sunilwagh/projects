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
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;
import dattatreya.jyotish.util.VISHNU_AVATARS;

@Component("shukra")
@Order(value=6)
public final class Shukra implements Graha {

	private final GrahaNames grahaName = GrahaNames.SHUKRA;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.PARASHURAMA;
	private final Mahavidya mahaVidya = Mahavidya.KAMALATMIKA;
	private  final Guna guna = Guna.RAJASIC;
	private  final Tattva tattva = Tattva.AKASH;
	private final Direction direction = Direction.SOUTH_EAST;
    private  final RashiNames exaltationRashi = RashiNames.PISCES;
	private  final RashiNames mooltrikonaRashi = RashiNames.LIBRA;
	private  final RashiNames ownRashi = RashiNames.LIBRA;
	private final Set<RashiNames> greatFriendSignsToGraha = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> friendSignsToGraha = new HashSet<RashiNames>();
	private final Set<RashiNames> nuetralSignsToGraha = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> enemySignsToGraha = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> greatEnemySignsToGraha = new HashSet<RashiNames>(); // 3.25 %
	private  final RashiNames debilitationRashi = RashiNames.VIRGO;
    private  final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
	private  final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();
	private  final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	private final Set<String> karakaForLife = new HashSet<String>();
	private  final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	private  final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();
	private  final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private  final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	public Shukra() 
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

	}
	
	private void addFriendSignsToGraha() {
		friendSignsToGraha.add(RashiNames.GEMINI);
		friendSignsToGraha.add(RashiNames.ACQUARIUS);
		friendSignsToGraha.add(RashiNames.CAPRICORN);
		friendSignsToGraha.add(RashiNames.SAGITTAURIUS);
		
	}
	
	private void addNuetralSignsToGraha() {
		nuetralSignsToGraha.add(RashiNames.SCORPIO);
		nuetralSignsToGraha.add(RashiNames.ARIES);
	
		
		
	}

	private void addEnemySignsToGraha() {
		enemySignsToGraha.add(RashiNames.CANCER);
		enemySignsToGraha.add(RashiNames.LEO);
		
		
	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.BHARANI);
		lordOfNakshatras.add(NakshatraNames.PURVA_PHALGUNI);
		lordOfNakshatras.add(NakshatraNames.PURVA_ASHADA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.TAURUS);
		lordOfRashis.add(RashiNames.LIBRA);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.SURYA);
		enemiesToGraha.add(GrahaNames.CHANDRA);
	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.SHANI);
		friendsToGraha.add(GrahaNames.BUDHA);

	}

	public void addNuetralToGraha() {

		nuetralToGraha.add(GrahaNames.MANGAL);
		nuetralToGraha.add(GrahaNames.GURU);
	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA4);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA1);
		strongInBhavas.add(BhavaNames.BHAVA5);
		strongInBhavas.add(BhavaNames.BHAVA9);
		strongInBhavas.add(BhavaNames.BHAVA11);
		strongInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToNuetral() {
		nuetralInBhavas.add(BhavaNames.BHAVA2);
		nuetralInBhavas.add(BhavaNames.BHAVA3);
		nuetralInBhavas.add(BhavaNames.BHAVA7);

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA6);
		weakInBhavas.add(BhavaNames.BHAVA8);
		weakInBhavas.add(BhavaNames.BHAVA10);
	}

	public static void addBhavasToWeakest() {

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

	public Guna getGuna() {
		return guna;
	}

	public Tattva getTattva() {
		return tattva;
	}

	public Direction getDirection() {
		return direction;
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

	public Set<String> getKarakaForLife() {
		return karakaForLife;
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
