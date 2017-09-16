package jyotish.bhavas;

import org.springframework.stereotype.Component;

import jyotish.rashis.Rashi;

@Component("bhava8")
public class Bhava8 implements Bhava {
	
	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

}
