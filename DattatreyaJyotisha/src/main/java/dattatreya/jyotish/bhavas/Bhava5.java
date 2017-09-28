package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;

@Component("bhava5")
@Order(value=5)
public class Bhava5 implements Bhava {
	
	private Rashi rashi;

    private final Set<String> significators = new HashSet<String>();
	
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
}
