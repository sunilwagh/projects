package jyotish.bhavas;

import org.springframework.stereotype.Component;

import jyotish.rashis.Rashi;

@Component("bhava9")
public class Bhava9 implements Bhava{

	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
}
