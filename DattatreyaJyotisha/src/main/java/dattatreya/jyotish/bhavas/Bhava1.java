package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;

@Component("bhava1")
public class Bhava1 implements Bhava{
	
	
	private Rashi rashi;
	
	private Name_Of_Rashi rashiName;
	
	private final static Set<String> significators = new HashSet<String>();

	
	
	
	public static void addSignificators()
	{
		significators.add("SELF");
		significators.add("APPEARANCE");
		significators.add("BODY");
	}
	
	public Name_Of_Rashi getRashiName() {
		return rashiName;
	}

	public void setRashiName(Name_Of_Rashi rashiName) {
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
