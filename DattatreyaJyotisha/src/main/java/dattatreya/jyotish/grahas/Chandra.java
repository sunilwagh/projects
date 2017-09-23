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

@Component("chandra")
@Order(value=2)
public final class Chandra implements Graha{
	
	//FEMALE
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private  final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.CHANDRA;
	private  final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.TAURUS;
	private  final Name_Of_Rashi EXALTATION = Name_Of_Rashi.TAURUS;
	private  final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.SCORPIO;
	private  final Name_Of_Rashi OWN = Name_Of_Rashi.CANCER;
	private  final Tattva TATTVA = Tattva.APA;
	private  final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private  final Guna GUNA = Guna.SATTVIC;
	private  final Set<Name_Of_Rashi> LORD_OF_RASHIS = new HashSet<Name_Of_Rashi>();
	private  final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private  final Set<Name_Of_Bhava> STRONGEST_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> STRONG_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> NUETRAL_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> WEAK_IN_BHAVAS = new HashSet<Name_Of_Bhava>();
	private  final Set<Name_Of_Bhava> WEAKEST_IN_BHAVAS = new HashSet<Name_Of_Bhava>();

	public Chandra() 
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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.ROHINI);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.HASTA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.SHRAVANA);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.CANCER);
		

	}

	public  void addKarakasToGraha() {
		

	}

	public  void addEnemiesToGraha() {
		

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.BUDHA);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHUKRA);

	}

	public  void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(Name_Of_Bhava.BHAVA4);
	}

	public  void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA5);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA9);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA11);
		
	}

	public  void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA1);
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA2);
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA3);

	}

	public  void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA6);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA8);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA12);

	}

	public  void addBhavasToWeakest() {
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

	public Set<Name_Of_Bhava> getSTRONGEST_IN_BHAVAS() {
		return STRONGEST_IN_BHAVAS;
	}

	public Set<Name_Of_Bhava> getSTRONG_IN_BHAVAS() {
		return STRONG_IN_BHAVAS;
	}

	public Set<Name_Of_Bhava> getNUETRAL_IN_BHAVAS() {
		return NUETRAL_IN_BHAVAS;
	}

	public Set<Name_Of_Bhava> getWEAK_IN_BHAVAS() {
		return WEAK_IN_BHAVAS;
	}

	public Set<Name_Of_Bhava> getWEAKEST_IN_BHAVAS() {
		return WEAKEST_IN_BHAVAS;
	}
	
	
	
	

}
