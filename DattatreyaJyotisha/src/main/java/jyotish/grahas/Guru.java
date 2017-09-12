package jyotish.grahas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Nakshatra;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Guru implements Graha{
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	float degrees;
	
	private final static Name_Of_Graha grahaName = Name_Of_Graha.GURU;
	//final static Name_Of_Rashi moolTrikonaRashi=Name_Of_Rashi.CANCER;
	private final static Name_Of_Rashi EXALTATION=Name_Of_Rashi.VIRGO;
	private final static Name_Of_Rashi DEBILITATION=Name_Of_Rashi.PISCES;
	private final static Name_Of_Rashi OWN=Name_Of_Rashi.GEMINI;
	private final static Tattva tattva = Tattva.PRITHVI;
	private final static Set<Name_Of_Nakshatra> LORDOFNAKSHATRA = new HashSet<Name_Of_Nakshatra>();
	private final static Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private final static Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	static Set<Name_Of_Rashi> lordOfRashis = new HashSet<Name_Of_Rashi>();
	
	final static Name_Of_Rashi moolTrikonaRashi=Name_Of_Rashi.SAGITTAURIUS;
	
	
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

}
