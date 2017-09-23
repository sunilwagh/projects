package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.nakshatras.Nakshatra;
import dattatreya.jyotish.nakshatras.padas.Pada;
import dattatreya.jyotish.util.JyotishEnumUtil.Guna;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Bhava;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;

@Component("surya")
@Order(value=1)
public class Surya implements Graha {

	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.SURYA;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.LEO;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.ARIES;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.LIBRA;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.LEO;
	// private static final Tattva TATTVA = Tattva.AKASH;
	private static final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private static final Guna GUNA = Guna.SATTVIC;
	private static final Set<Name_Of_Rashi> LORD_OF_RASHIS = new HashSet<Name_Of_Rashi>();
	private static final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.KRITTIKA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.UTTAR_PHALGUNI);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.UTTAR_ASHADA);
	}

	private static void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.LEO);

	}

	public static void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public static void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.SHANI);
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.GURU);

	}

	public static void addNuetralToGraha() {

		NUETRAL_TO_GRAHA.add(Name_Of_Graha.BUDHA);

	}

	public static void addBhavasToStrongest() {
		STRONGEST.add(Name_Of_Bhava.BHAVA10);
	}

	public static void addBhavasToStrong() {
		STRONG.add(Name_Of_Bhava.BHAVA3);
		STRONG.add(Name_Of_Bhava.BHAVA6);
		STRONG.add(Name_Of_Bhava.BHAVA11);

	}

	public static void addBhavasToNuetral() {
		NUETRAL.add(Name_Of_Bhava.BHAVA1);
		NUETRAL.add(Name_Of_Bhava.BHAVA2);
		NUETRAL.add(Name_Of_Bhava.BHAVA5);
		NUETRAL.add(Name_Of_Bhava.BHAVA7);
		NUETRAL.add(Name_Of_Bhava.BHAVA9);
		NUETRAL.add(Name_Of_Bhava.BHAVA12);

	}

	public static void addBhavasToWeak() {
		WEAK.add(Name_Of_Bhava.BHAVA4);

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

}