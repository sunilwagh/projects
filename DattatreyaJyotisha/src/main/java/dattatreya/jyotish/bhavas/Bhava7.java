package dattatreya.jyotish.bhavas;

import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;

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
