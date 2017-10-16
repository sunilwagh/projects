package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava9")
@Order(value=9)
public class Bhava9 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA9;

	private Rashi rashi;

	private final Set<String> significators = new HashSet<String>();
	
	Bhava9() {
			addSignificators();
		}
	 
	 public void addSignificators()
		{
			significators.add("VISIT TO HOLY PLACES");
			significators.add("LONG JOURNEY");
			significators.add("HIGHER EDUCATION");
			significators.add("");
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
