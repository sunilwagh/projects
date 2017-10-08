package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("scorpioAscendant")
@Order(value=5)
public class ScorpioAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{SURYA,CHANDRA,GURU};
	
    public enum FUNCTIONAL_BENEFIC{BUDHA,SHUKRA,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{MANGAL,SHANI}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
