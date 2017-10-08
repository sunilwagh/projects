package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("libraAscendant")
@Order(value=7)
public class LibraAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{BUDHA,SHUKRA,SHANI};
	
    public enum FUNCTIONAL_BENEFIC{SURYA,MANGAL,GURU};
	
	public enum FUNCTIONAL_NUETRAL{CHANDRA}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
