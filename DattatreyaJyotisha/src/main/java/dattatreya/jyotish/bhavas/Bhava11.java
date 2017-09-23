package dattatreya.jyotish.bhavas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;

@Component("bhava11")
public class Bhava11 implements Bhava{
	
	
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
