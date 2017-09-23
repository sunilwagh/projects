package dattatreya.jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.Bhava;
import dattatreya.jyotish.nakshatras.Nakshatra;
import dattatreya.jyotish.nakshatras.padas.Pada;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Guna;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Bhava;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;

@Component("mangal")
@Order(value=3)
public class Mangal implements Graha {

	// Male
	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.MANGAL;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ARIES;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.CAPRICORN;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.PISCES;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.SCORPIO;
	private static final Tattva TATTVA = Tattva.AGNI;
	private static final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private static final Guna GUNA = Guna.TAMASIC;
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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.MRIGASHIRSHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.CHITRA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.DHANISHTA);
	}

	private static void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.ARIES);
		LORD_OF_RASHIS.add(Name_Of_Rashi.SCORPIO);

	}

	public static void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public static void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.BUDHA);

	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.GURU);

	}

	public static void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);

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
		NUETRAL.add(Name_Of_Bhava.BHAVA8);
		NUETRAL.add(Name_Of_Bhava.BHAVA9);
		NUETRAL.add(Name_Of_Bhava.BHAVA12);

	}

	public static void addBhavasToWeak() {

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