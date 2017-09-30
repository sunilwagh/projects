package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu6ketu12")
@Order(value = 6)
public class Rahu6Ketu12 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava6")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava12")
	KetuInBhava ketuInBhava;

	public String getRahuInfo() {

		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {

		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
