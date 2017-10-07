package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava5")
@Order(value=5)
public class Bhava5 implements Bhava {
	
	private final BhavaNames name = BhavaNames.BHAVA5;
	
	private Rashi rashi;

    private final Set<String> significators = new HashSet<String>();
    
    Bhava5() {
		addSignificators();
	}
	
	public void addSignificators()
	{
		significators.add("CHILDREN");
		significators.add("EDUCATION");
		significators.add("PAST LIFE KARMA");
		significators.add("POLITICAL DISCUSSIONS");
		significators.add("ROMANCE");
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
