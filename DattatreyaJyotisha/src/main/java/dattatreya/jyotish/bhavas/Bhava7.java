package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava7")
@Order(value=7)
public class Bhava7 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA7;

	private Rashi rashi;
	
	private final Set<String> significators = new HashSet<String>();
	
	 Bhava7() {
			addSignificators();
		}
	 
	 public void addSignificators()
		{
			significators.add("");
			significators.add("");
			significators.add("");
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
