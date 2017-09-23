package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;

@Component("rahu")
@Order(value=8)
public class Rahu implements Graha{
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private final static Name_Of_Graha grahaName = Name_Of_Graha.RAHU;
	private final static Name_Of_Rashi MOOLTRIKONARASHI=Name_Of_Rashi.ARIES;
	private final static Name_Of_Rashi EXALTATION=Name_Of_Rashi.CAPRICORN;
	private final static Name_Of_Rashi DEBILITATION=Name_Of_Rashi.CANCER;
	private final static Tattva tatva = Tattva.AGNI;
	private final static Name_Of_Rashi moolTrikonaRashi=Name_Of_Rashi.CANCER;
	private final static Name_Of_Rashi OWN=Name_Of_Rashi.GEMINI;
	private final static Tattva tattva = Tattva.PRITHVI;
	private final static Set<NAME_OF_NAKSHTRA> LORD_OF_NAKSHATRAS = new HashSet<NAME_OF_NAKSHTRA>();
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
	
	public double getDegrees() {
		return degrees;
	}
	public void setDegrees(double degrees) {
		this.degrees = degrees;
	}
	
	
	
	

}
