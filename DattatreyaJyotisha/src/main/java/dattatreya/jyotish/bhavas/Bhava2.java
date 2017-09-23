package dattatreya.jyotish.bhavas;

import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;


@Component("bhava2")
public class Bhava2 implements Bhava{
	
	Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

}
