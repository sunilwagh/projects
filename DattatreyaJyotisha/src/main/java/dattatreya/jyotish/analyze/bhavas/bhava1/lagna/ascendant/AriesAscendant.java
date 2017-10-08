package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("ariesAscendant")
@Order(value=1)
public class AriesAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{BUDHA,RAHU,KETU};
	
    public enum FUNCTIONAL_BENEFIC{SURYA,MANGAL,GURU,CHANDRA};
	
	public enum FUNCTIONAL_NUETRAL{}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
