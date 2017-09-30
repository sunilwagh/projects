package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu5ketu11")
@Order(value = 5)
public class Rahu5Ketu11 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava5")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava11")
	KetuInBhava ketuInBhava;

	public String getRahuInfo() {

		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {

		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
