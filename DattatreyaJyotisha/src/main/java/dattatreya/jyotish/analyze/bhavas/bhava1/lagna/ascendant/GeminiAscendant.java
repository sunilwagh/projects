package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("geminiAscendant")
@Order(value=3)
public class GeminiAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{BUDHA,SHUKRA,SHANI};
	
    public enum FUNCTIONAL_BENEFIC{SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};
	
	

}
