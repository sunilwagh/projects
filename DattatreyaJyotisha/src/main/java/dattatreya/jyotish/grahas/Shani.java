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


@Component("shani")
@Order(value=7)
public final class Shani implements Graha {

	private final Set<Name_Of_Rashi> LORDOFRASHIS = new HashSet<Name_Of_Rashi>();
	private final Name_Of_Graha GRAHA_NAME = Name_Of_Graha.SHANI;
	private final Name_Of_Rashi MOOLTRIKONARASHI = Name_Of_Rashi.ACQUARIUS;
	private final Name_Of_Rashi EXALTATION = Name_Of_Rashi.LIBRA;
	private final Name_Of_Rashi DEBILITATION = Name_Of_Rashi.ARIES;
	private final Name_Of_Rashi OWN = Name_Of_Rashi.CAPRICORN;
	private final Tattva TATTVA = Tattva.VAYU;
	private final Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
	private final Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private final Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final Guna GUNA = Guna.TAMASIC;
	private final Set<Name_Of_Bhava> STRONGEST = new HashSet<Name_Of_Bhava>();
	private final Set<Name_Of_Bhava> STRONG = new HashSet<Name_Of_Bhava>();
	private final Set<Name_Of_Bhava> NUETRAL = new HashSet<Name_Of_Bhava>();
	private final Set<Name_Of_Bhava> WEAK = new HashSet<Name_Of_Bhava>();
	private final Set<Name_Of_Bhava> WEAKEST = new HashSet<Name_Of_Bhava>();

	public Shani()
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

	public void addLordOfNakshatrasToGraha() {
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.PUSHYA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.ANURADHA);
		LORD_OF_NAKSHATRAS.add(NAME_OF_NAKSHTRA.UTTAR_BHADRAPADA);
	}

	private void addLordOfRashisToGraha() {
		LORDOFRASHIS.add(Name_Of_Rashi.CAPRICORN);
		LORDOFRASHIS.add(Name_Of_Rashi.ACQUARIUS);

	}

	public void addKarakasToGraha() {
		KARAKA.add(Name_Of_Bhava.BHAVA4);
		KARAKA.add(Name_Of_Bhava.BHAVA10);

	}

	public void addEnemiesToGraha() {
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.SURYA);
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.CHANDRA);
		ENEMIES_TO_GRAHA.add(Name_Of_Graha.MANGAL);
	}

	public void addFriendsToGraha() {
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.BUDHA);
		FRIENDS_TO_GRAHA.add(Name_Of_Graha.SHUKRA);
	}

	public void addNuetralToGraha() {
		NUETRAL_TO_GRAHA.add(Name_Of_Graha.GURU);
	}

	public void addBhavasToStrongest() {
		STRONGEST.add(Name_Of_Bhava.BHAVA7);
	}

	public void addBhavasToStrong() {
		STRONG.add(Name_Of_Bhava.BHAVA3);
		STRONG.add(Name_Of_Bhava.BHAVA6);
		STRONG.add(Name_Of_Bhava.BHAVA10);
		STRONG.add(Name_Of_Bhava.BHAVA11);

	}

	public void addBhavasToNuetral() {

	}

	public void addBhavasToWeak() {
		WEAK.add(Name_Of_Bhava.BHAVA2);
		WEAK.add(Name_Of_Bhava.BHAVA4);
		WEAK.add(Name_Of_Bhava.BHAVA5);
		WEAK.add(Name_Of_Bhava.BHAVA9);
		WEAK.add(Name_Of_Bhava.BHAVA12);

	}

	public void addBhavasToWeakest() {
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

	public Set<Name_Of_Rashi> getLORDOFRASHIS() {
		return LORDOFRASHIS;
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

	public Guna getGUNA() {
		return GUNA;
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
