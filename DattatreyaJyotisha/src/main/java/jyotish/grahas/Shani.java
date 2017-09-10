package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.EnumUtil.Name_Of_Bhava;
import util.EnumUtil.Name_Of_Graha;
import util.EnumUtil.Name_Of_Nakshatra;
import util.EnumUtil.Name_Of_Rashi;
import util.EnumUtil.Tattva;

public class Shani implements Graha{
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	
	private final static Name_Of_Graha grahaName = Name_Of_Graha.SHANI;
	final static Name_Of_Rashi moolTrikonaRashi=Name_Of_Rashi.CANCER;
	private final static Name_Of_Rashi EXALTATION=Name_Of_Rashi.VIRGO;
	private final static Name_Of_Rashi DEBILITATION=Name_Of_Rashi.PISCES;
	private final static Name_Of_Rashi OWN=Name_Of_Rashi.GEMINI;
	private final static Tattva tattva = Tattva.PRITHVI;
	private final static Set<Name_Of_Nakshatra> LORDOFNAKSHATRA = new HashSet<Name_Of_Nakshatra>();
	private final static Set<Name_Of_Bhava> KARAKA = new HashSet<Name_Of_Bhava>();
	private final static Set<Name_Of_Graha> ENEMIES_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> FRIENDS_TO_GRAHA = new HashSet<Name_Of_Graha>();
	private final static Set<Name_Of_Graha> NUETRAL_TO_GRAHA = new HashSet<Name_Of_Graha>();
	
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
	public static Name_Of_Graha getGrahaname() {
		return grahaName;
	}
	public static Name_Of_Rashi getMooltrikonarashi() {
		return moolTrikonaRashi;
	}
	public static Name_Of_Rashi getExaltation() {
		return EXALTATION;
	}
	public static Name_Of_Rashi getDebilitation() {
		return DEBILITATION;
	}
	public static Name_Of_Rashi getOwn() {
		return OWN;
	}
	public static Tattva getTattva() {
		return tattva;
	}
	public static Set<Name_Of_Nakshatra> getLordofnakshatra() {
		return LORDOFNAKSHATRA;
	}
	public static Set<Name_Of_Bhava> getKaraka() {
		return KARAKA;
	}
	public static Set<Name_Of_Graha> getEnemiesToGraha() {
		return ENEMIES_TO_GRAHA;
	}
	public static Set<Name_Of_Graha> getFriendsToGraha() {
		return FRIENDS_TO_GRAHA;
	}
	public static Set<Name_Of_Graha> getNuetralToGraha() {
		return NUETRAL_TO_GRAHA;
	}
	
	

}
