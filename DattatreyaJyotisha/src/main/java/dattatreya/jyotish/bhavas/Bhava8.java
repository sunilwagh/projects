package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;

@Component("bhava8")
@Order(value=8)
public class Bhava8 implements Bhava {
	
	private final BhavaNames name = BhavaNames.BHAVA8;
	
	private Rashi rashi;
	
	private final Set<String> significators = new HashSet<String>();
	
	 Bhava8() {
			addSignificators();
		}
	 
	 public void addSignificators()
		{
			significators.add("HIDDEN WEALTH");
			significators.add("UNEARNED WEALTH SUCH AS LOTTERIES,INHERITANCES AND GAINS/LOSSES FROM STOCK MARKET");
			significators.add("RESEARCH AND DEVELOPMENT");
			significators.add("TRANSFORMATION");
		}

	public Rashi getRashi() {
		return rashi;
	}

	public void setRashi(Rashi rashi) {
		this.rashi = rashi;
	}

}
