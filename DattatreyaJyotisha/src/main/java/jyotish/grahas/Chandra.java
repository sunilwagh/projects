package jyotish.grahas;

import java.util.HashSet;
import java.util.Set;

import jyotish.bhavas.Bhava;
import jyotish.nakshatras.Nakshatra;
import jyotish.nakshatras.padas.Pada;
import jyotish.rashis.Rashi;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Chandra implements Graha{
	
	Rashi lagnaKundaliRashi;
	Nakshatra nakshatra;
	Bhava bhava;
	Pada pada;
	double degrees;
	
	private final static Name_Of_Graha grahaName = Name_Of_Graha.CHANDRA;
	
	
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
