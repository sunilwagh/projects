package dattatreya.jyotish.horoscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.bhavas.Bhava;

@Component("d5PanchamshaChart")
@Order(value=5)
public class D5PanchamshaChart implements Chart{
	
	@Autowired
	Bhava[] bhavas;
	
	public Bhava[] getBhavas() {
		return bhavas;
	}
	public void setBhavas(Bhava[] bhavas) {
		this.bhavas = bhavas;
	}

}
