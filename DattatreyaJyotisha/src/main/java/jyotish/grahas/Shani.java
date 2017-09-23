package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Guna;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;


@Component("shani")
@Order(value=7)
public class Shani implements Graha {

	private static final Set<Name_Of_Rashi> LORDOFRASHIS = new HashSet<Name_Of_Rashi>();
	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.SHANI;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ACQUARIUS;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.LIBRA;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.ARIES;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.CAPRICORN;
	private static final Tattva TATTVA = Tattva.VAYU;
	private static final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.PUSHYA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.ANURADHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.UTTAR_BHADRAPADA);
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
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.SURYA);
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.MANGAL);
	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.BUDHA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
	}

	public static void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
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

}
