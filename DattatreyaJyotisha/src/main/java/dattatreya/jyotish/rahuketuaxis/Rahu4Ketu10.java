package dattatreya.jyotish.rahuketuaxis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;

@Component("rahu4ketu8")
@Order(value = 4)
public class Rahu4Ketu10 implements RahuKetuAxis {

	@Autowired
	@Qualifier("rahuInBhava4")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava10")
	KetuInBhava ketuInBhava;

	public String getRahuInfo() {

		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String getKetuInfo() {

		return ketuInBhava.getInfoAboutKetuInBhava();
	}

}
