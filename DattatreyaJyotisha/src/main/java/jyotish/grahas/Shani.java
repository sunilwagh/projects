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

public class Shani implements Graha{
	
	private static final Set<Name_Of_Rashi> LORDOFRASHIS = new HashSet<Name_Of_Rashi>();
	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.SHANI;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ARIES;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.VIRGO;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.PISCES;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.GEMINI;
	private static final Tattva TATTVA = Tattva.VAYU;
	private static final Set<Name_Of_Nakshatra> LORDOFNAKSHATRA = new HashSet<Name_Of_Nakshatra>();
	private static final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Guna GUNA = Guna.TAMASIC;
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
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.PUSHYA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.ANURADHA);
		LORDOFNAKSHATRA.add(Name_Of_Nakshatra.UTTAR_BHADRAPADA);
	}

	private static void addLordOfRashisToGraha() {
		LORDOFRASHIS.add(Name_Of_Rashi.CAPRICORN);
		LORDOFRASHIS.add(Name_Of_Rashi.ACQUARIUS);

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
		STRONGEST.add(Name_Of_Bhava.BHAVA7);
	}

	public static void addBhavasToStrong() {
		STRONG.add(Name_Of_Bhava.BHAVA3);
		STRONG.add(Name_Of_Bhava.BHAVA6);
		STRONG.add(Name_Of_Bhava.BHAVA10);
		STRONG.add(Name_Of_Bhava.BHAVA11);
		

	}

	public static void addBhavasToNuetral() {
		

	}

	public static void addBhavasToWeak() {
		WEAK.add(Name_Of_Bhava.BHAVA2);
		WEAK.add(Name_Of_Bhava.BHAVA4);
		WEAK.add(Name_Of_Bhava.BHAVA5);
		WEAK.add(Name_Of_Bhava.BHAVA9);
		WEAK.add(Name_Of_Bhava.BHAVA12);

	}

	public static void addBhavasToWeakest() {
		WEAKEST.add(Name_Of_Bhava.BHAVA1);

	}

	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	
	
	
	

}
