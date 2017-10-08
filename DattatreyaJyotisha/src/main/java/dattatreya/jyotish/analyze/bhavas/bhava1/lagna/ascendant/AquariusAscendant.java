package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("aquariusAscendant")
@Order(value=11)
public class AquariusAscendant implements LagnaRashi{
	
	public enum FUNCTIONAL_BENEFIC{SHUKRA,SHANI};
	
    public enum FUNCTIONAL_MALEFIC{CHANDRA,MANGAL,GURU,RAHU,KETU};
 	
    public enum FUNCTIONAL_NUETRAL{SURYA,BUDHA}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
