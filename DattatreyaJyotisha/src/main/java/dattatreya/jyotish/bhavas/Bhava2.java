package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava2")
@Order(value = 2)
public class Bhava2 implements Bhava {

	private final BhavaNames name = BhavaNames.BHAVA2;

	private Rashi rashi;

	private final Set<String> significators = new HashSet<String>();

	Bhava2() {
		addSignificators();
	}

	public void addSignificators() {
		significators.add("FOOD");
		significators.add("FAMILY");
		significators.add("WEALTH");
	}

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

	public BhavaNames getName() {
		return name;
	}

	public Set<String> getSignificators() {
		return significators;
	}

}
