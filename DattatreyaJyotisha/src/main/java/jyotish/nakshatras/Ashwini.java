package jyotish.nakshatras;

import jyotish.grahas.Graha;
import util.EnumUtil.Diety;
import util.EnumUtil.Tattva;

public class Ashwini implements Nakshatra{
	
	private Diety diety;
	
	private Tattva tattva;
	
	private Graha graha;

	public Diety getDiety() {
		return diety;
	}

	public void setDiety(Diety diety) {
		this.diety = diety;
	}

	

	

	public Tattva getTattva() {
		return tattva;
	}

	public void setTattva(Tattva tattva) {
		this.tattva = tattva;
	}

	public Graha getGraha() {
		return graha;
	}

	public void setGraha(Graha graha) {
		this.graha = graha;
	}
	
	
	

}
