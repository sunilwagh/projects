package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu9ketu3")
@Order(value=9)
public class Rahu9Ketu3 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava9")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava3")
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
