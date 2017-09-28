package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;

@Component("bhava6")
@Order(value=6)
public class Bhava6 implements Bhava {
	
	private Rashi rashi;
	
	private final Set<String> significators = new HashSet<String>();
		
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
}
