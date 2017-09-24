package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu1ketu7")
@Order(value=1)
public class Rahu1Ketu7 implements RahuKetuAxis {
	
	@Autowired
	@Qualifier("rahuInBhava1")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava7")
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
