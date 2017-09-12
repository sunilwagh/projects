package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Guna;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Nakshatra;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Budha implements Graha {

	private static final Set<Name_Of_Rashi> LORDOFRASHIS = new HashSet<Name_Of_Rashi>();
	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.BUDHA;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ARIES;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.VIRGO;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.PISCES;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.GEMINI;
	private static final Tattva TATTVA = Tattva.PRITHVI;
	private static final Set<Name_Of_Nakshatra> LORDOFNAKSHATRA = new HashSet<Name_Of_Nakshatra>();
	private static final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Guna GUNA = Guna.RAJASIC;
	private static final Set<Name_Of_Bhava> STRONGEST = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> STRONG = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> NUETRAL = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> WEAK = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> WEAKEST = new HashSet<Name_Of_Bhava>();

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
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.ASHLESHA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.JYESTHA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.REVATI);
	}

	private static void addLordOfRashisToGraha() {
		LORDOFRASHIS.add(Name_Of_Rashi.VIRGO);
		LORDOFRASHIS.add(Name_Of_Rashi.GEMINI);

	}

	public static void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public static void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.CHANDRA);

	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SHUKRA);

	}

	public static void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);

	}

	public static void addBhavasToStrongest() {
		STRONGEST.add(Name_Of_Bhava.BHAVA1);
	}

	public static void addBhavasToStrong() {
		STRONG.add(Name_Of_Bhava.BHAVA2);
		STRONG.add(Name_Of_Bhava.BHAVA4);
		STRONG.add(Name_Of_Bhava.BHAVA5);
		STRONG.add(Name_Of_Bhava.BHAVA9);
		STRONG.add(Name_Of_Bhava.BHAVA10);
		STRONG.add(Name_Of_Bhava.BHAVA11);

	}

	public static void addBhavasToNuetral() {
		NUETRAL.add(Name_Of_Bhava.BHAVA3);

	}

	public static void addBhavasToWeak() {
		WEAK.add(Name_Of_Bhava.BHAVA6);
		WEAK.add(Name_Of_Bhava.BHAVA8);
		WEAK.add(Name_Of_Bhava.BHAVA12);

	}

	public static void addBhavasToWeakest() {
		WEAKEST.add(Name_Of_Bhava.BHAVA7);

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

	public static Set<Name_Of_Rashi> getLORDOFRASHIS() {
		return LORDOFRASHIS;
	}

	public static Name_Of_Graha getGrahaName() {
		return GRAHA_NAME;
	}

	public static Name_Of_Rashi getMooltrikonarashi() {
		return MOOLTRIKONARASHI;
	}

	public static Name_Of_Rashi getExaltation() {
		return EXALTATION;
	}

	public static Name_Of_Rashi getDebilitation() {
		return DEBILITATION;
	}

	public static Name_Of_Rashi getOwn() {
		return OWN;
	}

	public static Tattva getTattva() {
		return TATTVA;
	}

	public static Set<Name_Of_Bhava> getKaraka() {
		return KARAKA;
	}

	public static Set<Name_Of_Graha> getEnemiesToGraha() {
		return ENEMIES_TO_GRAHA;
	}

	public static Set<Name_Of_Graha> getFriendsToGraha() {
		return FRIENDS_TO_GRAHA;
	}

	public static Set<Name_Of_Graha> getNuetralToGraha() {
		return NUETRAL_TO_GRAHA;
	}

	public static Guna getGuna() {
		return GUNA;
	}

	public static Set<Name_Of_Bhava> getStrongest() {
		return STRONGEST;
	}

	public static Set<Name_Of_Bhava> getStrong() {
		return STRONG;
	}

	public static Set<Name_Of_Bhava> getWeak() {
		return WEAK;
	}

	public static Set<Name_Of_Bhava> getWeakest() {
		return WEAKEST;
	}

}
