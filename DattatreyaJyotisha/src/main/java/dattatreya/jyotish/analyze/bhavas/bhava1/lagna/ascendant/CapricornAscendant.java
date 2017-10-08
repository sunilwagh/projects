package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("capricornAscendant")
@Order(value=10)
public class CapricornAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{SHUKRA,BUDHA,SHANI};
	
    public enum FUNCTIONAL_BENEFIC{CHANDRA,MANGAL,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{SURYA,GURU}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
