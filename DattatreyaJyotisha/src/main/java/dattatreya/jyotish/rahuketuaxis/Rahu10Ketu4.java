package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu10ketu4")
@Order(value = 10)
public class Rahu10Ketu4 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava10")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava4")
	KetuInBhava ketuInBhava;

	public String getRahuInfo() {

		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {

		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
