package jyotish.analyze.bhavas.bhava1.lagna.ascendant;

import java.util.HashMap;
import java.util.Map;

import util.JyotishEnumUtil.Name_Of_Graha;

/*
 * http://www.shrivinayakaastrology.com/Planets/beneficandmaleficplanets.html
 */
public class VirgoAscendant {
	
    public enum FUNCTIONAL_MALEFIC{BUDHA,SHUKRA};
    
    public Map<Integer, Name_Of_Graha> Functional_Malefic = new HashMap<Integer,Name_Of_Graha>();
    public Map<Integer, Name_Of_Graha> Functional_Benefic = new HashMap<Integer,Name_Of_Graha>();
    public Map<Integer, Name_Of_Graha> Functional_Nuetral = new HashMap<Integer,Name_Of_Graha>();
	
    public enum FUNCTIONAL_BENEFIC{LAGNA,SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU};
	
	public enum FUNCTIONAL_NUETRAL{LAGNA,SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU};

}
