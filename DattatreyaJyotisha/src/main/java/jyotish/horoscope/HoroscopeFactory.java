package jyotish.horoscope;

import java.util.ArrayList;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

import jyotish.bhavas.BhavaFactory;
import jyotish.grahas.Graha;
import jyotish.grahas.GrahaFactory;
import jyotish.nakshatras.padas.Pada1;
import jyotish.nakshatras.padas.Pada2;
import jyotish.nakshatras.padas.Pada3;
import jyotish.nakshatras.padas.Pada4;
import util.JyotishEnumUtil.Name_Of_Bhava;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Nakshatra;
import util.JyotishEnumUtil.Name_Of_Rashi;

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
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, Name_Of_Nakshatra.CHITRA,new Pada4()));
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, Name_Of_Nakshatra.CHITRA,new Pada3()));
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, Name_Of_Nakshatra.SWATI,new Pada2()));
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, Name_Of_Nakshatra.JYESTHA,new Pada1()));
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, Name_Of_Nakshatra.JYESTHA,new Pada3()));
    	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, Name_Of_Nakshatra.BHARANI, new Pada2()));
    	taurusGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, Name_Of_Nakshatra.MRIGASHIRSHA, new Pada1()));
    	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada3()));
    	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada2()));
    	*/
    
    	
    	Horoscope horoscope = new Horoscope();
    	horoscope.setBhava1(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA1,Name_Of_Rashi.LIBRA,libraGrahas));
    	horoscope.setBhava2(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA2,Name_Of_Rashi.SCORPIO,scorpioGrahas));
    	horoscope.setBhava3(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA3,Name_Of_Rashi.SAGITTAURIUS,sagittariusGrahas));
    	horoscope.setBhava4(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA4,Name_Of_Rashi.CAPRICORN,capricornGrahas));
    	horoscope.setBhava5(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA5,Name_Of_Rashi.ACQUARIUS,acquariusGrahas));
    	horoscope.setBhava6(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA6,Name_Of_Rashi.PISCES,piscesGrahas));
    	horoscope.setBhava7(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA7,Name_Of_Rashi.ARIES,ariesGrahas));
    	horoscope.setBhava8(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA8,Name_Of_Rashi.TAURUS,taurusGrahas));
    	horoscope.setBhava9(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA9,Name_Of_Rashi.GEMINI,geminiGrahas));
    	horoscope.setBhava10(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA10,Name_Of_Rashi.CANCER,cancerGrahas));
    	horoscope.setBhava11(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA11,Name_Of_Rashi.LEO,leoGrahas));
    	horoscope.setBhava12(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA12,Name_Of_Rashi.VIRGO,virgoGrahas));
    	
    	
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
    	
    	
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, Name_Of_Nakshatra.JYESTHA,new Pada4(),23.35));
    	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, Name_Of_Nakshatra.BHARANI, new Pada4(),24.38));
    	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, Name_Of_Nakshatra.UTTAR_PHALGUNI,new Pada2(),3.12));
    	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, Name_Of_Nakshatra.JYESTHA,new Pada4(),22.52));
    	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, Name_Of_Nakshatra.SWATI,new Pada1(),8.45));
    	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, Name_Of_Nakshatra.UTTAR_ASHADA,new Pada4(),6.43));
    	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, Name_Of_Nakshatra.CHITRA,new Pada1(),26.18));
    	cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, Name_Of_Nakshatra.PUNARVASU,new Pada4(),0.48));
    	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, Name_Of_Nakshatra.UTTAR_ASHADA,new Pada2(),0.48));
    	
    	
    	Horoscope horoscope = new Horoscope();
    	horoscope.setBhava1(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA1,Name_Of_Rashi.PISCES,piscesGrahas));
    	horoscope.setBhava2(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA2,Name_Of_Rashi.ARIES,ariesGrahas));
    	horoscope.setBhava3(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA3,Name_Of_Rashi.TAURUS,taurusGrahas));
    	horoscope.setBhava4(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA4,Name_Of_Rashi.GEMINI,geminiGrahas));
    	horoscope.setBhava5(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA5,Name_Of_Rashi.CANCER,cancerGrahas));
    	horoscope.setBhava6(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA6,Name_Of_Rashi.LEO,leoGrahas));
    	horoscope.setBhava7(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA7,Name_Of_Rashi.VIRGO,virgoGrahas));
    	horoscope.setBhava8(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA8,Name_Of_Rashi.LIBRA,libraGrahas));
    	horoscope.setBhava9(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA9,Name_Of_Rashi.SCORPIO,scorpioGrahas));
    	horoscope.setBhava10(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA10,Name_Of_Rashi.SAGITTAURIUS,sagittariusGrahas));
    	horoscope.setBhava11(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA11,Name_Of_Rashi.CAPRICORN,capricornGrahas));
    	horoscope.setBhava12(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA12,Name_Of_Rashi.ACQUARIUS,acquariusGrahas));
    	
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
 	
 	
 	cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, Name_Of_Nakshatra.CHITRA,new Pada4(),0.00));
 	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, Name_Of_Nakshatra.BHARANI, new Pada2(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada3(),0.00));
 	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, Name_Of_Nakshatra.CHITRA,new Pada3(),0.00));
    cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, Name_Of_Nakshatra.JYESTHA,new Pada1(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada2(),0.00));
	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, Name_Of_Nakshatra.SWATI,new Pada2(),0.00));
 	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, Name_Of_Nakshatra.MRIGASHIRSHA, new Pada1(),0.00));
 	piscesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, Name_Of_Nakshatra.JYESTHA,new Pada3(),0.00));
 	
 	
 	Horoscope horoscope = new Horoscope();
 	horoscope.setBhava1(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA1,Name_Of_Rashi.LEO,leoGrahas));
 	horoscope.setBhava2(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA2,Name_Of_Rashi.VIRGO,virgoGrahas));
 	horoscope.setBhava3(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA3,Name_Of_Rashi.LIBRA,libraGrahas));
 	horoscope.setBhava4(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA4,Name_Of_Rashi.SCORPIO,scorpioGrahas));
 	horoscope.setBhava5(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA5,Name_Of_Rashi.SAGITTAURIUS,sagittariusGrahas));
 	horoscope.setBhava6(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA6,Name_Of_Rashi.CAPRICORN,capricornGrahas));
 	horoscope.setBhava7(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA7,Name_Of_Rashi.ACQUARIUS,acquariusGrahas));
 	horoscope.setBhava8(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA8,Name_Of_Rashi.PISCES,piscesGrahas));
 	horoscope.setBhava9(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA9,Name_Of_Rashi.ARIES,ariesGrahas));
 	horoscope.setBhava10(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA10,Name_Of_Rashi.TAURUS,taurusGrahas));
 	horoscope.setBhava11(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA11,Name_Of_Rashi.GEMINI,geminiGrahas));
 	horoscope.setBhava12(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA12,Name_Of_Rashi.CANCER,cancerGrahas));
 	
 	
 	
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
	 	
	 	
	 	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, Name_Of_Nakshatra.CHITRA,new Pada4(),0.00));
	 	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, Name_Of_Nakshatra.BHARANI, new Pada2(),0.00));
	 	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada3(),0.00));
	 	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, Name_Of_Nakshatra.CHITRA,new Pada3(),0.00));
	    cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, Name_Of_Nakshatra.JYESTHA,new Pada1(),0.00));
	 	leoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, Name_Of_Nakshatra.PURVA_PHALGUNI,new Pada2(),0.00));
		piscesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, Name_Of_Nakshatra.SWATI,new Pada2(),0.00));
	 	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, Name_Of_Nakshatra.MRIGASHIRSHA, new Pada1(),0.00));
	 	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, Name_Of_Nakshatra.JYESTHA,new Pada3(),0.00));
	 	
	 	
	 	Horoscope horoscope = new Horoscope();
	 	horoscope.setBhava1(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA1,Name_Of_Rashi.ACQUARIUS,acquariusGrahas));
	 	horoscope.setBhava2(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA2,Name_Of_Rashi.PISCES,piscesGrahas));
	 	horoscope.setBhava3(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA3,Name_Of_Rashi.ARIES,ariesGrahas));
	 	horoscope.setBhava4(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA4,Name_Of_Rashi.TAURUS,taurusGrahas));
	 	horoscope.setBhava5(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA5,Name_Of_Rashi.GEMINI,geminiGrahas));
	 	horoscope.setBhava6(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA6,Name_Of_Rashi.CANCER,cancerGrahas));
	 	horoscope.setBhava7(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA7,Name_Of_Rashi.LEO,leoGrahas));
	 	horoscope.setBhava8(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA8,Name_Of_Rashi.VIRGO,virgoGrahas));
	 	horoscope.setBhava9(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA9,Name_Of_Rashi.LIBRA,libraGrahas));
	 	horoscope.setBhava10(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA10,Name_Of_Rashi.SCORPIO,scorpioGrahas));
	 	horoscope.setBhava11(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA11,Name_Of_Rashi.SAGITTAURIUS,sagittariusGrahas));
	 	horoscope.setBhava12(BhavaFactory.getBhava(Name_Of_Bhava.BHAVA12,Name_Of_Rashi.CAPRICORN,capricornGrahas));
	 	
	 	
	 	
	 	
	 	return horoscope;
	 }


}
