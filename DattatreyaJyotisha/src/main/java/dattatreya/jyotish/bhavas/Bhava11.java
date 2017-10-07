package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava11")
@Order(value=11)
public class Bhava11 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA11;
	
	private Rashi rashi;
	
    private final Set<String> significators = new HashSet<String>();
	
	Bhava11()
	{
		addSignificators();
	}
	
	
	
	public void addSignificators()
		{
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
	
	

	public BhavaNames getName() {
		return name;
	}



	public Set<String> getSignificators() {
		return significators;
	}



	@Override
	public String toString() {
		return "Bhava11 [rashi=" + rashi + ", getRashi()=" + getRashi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
