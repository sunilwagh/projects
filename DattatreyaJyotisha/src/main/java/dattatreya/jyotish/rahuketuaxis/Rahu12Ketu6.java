package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu12ketu6")
@Order(value=12)
public class Rahu12Ketu6 implements RahuKetuAxis {

	
	@Autowired
	@Qualifier("rahuInBhava12")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava6")
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
