package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("sagittariusAscendant")
@Order(value=9)
public class SagittariusAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_BENEFIC{SURYA,MANGAL};
    
    public enum FUNCTIONAL_MALEFIC{SHUKRA,BUDHA,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{CHANDRA,GURU}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
