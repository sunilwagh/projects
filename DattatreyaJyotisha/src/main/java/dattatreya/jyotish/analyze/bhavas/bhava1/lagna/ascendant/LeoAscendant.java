package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("leoAscendant")
@Order(value=5)
public class LeoAscendant implements LagnaRashi{
	
	public enum FUNCTIONAL_BENEFIC{SURYA,MANGAL,GURU};
	
    public enum FUNCTIONAL_MALEFIC{SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU};
	
    public enum FUNCTIONAL_NUETRAL{SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
