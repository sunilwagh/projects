package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava4")
@Order(value=4)
public class Bhava4 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA4;
	
	private Rashi rashi;
	
    private final Set<String> significators = new HashSet<String>();
    
    Bhava4() {
		addSignificators();
	}
	
	public void addSignificators()
	{
		significators.add("MOTHER");
		significators.add("HOME");
		significators.add("VEHICLE");
		significators.add("PROPERTY");
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
