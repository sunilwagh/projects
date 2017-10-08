package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("taurusAscendant")
@Order(value=2)
public class TaurusAscendant implements LagnaRashi{
	
	public enum FUNCTIONAL_BENEFIC{SHUKRA,SHANI,BUDHA};
    
	public enum FUNCTIONAL_MALEFIC{MANGAL,GURU,SHUKRA,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
