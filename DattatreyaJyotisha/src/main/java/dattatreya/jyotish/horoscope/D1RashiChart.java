package dattatreya.jyotish.horoscope;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.bhavas.Bhava;


@Component("d1RashiChart")
@Order(value=1)
public class D1RashiChart implements Chart{
	
	
	@Autowired
	Bhava[] bhavas;
	
	public Bhava[] getBhavas() {
		return bhavas;
	}
	public void setBhavas(Bhava[] bhavas) {
		this.bhavas = bhavas;
	}
	
	
	
	
}
