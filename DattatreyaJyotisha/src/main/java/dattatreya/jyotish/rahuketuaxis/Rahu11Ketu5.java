package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu11ketu5")
@Order(value=11)
public class Rahu11Ketu5 implements RahuKetuAxis {
	
	@Autowired
	@Qualifier("rahuInBhava11")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava5")
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
