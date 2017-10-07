package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava12")
@Order(value = 12)
public class Bhava12 implements Bhava {

	private final BhavaNames name = BhavaNames.BHAVA12;

	private Rashi rashi;

	private final Set<String> significators = new HashSet<String>();

	public void addSignificators() {
		significators.add("GAINS");
		significators.add("NETWORK");
		significators.add("FRIENDS");
		significators.add("OLDER SIBLINGS");

	}

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
}
