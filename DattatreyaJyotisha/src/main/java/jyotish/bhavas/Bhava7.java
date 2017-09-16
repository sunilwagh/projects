package jyotish.bhavas;

import org.springframework.stereotype.Component;

import jyotish.rashis.Rashi;

@Component("bhava7")
public class Bhava7 implements Bhava{

	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
}
