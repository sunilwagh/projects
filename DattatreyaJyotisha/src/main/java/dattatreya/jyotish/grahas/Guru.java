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

@Component("guru")
@Order(value = 5)
public class Guru implements Graha {

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;

	private final GrahaNames grahaName = GrahaNames.GURU;
	private final Tattva tattva = Tattva.AKASH;
	private final VISHNU_AVATARS vishnuAvatar = VISHNU_AVATARS.VAMANA;
	private final Mahavidya mahaVidya = Mahavidya.UGRATARA_NEELATARA;
	private final Colors color = Colors.YELLOW;
	private final Direction direction = Direction.NORTH_EAST;
	private final Guna guna = Guna.SATTVIC;

	private final RashiNames mooltrikonaRashi = RashiNames.SAGITTAURIUS;
	private final RashiNames exaltationRashi = RashiNames.CANCER;
	private final RashiNames ownRashi = RashiNames.PISCES;
	private final Set<RashiNames> GREAT_FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 37.5%
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 25 TO 37.5%
	private final Set<RashiNames> NUETRAL_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); //12.5 %
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();  // 6.25 %
	private final Set<RashiNames> GREAT_ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>(); // 3.25 %
	private final RashiNames debilitationRashi = RashiNames.CAPRICORN;
    
	private final Set<NakshatraNames> lordOfNakshatras = new HashSet<NakshatraNames>();
	private final Set<RashiNames> lordOfRashis = new HashSet<RashiNames>();
	
	private final Set<BhavaNames> karakaForBhavas = new HashSet<BhavaNames>();
	
	private final Set<GrahaNames> enemiesToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> nuetralToGraha = new HashSet<GrahaNames>();
	private final Set<GrahaNames> friendsToGraha = new HashSet<GrahaNames>();
	
	private final Set<BhavaNames> strongestInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> strongInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> nuetralInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakInBhavas = new HashSet<BhavaNames>();
	private final Set<BhavaNames> weakestInBhavas = new HashSet<BhavaNames>();

	public Guru() {
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
		addFriendSigns();
		addEnemySigns();
		addNuetralSigns();

	}

	private void addNuetralSigns() {
		NUETRAL_SIGNS_TO_GRAHA.add(RashiNames.ACQUARIUS);
		
	}

	private void addEnemySigns() {
		
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.TAURUS);
		ENEMY_SIGNS_TO_GRAHA.add(RashiNames.LIBRA);
	    ENEMY_SIGNS_TO_GRAHA.add(RashiNames.GEMINI);

	}

	private void addFriendSigns() {
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.ARIES);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.LEO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.SCORPIO);
		FRIEND_SIGNS_TO_GRAHA.add(RashiNames.VIRGO);
		

	}

	public void addLordOfNakshatrasToGraha() {
		lordOfNakshatras.add(NakshatraNames.PUNARVASU);
		lordOfNakshatras.add(NakshatraNames.VISHAKA);
		lordOfNakshatras.add(NakshatraNames.PURVA_BHADRAPADA);
	}

	private void addLordOfRashisToGraha() {
		lordOfRashis.add(RashiNames.PISCES);
		lordOfRashis.add(RashiNames.SAGITTAURIUS);

	}

	public void addKarakasToGraha() {
		karakaForBhavas.add(BhavaNames.BHAVA4);
		karakaForBhavas.add(BhavaNames.BHAVA10);

	}

	public void addEnemiesToGraha() {
		enemiesToGraha.add(GrahaNames.BUDHA);
		enemiesToGraha.add(GrahaNames.SHUKRA);
	}

	public void addFriendsToGraha() {
		friendsToGraha.add(GrahaNames.SURYA);
		friendsToGraha.add(GrahaNames.CHANDRA);
		friendsToGraha.add(GrahaNames.MANGAL);

	}

	public void addNuetralToGraha() {

		nuetralToGraha.add(GrahaNames.SHANI);

	}

	public void addBhavasToStrongest() {
		strongestInBhavas.add(BhavaNames.BHAVA1);
	}

	public void addBhavasToStrong() {
		strongInBhavas.add(BhavaNames.BHAVA5);
		strongInBhavas.add(BhavaNames.BHAVA9);
		strongInBhavas.add(BhavaNames.BHAVA10);
		strongInBhavas.add(BhavaNames.BHAVA11);

	}

	public void addBhavasToNuetral() {
		nuetralInBhavas.add(BhavaNames.BHAVA2);
		nuetralInBhavas.add(BhavaNames.BHAVA3);
		nuetralInBhavas.add(BhavaNames.BHAVA4);
		nuetralInBhavas.add(BhavaNames.BHAVA6);
		nuetralInBhavas.add(BhavaNames.BHAVA8);
		nuetralInBhavas.add(BhavaNames.BHAVA12);

	}

	public void addBhavasToWeak() {
		weakInBhavas.add(BhavaNames.BHAVA7);
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

	public Tattva getTattva() {
		return tattva;
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

	public Guna getGuna() {
		return guna;
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

	public Set<NakshatraNames> getLordOfNakshatras() {
		return lordOfNakshatras;
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

	public Set<GrahaNames> getNuetralToGraha() {
		return nuetralToGraha;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		return friendsToGraha;
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
