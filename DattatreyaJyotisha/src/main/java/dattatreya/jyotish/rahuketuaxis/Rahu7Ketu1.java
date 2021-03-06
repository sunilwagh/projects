package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu7ketu1")
@Order(value=7)
public class Rahu7Ketu1 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava7")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava1")
	KetuInBhava ketuInBhava;
	
	public String getRahuInfo() {
		
		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {
		
		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
