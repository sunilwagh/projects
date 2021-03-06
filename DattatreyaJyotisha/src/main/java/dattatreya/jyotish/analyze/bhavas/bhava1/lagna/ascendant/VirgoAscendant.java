package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import java.util.HashMap;
import java.util.Map;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;
import dattatreya.jyotish.util.GrahaNames;

/*
 * http://www.shrivinayakaastrology.com/Planets/beneficandmaleficplanets.html
 */
@Component("virgoAscendant")
@Order(value=6)
public class VirgoAscendant implements LagnaRashi{
	
    public enum FUNCTIONAL_MALEFIC{BUDHA,SHUKRA};
    
    public Map<Integer, GrahaNames> Functional_Malefic = new HashMap<Integer,GrahaNames>();
    public Map<Integer, GrahaNames> Functional_Benefic = new HashMap<Integer,GrahaNames>();
    public Map<Integer, GrahaNames> Functional_Nuetral = new HashMap<Integer,GrahaNames>();
	
    public enum FUNCTIONAL_BENEFIC{LAGNA,SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{LAGNA,SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
