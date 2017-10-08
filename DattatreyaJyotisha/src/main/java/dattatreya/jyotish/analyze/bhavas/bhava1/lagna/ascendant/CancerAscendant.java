package dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.LagnaRashi;

@Component("cancerAscendant")
@Order(value=4)
public class CancerAscendant implements LagnaRashi{
	
	 public enum FUNCTIONAL_BENEFIC{MANGAL,CHANDRA};
	
	 public enum FUNCTIONAL_MALEFIC{};
		
	 public enum FUNCTIONAL_NUETRAL{}

	public String getInfoOnLagnaRashi() {
		// TODO Auto-generated method stub
		return null;
	};

}
