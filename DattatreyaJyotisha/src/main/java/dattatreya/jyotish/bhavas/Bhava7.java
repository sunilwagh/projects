package dattatreya.jyotish.bhavas;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava7")
@Order(value=7)
public class Bhava7 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA7;

	private Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
}
