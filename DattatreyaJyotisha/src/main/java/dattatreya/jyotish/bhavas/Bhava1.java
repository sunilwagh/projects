package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.RashiNames;

@Component("bhava1")
@Order(value=1)
public class Bhava1 implements Bhava{
	
	
	private Rashi rashi;
	
	private RashiNames rashiName;
	
	private final Set<String> significators = new HashSet<String>();

	Bhava1()
	{
		addSignificators();
	}
	
	
	public void addSignificators()
	{
		significators.add("SELF");
		significators.add("APPEARANCE");
		significators.add("BODY");
	}
	
	public RashiNames getRashiName() {
		return rashiName;
	}

	public void setRashiName(RashiNames rashiName) {
		this.rashiName = rashiName;
	}
	
	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}
	
	
	
	

	@Override
	public String toString() {
		return "Bhava1 [rashi=" + rashi + ", getRashi()=" + getRashi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	

}
