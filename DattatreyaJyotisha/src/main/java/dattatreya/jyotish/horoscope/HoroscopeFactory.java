package dattatreya.jyotish.horoscope;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import dattatreya.jyotish.bhavas.BhavaFactory;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.grahas.GrahaFactory;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada1;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada2;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada3;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada4;
import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.util.BhavaNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;

public class HoroscopeFactory {
	
public static Horoscope createHoroscopeB(){
    	
    	ArrayList<Graha> ariesGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> taurusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> geminiGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> cancerGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> leoGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> virgoGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> libraGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> scorpioGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> sagittariusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> capricornGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> acquariusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> piscesGrahas = new ArrayList<Graha>();
    	
    	/*
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, NAME_OF_NAKSHATRA.CHITRA,new Pada4()));
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, NAME_OF_NAKSHATRA.CHITRA,new Pada3()));
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, NAME_OF_NAKSHATRA.SWATI,new Pada2()));
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, NAME_OF_NAKSHATRA.JYESTHA,new Pada1()));
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, NAME_OF_NAKSHATRA.JYESTHA,new Pada3()));
    	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, NAME_OF_NAKSHATRA.BHARANI, new Pada2()));
    	taurusGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, NAME_OF_NAKSHATRA.MRIGASHIRSHA, new Pada1()));
    	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, NAME_OF_NAKSHATRA.PURVA_PHALGUNI,new Pada3()));
    	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, NAME_OF_NAKSHATRA.PURVA_PHALGUNI,new Pada2()));
    	*/
    
    	
    	Horoscope horoscope = new Horoscope();
    	horoscope.setBhava1(BhavaFactory.getBhava(BhavaNames.BHAVA1,RashiNames.LIBRA,libraGrahas));
    	horoscope.setBhava2(BhavaFactory.getBhava(BhavaNames.BHAVA2,RashiNames.SCORPIO,scorpioGrahas));
    	horoscope.setBhava3(BhavaFactory.getBhava(BhavaNames.BHAVA3,RashiNames.SAGITTAURIUS,sagittariusGrahas));
    	horoscope.setBhava4(BhavaFactory.getBhava(BhavaNames.BHAVA4,RashiNames.CAPRICORN,capricornGrahas));
    	horoscope.setBhava5(BhavaFactory.getBhava(BhavaNames.BHAVA5,RashiNames.ACQUARIUS,acquariusGrahas));
    	horoscope.setBhava6(BhavaFactory.getBhava(BhavaNames.BHAVA6,RashiNames.PISCES,piscesGrahas));
    	horoscope.setBhava7(BhavaFactory.getBhava(BhavaNames.BHAVA7,RashiNames.ARIES,ariesGrahas));
    	horoscope.setBhava8(BhavaFactory.getBhava(BhavaNames.BHAVA8,RashiNames.TAURUS,taurusGrahas));
    	horoscope.setBhava9(BhavaFactory.getBhava(BhavaNames.BHAVA9,RashiNames.GEMINI,geminiGrahas));
    	horoscope.setBhava10(BhavaFactory.getBhava(BhavaNames.BHAVA10,RashiNames.CANCER,cancerGrahas));
    	horoscope.setBhava11(BhavaFactory.getBhava(BhavaNames.BHAVA11,RashiNames.LEO,leoGrahas));
    	horoscope.setBhava12(BhavaFactory.getBhava(BhavaNames.BHAVA12,RashiNames.VIRGO,virgoGrahas));
    	
    	
    	return horoscope;
    }
    
    
 public static Horoscope createHoroscopeA(){
    	
    	ArrayList<Graha> ariesGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> taurusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> geminiGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> cancerGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> leoGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> virgoGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> libraGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> scorpioGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> sagittariusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> capricornGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> acquariusGrahas = new ArrayList<Graha>();
    	ArrayList<Graha> piscesGrahas = new ArrayList<Graha>();
    	
    	
    	scorpioGrahas.add(GrahaFactory.getGraha(GrahaNames.SURYA, NakshatraNames.JYESTHA,new Pada4(),23.35));
    	ariesGrahas.add(GrahaFactory.getGraha(GrahaNames.CHANDRA, NakshatraNames.BHARANI, new Pada4(),24.38));
    	virgoGrahas.add(GrahaFactory.getGraha(GrahaNames.MANGAL, NakshatraNames.UTTAR_PHALGUNI,new Pada2(),3.12));
    	scorpioGrahas.add(GrahaFactory.getGraha(GrahaNames.BUDHA, NakshatraNames.JYESTHA,new Pada4(),22.52));
    	libraGrahas.add(GrahaFactory.getGraha(GrahaNames.GURU, NakshatraNames.SWATI,new Pada1(),8.45));
    	capricornGrahas.add(GrahaFactory.getGraha(GrahaNames.SHUKRA, NakshatraNames.UTTAR_ASHADA,new Pada4(),6.43));
    	virgoGrahas.add(GrahaFactory.getGraha(GrahaNames.SHANI, NakshatraNames.CHITRA,new Pada1(),26.18));
    	cancerGrahas.add(GrahaFactory.getGraha(GrahaNames.RAHU, NakshatraNames.PUNARVASU,new Pada4(),0.48));
    	capricornGrahas.add(GrahaFactory.getGraha(GrahaNames.KETU, NakshatraNames.UTTAR_ASHADA,new Pada2(),0.48));
    	
    	
    	Horoscope horoscope = new Horoscope();
    	horoscope.setBhava1(BhavaFactory.getBhava(BhavaNames.BHAVA1,RashiNames.PISCES,piscesGrahas));
    	horoscope.setBhava2(BhavaFactory.getBhava(BhavaNames.BHAVA2,RashiNames.ARIES,ariesGrahas));
    	horoscope.setBhava3(BhavaFactory.getBhava(BhavaNames.BHAVA3,RashiNames.TAURUS,taurusGrahas));
    	horoscope.setBhava4(BhavaFactory.getBhava(BhavaNames.BHAVA4,RashiNames.GEMINI,geminiGrahas));
    	horoscope.setBhava5(BhavaFactory.getBhava(BhavaNames.BHAVA5,RashiNames.CANCER,cancerGrahas));
    	horoscope.setBhava6(BhavaFactory.getBhava(BhavaNames.BHAVA6,RashiNames.LEO,leoGrahas));
    	horoscope.setBhava7(BhavaFactory.getBhava(BhavaNames.BHAVA7,RashiNames.VIRGO,virgoGrahas));
    	horoscope.setBhava8(BhavaFactory.getBhava(BhavaNames.BHAVA8,RashiNames.LIBRA,libraGrahas));
    	horoscope.setBhava9(BhavaFactory.getBhava(BhavaNames.BHAVA9,RashiNames.SCORPIO,scorpioGrahas));
    	horoscope.setBhava10(BhavaFactory.getBhava(BhavaNames.BHAVA10,RashiNames.SAGITTAURIUS,sagittariusGrahas));
    	horoscope.setBhava11(BhavaFactory.getBhava(BhavaNames.BHAVA11,RashiNames.CAPRICORN,capricornGrahas));
    	horoscope.setBhava12(BhavaFactory.getBhava(BhavaNames.BHAVA12,RashiNames.ACQUARIUS,acquariusGrahas));
    	
    	
    	ObjectMapper mapper = new ObjectMapper();
    	mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
    	try {
    		
			System.out.println(mapper.writeValueAsString(horoscope));
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
       
    	
    	return horoscope;
    }
 
 
 public static Horoscope createHoroscopeC(){
 	
 	ArrayList<Graha> ariesGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> taurusGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> geminiGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> cancerGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> leoGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> virgoGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> libraGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> scorpioGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> sagittariusGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> capricornGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> acquariusGrahas = new ArrayList<Graha>();
 	ArrayList<Graha> piscesGrahas = new ArrayList<Graha>();
 	
 	
 	cancerGrahas.add(GrahaFactory.getGraha(GrahaNames.SURYA, NakshatraNames.CHITRA,new Pada4(),0.00));
 	scorpioGrahas.add(GrahaFactory.getGraha(GrahaNames.CHANDRA, NakshatraNames.BHARANI, new Pada2(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(GrahaNames.MANGAL, NakshatraNames.PURVA_PHALGUNI,new Pada3(),0.00));
 	leoGrahas.add(GrahaFactory.getGraha(GrahaNames.BUDHA, NakshatraNames.CHITRA,new Pada3(),0.00));
    cancerGrahas.add(GrahaFactory.getGraha(GrahaNames.GURU, NakshatraNames.JYESTHA,new Pada1(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(GrahaNames.SHUKRA, NakshatraNames.PURVA_PHALGUNI,new Pada2(),0.00));
	leoGrahas.add(GrahaFactory.getGraha(GrahaNames.SHANI, NakshatraNames.SWATI,new Pada2(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(GrahaNames.RAHU, NakshatraNames.MRIGASHIRSHA, new Pada1(),0.00));
 	piscesGrahas.add(GrahaFactory.getGraha(GrahaNames.KETU, NakshatraNames.JYESTHA,new Pada3(),0.00));
 	
 	
 	Horoscope horoscope = new Horoscope();
 	horoscope.setBhava1(BhavaFactory.getBhava(BhavaNames.BHAVA1,RashiNames.LEO,leoGrahas));
 	horoscope.setBhava2(BhavaFactory.getBhava(BhavaNames.BHAVA2,RashiNames.VIRGO,virgoGrahas));
 	horoscope.setBhava3(BhavaFactory.getBhava(BhavaNames.BHAVA3,RashiNames.LIBRA,libraGrahas));
 	horoscope.setBhava4(BhavaFactory.getBhava(BhavaNames.BHAVA4,RashiNames.SCORPIO,scorpioGrahas));
 	horoscope.setBhava5(BhavaFactory.getBhava(BhavaNames.BHAVA5,RashiNames.SAGITTAURIUS,sagittariusGrahas));
 	horoscope.setBhava6(BhavaFactory.getBhava(BhavaNames.BHAVA6,RashiNames.CAPRICORN,capricornGrahas));
 	horoscope.setBhava7(BhavaFactory.getBhava(BhavaNames.BHAVA7,RashiNames.ACQUARIUS,acquariusGrahas));
 	horoscope.setBhava8(BhavaFactory.getBhava(BhavaNames.BHAVA8,RashiNames.PISCES,piscesGrahas));
 	horoscope.setBhava9(BhavaFactory.getBhava(BhavaNames.BHAVA9,RashiNames.ARIES,ariesGrahas));
 	horoscope.setBhava10(BhavaFactory.getBhava(BhavaNames.BHAVA10,RashiNames.TAURUS,taurusGrahas));
 	horoscope.setBhava11(BhavaFactory.getBhava(BhavaNames.BHAVA11,RashiNames.GEMINI,geminiGrahas));
 	horoscope.setBhava12(BhavaFactory.getBhava(BhavaNames.BHAVA12,RashiNames.CANCER,cancerGrahas));
 	
 	
 	
 	return horoscope;
 }
 
 
 public static Horoscope createHoroscopeD(){
	 	
	 	ArrayList<Graha> ariesGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> taurusGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> geminiGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> cancerGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> leoGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> virgoGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> libraGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> scorpioGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> sagittariusGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> capricornGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> acquariusGrahas = new ArrayList<Graha>();
	 	ArrayList<Graha> piscesGrahas = new ArrayList<Graha>();
	 	
	 	
	 	leoGrahas.add(GrahaFactory.getGraha(GrahaNames.SURYA, NakshatraNames.CHITRA,new Pada4(),0.00));
	 	ariesGrahas.add(GrahaFactory.getGraha(GrahaNames.CHANDRA, NakshatraNames.BHARANI, new Pada2(),0.00));
	 	libraGrahas.add(GrahaFactory.getGraha(GrahaNames.MANGAL, NakshatraNames.PURVA_PHALGUNI,new Pada3(),0.00));
	 	leoGrahas.add(GrahaFactory.getGraha(GrahaNames.BUDHA, NakshatraNames.CHITRA,new Pada3(),0.00));
	    cancerGrahas.add(GrahaFactory.getGraha(GrahaNames.GURU, NakshatraNames.JYESTHA,new Pada1(),0.00));
	 	leoGrahas.add(GrahaFactory.getGraha(GrahaNames.SHUKRA, NakshatraNames.PURVA_PHALGUNI,new Pada2(),0.00));
		piscesGrahas.add(GrahaFactory.getGraha(GrahaNames.SHANI, NakshatraNames.SWATI,new Pada2(),0.00));
	 	ariesGrahas.add(GrahaFactory.getGraha(GrahaNames.RAHU, NakshatraNames.MRIGASHIRSHA, new Pada1(),0.00));
	 	libraGrahas.add(GrahaFactory.getGraha(GrahaNames.KETU, NakshatraNames.JYESTHA,new Pada3(),0.00));
	 	
	 	
	 	Horoscope horoscope = new Horoscope();
	 	horoscope.setBhava1(BhavaFactory.getBhava(BhavaNames.BHAVA1,RashiNames.ACQUARIUS,acquariusGrahas));
	 	horoscope.setBhava2(BhavaFactory.getBhava(BhavaNames.BHAVA2,RashiNames.PISCES,piscesGrahas));
	 	horoscope.setBhava3(BhavaFactory.getBhava(BhavaNames.BHAVA3,RashiNames.ARIES,ariesGrahas));
	 	horoscope.setBhava4(BhavaFactory.getBhava(BhavaNames.BHAVA4,RashiNames.TAURUS,taurusGrahas));
	 	horoscope.setBhava5(BhavaFactory.getBhava(BhavaNames.BHAVA5,RashiNames.GEMINI,geminiGrahas));
	 	horoscope.setBhava6(BhavaFactory.getBhava(BhavaNames.BHAVA6,RashiNames.CANCER,cancerGrahas));
	 	horoscope.setBhava7(BhavaFactory.getBhava(BhavaNames.BHAVA7,RashiNames.LEO,leoGrahas));
	 	horoscope.setBhava8(BhavaFactory.getBhava(BhavaNames.BHAVA8,RashiNames.VIRGO,virgoGrahas));
	 	horoscope.setBhava9(BhavaFactory.getBhava(BhavaNames.BHAVA9,RashiNames.LIBRA,libraGrahas));
	 	horoscope.setBhava10(BhavaFactory.getBhava(BhavaNames.BHAVA10,RashiNames.SCORPIO,scorpioGrahas));
	 	horoscope.setBhava11(BhavaFactory.getBhava(BhavaNames.BHAVA11,RashiNames.SAGITTAURIUS,sagittariusGrahas));
	 	horoscope.setBhava12(BhavaFactory.getBhava(BhavaNames.BHAVA12,RashiNames.CAPRICORN,capricornGrahas));
	 	
	 	
	 	
	 	
	 	return horoscope;
	 }


}
