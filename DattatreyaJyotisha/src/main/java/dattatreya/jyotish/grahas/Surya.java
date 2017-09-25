package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.util.Guna;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.panchang.nakshatras.Nakshatra;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("surya")
@Order(value=1)
public final class Surya implements Graha {

	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private static final GrahaNames GRAHA_NAME = GrahaNames.SURYA;
	private static final RashiNames MOOLTRIKONARASHI = RashiNames.LEO;
	private static final RashiNames EXALTATION = RashiNames.ARIES;
	private static final RashiNames DEBILITATION = RashiNames.LIBRA;
	private static final RashiNames OWN = RashiNames.LEO;
	private final Set<RashiNames> FRIEND_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	private final Set<RashiNames> ENEMY_SIGNS_TO_GRAHA = new HashSet<RashiNames>();
	// private static final Tattva TATTVA = Tattva.AKASH;
	private static final Set<NakshatraNames> LORD_OF_NAKSHATRAS = new HashSet<NakshatraNames>();
	private static final Guna GUNA = Guna.SATTVIC;
	private static final Set<RashiNames> LORD_OF_RASHIS = new HashSet<RashiNames>();
	private static final Set<BhavaNames> KARAKA = new HashSet<BhavaNames>();
	private static final Set<GrahaNames> ENEMIES_TO_GRAHA = new HashSet<GrahaNames>();
	private static final Set<GrahaNames> FRIENDS_TO_GRAHA = new HashSet<GrahaNames>();
	private static final Set<GrahaNames> NUETRAL_TO_GRAHA = new HashSet<GrahaNames>();
	private static final Set<BhavaNames> STRONGEST = new HashSet<BhavaNames>();
	private static final Set<BhavaNames> STRONG = new HashSet<BhavaNames>();
	private static final Set<BhavaNames> NUETRAL = new HashSet<BhavaNames>();
	private static final Set<BhavaNames> WEAK = new HashSet<BhavaNames>();
	private static final Set<BhavaNames> WEAKEST = new HashSet<BhavaNames>();

	static {
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

	}

	public static void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NakshatraNames.KRITTIKA);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_PHALGUNI);
		LORD_OF_NAKSHATRAS.add(NakshatraNames.UTTAR_ASHADA);
	}

	private static void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(RashiNames.LEO);

	}

	public static void addKarakasToGraha() {
		KARAKA.add(BhavaNames.BHAVA4);
		KARAKA.add(BhavaNames.BHAVA10);

	}

	public static void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(GrahaNames.SHANI);
		ENEMIES_TO_GRAHA.add(GrahaNames.SHUKRA);
	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(GrahaNames.CHANDRA);
		FRIENDS_TO_GRAHA.add(GrahaNames.MANGAL);
		FRIENDS_TO_GRAHA.add(GrahaNames.GURU);

	}

	public static void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(GrahaNames.BUDHA);

	}

	public static void addBhavasToStrongest() {
		STRONGEST.add(BhavaNames.BHAVA10);
	}

	public static void addBhavasToStrong() {
		STRONG.add(BhavaNames.BHAVA3);
		STRONG.add(BhavaNames.BHAVA6);
		STRONG.add(BhavaNames.BHAVA11);

	}

	public static void addBhavasToNuetral() {
		NUETRAL.add(BhavaNames.BHAVA1);
		NUETRAL.add(BhavaNames.BHAVA2);
		NUETRAL.add(BhavaNames.BHAVA5);
		NUETRAL.add(BhavaNames.BHAVA7);
		NUETRAL.add(BhavaNames.BHAVA9);
		NUETRAL.add(BhavaNames.BHAVA12);

	}

	public static void addBhavasToWeak() {
		WEAK.add(BhavaNames.BHAVA4);

	}

	public static void addBhavasToWeakest() {

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

	public Rashi getLagnaKundaliRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setLagnaKundaliRashi(Rashi lagnaKundaliRashi) {
		// TODO Auto-generated method stub
		
	}

	public Bhava getBhava() {
		// TODO Auto-generated method stub
		return null;
	}

	public void setBhava(Bhava bhava) {
		// TODO Auto-generated method stub
		
	}

	public Set<RashiNames> getLORD_OF_RASHIS() {
		// TODO Auto-generated method stub
		return null;
	}

	public GrahaNames getGrahaName() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getMooltrikonarashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getExaltation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getDebilitation() {
		// TODO Auto-generated method stub
		return null;
	}

	public RashiNames getOwn() {
		// TODO Auto-generated method stub
		return null;
	}

	public Tattva getTattva() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getKaraka() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getEnemiesToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getFriendsToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Guna getGuna() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrongest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getStrong() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<GrahaNames> getNuetralToGraha() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeak() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<BhavaNames> getWeakest() {
		// TODO Auto-generated method stub
		return null;
	}

	public Set<RashiNames> getFRIEND_SIGNS_TO_GRAHA() {
		return FRIEND_SIGNS_TO_GRAHA;
	}

	public Set<RashiNames> getENEMY_SIGNS_TO_GRAHA() {
		return ENEMY_SIGNS_TO_GRAHA;
	}

	public static Set<NakshatraNames> getLordOfNakshatras() {
		return LORD_OF_NAKSHATRAS;
	}

	public static Set<RashiNames> getLordOfRashis() {
		return LORD_OF_RASHIS;
	}

	public static Set<BhavaNames> getNuetral() {
		return NUETRAL;
	}
	
	
	
	

}
