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
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

@Component("ketu")
@Order(value=9)
public class Ketu implements Graha{
	
	
	Nakshatra nakshatra;
	Pada pada;
	double degrees;
	
	
	
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
	
	
	
	
	
	
	
}
