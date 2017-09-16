package jyotish;

import java.util.ArrayList;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import jyotish.grahas.Graha;
import jyotish.grahas.GrahaFactory;
import jyotish.nakshatras.padas.Pada1;
import jyotish.nakshatras.padas.Pada2;
import jyotish.nakshatras.padas.Pada4;
import jyotish.rashis.Rashi;
import jyotish.rashis.RashiFactory;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;

public class App {
	public static void main(String[] args) {

            ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
            HoroscopeProcessor obj = (HoroscopeProcessor) context.getBean("horoscopeProcessor");
            
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
        	
        	
        	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SURYA, NAME_OF_NAKSHTRA.JYESTHA,new Pada4(),23.35));
        	ariesGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.CHANDRA, NAME_OF_NAKSHTRA.BHARANI, new Pada4(),24.38));
        	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.MANGAL, NAME_OF_NAKSHTRA.UTTAR_PHALGUNI,new Pada2(),3.12));
        	scorpioGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.BUDHA, NAME_OF_NAKSHTRA.JYESTHA,new Pada4(),22.52));
        	libraGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.GURU, NAME_OF_NAKSHTRA.SWATI,new Pada1(),8.45));
        	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHUKRA, NAME_OF_NAKSHTRA.UTTAR_ASHADA,new Pada4(),6.43));
        	virgoGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.SHANI, NAME_OF_NAKSHTRA.CHITRA,new Pada1(),26.18));
        	cancerGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.RAHU, NAME_OF_NAKSHTRA.PUNARVASU,new Pada4(),0.48));
        	capricornGrahas.add(GrahaFactory.getGraha(Name_Of_Graha.KETU, NAME_OF_NAKSHTRA.UTTAR_ASHADA,new Pada2(),0.48));
        	
        	
        	
        	ariesRashi.setGrahas(ariesGrahas);
        	virgoRashi.setGrahas(virgoGrahas);
        	libraRashi.setGrahas(libraGrahas);
        	
        	cancerRashi.setGrahas(cancerGrahas);
        	scorpioRashi.setGrahas(scorpioGrahas);
        	capricornRashi.setGrahas(capricornGrahas);
        	
        	
        	
        	obj.horoscope.getBhava1().setRashi(piscesRashi);
        	obj.horoscope.getBhava2().setRashi(ariesRashi);
            obj.horoscope.getBhava3().setRashi(taurusRashi);
            obj.horoscope.getBhava4().setRashi(geminiRashi);
            obj.horoscope.getBhava5().setRashi(cancerRashi);
            obj.horoscope.getBhava6().setRashi(leoRashi);
            obj.horoscope.getBhava7().setRashi(virgoRashi);
            obj.horoscope.getBhava8().setRashi(libraRashi);
            obj.horoscope.getBhava9().setRashi(scorpioRashi);
            obj.horoscope.getBhava10().setRashi(sagittariusRashi);
            obj.horoscope.getBhava11().setRashi(capricornRashi);
            obj.horoscope.getBhava12().setRashi(acquariusRashi);
            
            System.out.println(obj.processHoroscope());
            
            
	    

	}
}