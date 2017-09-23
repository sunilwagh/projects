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
public final class Mangal implements Graha {

	// Male
	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;

	private  final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.MANGAL;
	private  final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ARIES;
	private  final Name_Of_Rashi EXALTATION = Name_Of_Rashi.CAPRICORN;
	private  final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.PISCES;
	private  final Name_Of_Rashi OWN = Name_Of_Rashi.SCORPIO;
	private  final Tattva TATTVA = Tattva.AGNI;
	private  final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private  final Guna GUNA = Guna.TAMASIC;
	private  final Set<Name_Of_Rashi> LORD_OF_RASHIS = new HashSet<Name_Of_Rashi>();
	private  final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Bhava> STRONGEST = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> STRONG = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> NUETRAL = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> WEAK = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> WEAKEST = new HashSet<Name_Of_Bhava>();

	public Mangal()
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

	}

	public  void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.MRIGASHIRSHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.CHITRA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.DHANISHTA);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.ARIES);
		LORD_OF_RASHIS.add(Name_Of_Rashi.SCORPIO);

	}

	public  void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public  void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.BUDHA);

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.GURU);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);

	}

	public  void addBhavasToStrongest() {
		STRONGEST.add(Name_Of_Bhava.BHAVA10);
	}

	public  void addBhavasToStrong() {
		STRONG.add(Name_Of_Bhava.BHAVA3);
		STRONG.add(Name_Of_Bhava.BHAVA6);
		STRONG.add(Name_Of_Bhava.BHAVA11);

	}

	public  void addBhavasToNuetral() {
		NUETRAL.add(Name_Of_Bhava.BHAVA1);
		NUETRAL.add(Name_Of_Bhava.BHAVA2);
		NUETRAL.add(Name_Of_Bhava.BHAVA5);
		NUETRAL.add(Name_Of_Bhava.BHAVA7);
		NUETRAL.add(Name_Of_Bhava.BHAVA8);
		NUETRAL.add(Name_Of_Bhava.BHAVA9);
		NUETRAL.add(Name_Of_Bhava.BHAVA12);

	}

	public  void addBhavasToWeak() {

	}

	public  void addBhavasToWeakest() {

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

	public Name_Of_Graha getGRAHA_NAME() {
		return GRAHA_NAME;
	}

	public Name_Of_Rashi getMOOLTRIKONARASHI() {
		return MOOLTRIKONARASHI;
	}

	public Name_Of_Rashi getEXALTATION() {
		return EXALTATION;
	}

	public Name_Of_Rashi getDEBILITATION() {
		return DEBILITATION;
	}

	public Name_Of_Rashi getOWN() {
		return OWN;
	}

	public Tattva getTATTVA() {
		return TATTVA;
	}

	public Set<NAME_OF_NAKSHTRA> getLORD_OF_NAKSHATRAS() {
		return LORD_OF_NAKSHATRAS;
	}

	public Guna getGUNA() {
		return GUNA;
	}

	public Set<Name_Of_Rashi> getLORD_OF_RASHIS() {
		return LORD_OF_RASHIS;
	}

	public Set<Name_Of_Bhava> getKARAKA() {
		return KARAKA;
	}

	public Set<Name_Of_Graha> getENEMIES_TO_GRAHA() {
		return ENEMIES_TO_GRAHA;
	}

	public Set<Name_Of_Graha> getFRIENDS_TO_GRAHA() {
		return FRIENDS_TO_GRAHA;
	}

	public Set<Name_Of_Graha> getNUETRAL_TO_GRAHA() {
		return NUETRAL_TO_GRAHA;
	}

	public Set<Name_Of_Bhava> getSTRONGEST() {
		return STRONGEST;
	}

	public Set<Name_Of_Bhava> getSTRONG() {
		return STRONG;
	}

	public Set<Name_Of_Bhava> getNUETRAL() {
		return NUETRAL;
	}

	public Set<Name_Of_Bhava> getWEAK() {
		return WEAK;
	}

	public Set<Name_Of_Bhava> getWEAKEST() {
		return WEAKEST;
	}
	
	

}
