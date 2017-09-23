package dattatreya.jyotish.bhavas;

import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;

@Component("bhava12")
public class Bhava12 implements Bhava{
	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
}
