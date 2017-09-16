package jyotish.bhavas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jyotish.rashis.Rashi;

@Component("bhava11")
public class Bhava11 implements Bhava{
	
	@Autowired
	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

	@Override
	public String toString() {
		return "Bhava11 [rashi=" + rashi + ", getRashi()=" + getRashi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
