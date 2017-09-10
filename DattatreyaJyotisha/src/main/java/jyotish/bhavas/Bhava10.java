package jyotish.bhavas;

import jyotish.rashis.Rashi;

public class Bhava10 implements Bhava{
	
    Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
	
	@Override
	public String toString() {
		return "Bhava10 [rashi=" + rashi + ", getRashi()=" + getRashi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
