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

@Component("budha")
@Order(value=4)
public final class Budha implements Graha {

	private  final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.BUDHA;
	private  final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.VIRGO;
	private  final Name_Of_Rashi EXALTATION = Name_Of_Rashi.VIRGO;
	private  final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.PISCES;
	private  final Name_Of_Rashi OWN = Name_Of_Rashi.GEMINI;
	private  final Tattva TATTVA = Tattva.PRITHVI;
	private  final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private  final Guna GUNA = Guna.RAJASIC;
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

	public Budha() 
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
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.ASHLESHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.JYESTHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.REVATI);
	}

	private  void addLordOfRashisToGraha() {
		LORD_OF_RASHIS.add(Name_Of_Rashi.VIRGO);
		LORD_OF_RASHIS.add(Name_Of_Rashi.GEMINI);

	}

	public  void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public  void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.CHANDRA);

	}

	public  void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SURYA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SHUKRA);

	}

	public  void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.MANGAL);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.SHANI);

	}

	public  void addBhavasToStrongest() {
		STRONGEST_IN_BHAVAS.add(Name_Of_Bhava.BHAVA1);
	}

	public  void addBhavasToStrong() {
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA2);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA4);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA5);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA9);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA10);
		STRONG_IN_BHAVAS.add(Name_Of_Bhava.BHAVA11);

	}

	public  void addBhavasToNuetral() {
		NUETRAL_IN_BHAVAS.add(Name_Of_Bhava.BHAVA3);

	}

	public  void addBhavasToWeak() {
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA6);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA8);
		WEAK_IN_BHAVAS.add(Name_Of_Bhava.BHAVA12);

	}

	public  void addBhavasToWeakest() {
		WEAKEST_IN_BHAVAS.add(Name_Of_Bhava.BHAVA7);

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

	public  Set<Name_Of_Rashi> getLORD_OF_RASHIS() {
		return LORD_OF_RASHIS;
	}

	public  Name_Of_Graha getGrahaName() {
		return GRAHA_NAME;
	}

	public  Name_Of_Rashi getMooltrikonarashi() {
		return MOOLTRIKONARASHI;
	}

	public  Name_Of_Rashi getExaltation() {
		return EXALTATION;
	}

	public  Name_Of_Rashi getDebilitation() {
		return DEBILITATION;
	}

	public  Name_Of_Rashi getOwn() {
		return OWN;
	}

	public  Tattva getTattva() {
		return TATTVA;
	}

	public  Set<Name_Of_Bhava> getKaraka() {
		return KARAKA;
	}

	public  Set<Name_Of_Graha> getEnemiesToGraha() {
		return ENEMIES_TO_GRAHA;
	}

	public  Set<Name_Of_Graha> getFriendsToGraha() {
		return FRIENDS_TO_GRAHA;
	}

	public  Set<Name_Of_Graha> getNuetralToGraha() {
		return NUETRAL_TO_GRAHA;
	}

	public  Guna getGuna() {
		return GUNA;
	}

	public  Set<Name_Of_Bhava> getStrongest() {
		return STRONGEST_IN_BHAVAS;
	}

	public  Set<Name_Of_Bhava> getStrong() {
		return STRONG_IN_BHAVAS;
	}

	public  Set<Name_Of_Bhava> getWeak() {
		return WEAK_IN_BHAVAS;
	}

	public  Set<Name_Of_Bhava> getWeakest() {
		return WEAKEST_IN_BHAVAS;
	}

}
