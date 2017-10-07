package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava3")
@Order(value=3)
public class Bhava3 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA3;
	
	private Rashi rashi;
	
    private final Set<String> significators = new HashSet<String>();
	
	public void addSignificators()
	{
		significators.add("SHORT JOURNEY");
		significators.add("YOUNGER SIBLINGS");
		significators.add("COURAGE");
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
