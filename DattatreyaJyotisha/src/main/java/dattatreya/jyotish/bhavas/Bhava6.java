package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava6")
@Order(value=6)
public class Bhava6 implements Bhava {
	
	private final BhavaNames name = BhavaNames.BHAVA6;
	
	private Rashi rashi;
	
	private final Set<String> significators = new HashSet<String>();
	
	 Bhava6() {
			addSignificators();
		}
		
	public void addSignificators()
		{
			significators.add("ENEMIES");
			significators.add("DISEASES");
			significators.add("HURDLES IN LIFE");
			
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
