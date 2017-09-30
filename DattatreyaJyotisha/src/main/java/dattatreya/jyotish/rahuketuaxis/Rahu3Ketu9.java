package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu3ketu8")
@Order(value = 3)
public class Rahu3Ketu9 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava3")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava9")
	KetuInBhava ketuInBhava;

	public String getRahuInfo() {

		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {

		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
