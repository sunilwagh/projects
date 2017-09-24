package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu8ketu2")
@Order(value=8)
public class Rahu8Ketu2 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava8")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava2")
	KetuInBhava ketuInBhava;
	
	
	public String getRahuInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getKetuInfo() {
		// TODO Auto-generated method stub
		return null;
	}

}
