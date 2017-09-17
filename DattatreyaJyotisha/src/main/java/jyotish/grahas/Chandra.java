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
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Chandra implements Graha{
	
	//FEMALE
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private static final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.CHANDRA;
	private static final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.TAURUS;
	private static final Name_Of_Rashi EXALTATION = Name_Of_Rashi.TAURUS;
	private static final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.SCORPIO;
	private static final Name_Of_Rashi OWN = Name_Of_Rashi.CANCER;
	private static final Tattva TATTVA = Tattva.APA;
	private static final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private static final Guna GUNA = Guna.SATTVIC;
	private static final Set<Name_Of_Rashi> LORD_OF_RASHIS = new HashSet<Name_Of_Rashi>();
	private static final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private static final Set<Name_Of_Bhava> STRONGEST_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> STRONG_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> NUETRAL_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> WEAK_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private static final Set<Name_Of_Bhava> WEAKEST_IN_BHAVAS = new HashSet<Name_Of_Bhava>();

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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.ROHINI);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.HASTA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.SHRAVANA);
	}

	private static void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.CANCER);
		

	}

	public static void addKarakasToGraha() {
		

	}

	public static void addEnemiesToGraha() {
		

	}

	public static void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.BUDHA);

	}

	public static void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHUKRA);

	}

	public static void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(Name_Of_Bhava.BHAVA4);
	}

	public static void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA5);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA9);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA11);
		
	}

	public static void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA1);
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA2);
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA3);

	}

	public static void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA6);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA8);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA12);

	}

	public static void addBhavasToWeakest() {
		WEAKEST_IN_BHAVAS.add(Name_Of_Bhava.BHAVA10);

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
	
	

}
