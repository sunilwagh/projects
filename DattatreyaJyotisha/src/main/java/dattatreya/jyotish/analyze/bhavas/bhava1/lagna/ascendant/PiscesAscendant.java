package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("piscesAscendant")
@Order(value=12)
public class PiscesAscendant implements LagnaRashi {
	
	 public enum FUNCTIONAL_BENEFIC{CHANDRA,MANGAL};
	
	 public enum FUNCTIONAL_MALEFIC{SHUKRA,SURYA,RAHU,KETU};
	
     public enum FUNCTIONAL_NUETRAL{BUDHA,GURU};
     
     
     PiscesAscendant(){
    	 
    	 
     }


	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	}
}
