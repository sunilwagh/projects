package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu2ketu8")
@Order(value=2)
public class Rahu2Ketu8 implements RahuKetuAxis {
	
	@Autowired
	@Qualifier("rahuInBhava2")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava8")
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
