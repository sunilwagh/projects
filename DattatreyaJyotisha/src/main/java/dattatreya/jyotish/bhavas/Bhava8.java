package dattatreya.jyotish.bhavas;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava8")
@Order(value=8)
public class Bhava8 implements Bhava {
	
	private final BhavaNames name = BhavaNames.BHAVA8;
	
	private Rashi rashi;

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

}
