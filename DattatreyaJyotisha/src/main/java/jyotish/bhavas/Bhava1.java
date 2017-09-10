package jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import jyotish.rashis.Rashi;
import util.EnumUtil.Name_Of_Rashi;

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
