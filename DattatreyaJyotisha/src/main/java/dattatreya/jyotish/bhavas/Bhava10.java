package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

/**
 * 
 * http://www.futurepointindia.com/articles/astrology/general/houses-their-significations-significators.aspx
 *
 */





@Component("bhava10")
@Order(value=10)
public class Bhava10 implements Bhava{
	
	private final BhavaNames name = BhavaNames.BHAVA10;
	
	private Rashi rashi;
	
	
	/**
	 * Profession, fame, power, position, authority, honour, success, status, knees, character, 
	 * karmas, ambition in life, father, employers and superiors, relationship between self and superiors, 
	 * success in business, promotion, recognition from government.
	 * 
	 * 
	 * 
	 * 
	 */
private final Set<String> significators = new HashSet<String>();
	
	Bhava10() {
			addSignificators();
		}
	 
	 public void addSignificators()
		{
			significators.add("Profession");
			significators.add("Fame");
			significators.add("Position");
			significators.add("Authority");
			significators.add("Recognition from Government");
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
		return "Bhava10 [rashi=" + rashi + ", getRashi()=" + getRashi() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

}
