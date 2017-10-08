package dattatreya.jyotish.bhavas;

import java.util.HashSet;
import java.util.Set;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.BhavaNames;


/**
 * 
 * Twelfth House :

Harm, punishment, confinement, expenditure, donations (given), marriage, work related to water resorts, vedic sacrifice, fines paid,
 sexual enjoyment outside wedlock, contacting sexually transmitted disease, weakness in sexual act, sleeping comforts, enjoying luxuries, 
 loss of spouse, losses in marriage, termination of employment, separation from own people, long journeys, settlement in foreign land.
 *
 */


@Component("bhava12")
@Order(value = 12)
public class Bhava12 implements Bhava {

	private final BhavaNames name = BhavaNames.BHAVA12;

	private Rashi rashi;

	private final Set<String> significators = new HashSet<String>();
	
	Bhava12()
	{
		addSignificators();
	}
	
	
	public void addSignificators() {
		significators.add("LOSSES");
		significators.add("SETTLEMENT IN FOREIGN LAND");
		significators.add("SLEEPING COMFORTS");
		significators.add("");

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
