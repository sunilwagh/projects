package dattatreya.jyotish;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dattatreya.jyotish.chart.processors.D1RashiChartProcessor;

/**
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
**/

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;

public class App {
	public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            D1RashiChartProcessor d1RashiChartProcessor = (D1RashiChartProcessor) context.getBean("d1RashiChartProcessor");
            
         
            
            Rashi ariesRashi = (Rashi) context.getBean("ariesRashi");
            Rashi taurusRashi = (Rashi) context.getBean("taurusRashi");
            Rashi geminiRashi = (Rashi) context.getBean("geminiRashi");
            Rashi cancerRashi = (Rashi) context.getBean("cancerRashi");
            Rashi leoRashi = (Rashi) context.getBean("leoRashi");
            Rashi virgoRashi = (Rashi) context.getBean("virgoRashi");
            Rashi libraRashi = (Rashi) context.getBean("libraRashi");
            Rashi scorpioRashi = (Rashi) context.getBean("scorpioRashi");
            Rashi sagittariusRashi = (Rashi) context.getBean("sagittariusRashi");
            Rashi capricornRashi = (Rashi) context.getBean("capricornRashi");
            Rashi acquariusRashi = (Rashi) context.getBean("acquariusRashi");
            Rashi piscesRashi = (Rashi) context.getBean("piscesRashi");
            Graha surya = (Graha) context.getBean("surya");
            Graha chandra = (Graha) context.getBean("chandra");
            Graha mangal = (Graha) context.getBean("mangal");
            Graha budha = (Graha) context.getBean("budha");
            Graha guru = (Graha) context.getBean("guru");
            Graha shukra = (Graha) context.getBean("shukra");
            Graha shani = (Graha) context.getBean("shani");
            Graha rahu = (Graha) context.getBean("rahu");
            Graha ketu = (Graha) context.getBean("ketu");
            
            
            
            
            
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
        	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, NAME_OF_NAKSHTRA.JYESTHA,new Pada4(),23.35));
        	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, NAME_OF_NAKSHTRA.BHARANI, new Pada4(),24.38));
        	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, NAME_OF_NAKSHTRA.UTTAR_PHALGUNI,new Pada2(),3.12));
        	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, NAME_OF_NAKSHTRA.JYESTHA,new Pada4(),22.52));
        	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, NAME_OF_NAKSHTRA.SWATI,new Pada1(),8.45));
        	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, NAME_OF_NAKSHTRA.UTTAR_ASHADA,new Pada4(),6.43));
        	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, NAME_OF_NAKSHTRA.CHITRA,new Pada1(),26.18));
        	cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, NAME_OF_NAKSHTRA.PUNARVASU,new Pada4(),0.48));
        	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, NAME_OF_NAKSHTRA.UTTAR_ASHADA,new Pada2(),0.48));
        	*/
        	
        	
        	ariesGrahas.add(chandra);
        	cancerGrahas.add(rahu);
        	virgoGrahas.add(shani);
        	virgoGrahas.add(mangal);
        	libraGrahas.add(guru);
        	scorpioGrahas.add(surya);
        	scorpioGrahas.add(budha);
        	capricornGrahas.add(shukra);
        	capricornGrahas.add(ketu);
        	ariesRashi.setGrahas(ariesGrahas);
        	virgoRashi.setGrahas(virgoGrahas);
        	libraRashi.setGrahas(libraGrahas);
        	cancerRashi.setGrahas(cancerGrahas);
        	scorpioRashi.setGrahas(scorpioGrahas);
        	capricornRashi.setGrahas(capricornGrahas);
        	
        	
        	
        	
        	
        	d1RashiChartProcessor.getHoroscope().getBhava1().setRashi(piscesRashi);
        	d1RashiChartProcessor.getHoroscope().getBhava2().setRashi(ariesRashi);
            d1RashiChartProcessor.getHoroscope().getBhava3().setRashi(taurusRashi);
            d1RashiChartProcessor.getHoroscope().getBhava4().setRashi(geminiRashi);
            d1RashiChartProcessor.getHoroscope().getBhava5().setRashi(cancerRashi);
            d1RashiChartProcessor.getHoroscope().getBhava6().setRashi(leoRashi);
            d1RashiChartProcessor.getHoroscope().getBhava7().setRashi(virgoRashi);
            d1RashiChartProcessor.getHoroscope().getBhava8().setRashi(libraRashi);
            d1RashiChartProcessor.getHoroscope().getBhava9().setRashi(scorpioRashi);
            d1RashiChartProcessor.getHoroscope().getBhava10().setRashi(sagittariusRashi);
            d1RashiChartProcessor.getHoroscope().getBhava11().setRashi(capricornRashi);
            d1RashiChartProcessor.getHoroscope().getBhava12().setRashi(acquariusRashi);
        	/*

            */
            
            System.out.println(d1RashiChartProcessor.processHoroscope());
            
            /**
            ObjectMapper mapper = new ObjectMapper();
        	mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        	try {
        		
        		
        		
    			System.out.println(mapper.writeValueAsString(obj.horoscope));
    		} catch (JsonProcessingException e) {
    			// TODO Auto-generated catch block
    			e.printStackTrace();
    		}
    		**/
            
            
	    

	}
}