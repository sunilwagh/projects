package dattatreya.jyotish.rashis;

import java.util.ArrayList;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.RashiNames;


/** http://vaidikasamhita.com/2015/09/25/characteristics-of-the-rashi-or-signs-in-astrology/**/

public final class RashiFactory {

	// use getShape method to get object of type shape
	public static Rashi getRashi(RashiNames rashi,ArrayList<Graha> grahas) {

		
		switch (rashi) {
		case ARIES:
			return(createAriesRashi(grahas));
		case TAURUS:
			return(createTaurusRashi(grahas));
		case GEMINI:
			return(createGeminiRashi(grahas));
		case CANCER:
			return(createCancerRashi(grahas));
		case LEO:
			return(createLeoRashi(grahas));
		case VIRGO:
			return(createVirgoRashi(grahas));
		case LIBRA:
			return(createLibraRashi(grahas));
		case SCORPIO:
			return(createScorpioRashi(grahas));
		case SAGITTAURIUS:
			return(createSagittariusRashi(grahas));
		case CAPRICORN:
			return(createCapricornRashi(grahas));
		case ACQUARIUS:
			return(createAcquariusRashi(grahas));
		case PISCES:
			return(createPiscesRashi(grahas));
		
		default:
			return null;

		}
	}

	private static Rashi createAriesRashi(ArrayList<Graha> grahas) {
		Aries aries = new Aries();
		aries.setGrahas(grahas);
		return aries;

	}

	private static Rashi createTaurusRashi(ArrayList<Graha> grahas) {
		Taurus taurus = new Taurus();
		taurus.setGrahas(grahas);
		return taurus;

	}
	
	private static Rashi createGeminiRashi(ArrayList<Graha> grahas) {
		Gemini gemini = new Gemini();
		gemini.setGrahas(grahas);
		return gemini;

	}
	
	private static Rashi createCancerRashi(ArrayList<Graha> grahas) {
		Cancer cancer = new Cancer();
		cancer.setGrahas(grahas);
		return cancer;

	}
	
	private static Rashi createLeoRashi(ArrayList<Graha> grahas) {
		Leo leo = new Leo();
		leo.setGrahas(grahas);
		return leo;

	}
	
	private static Rashi createVirgoRashi(ArrayList<Graha> grahas) {
		Virgo virgo = new Virgo();
		virgo.setGrahas(grahas);
		return virgo;

	}
	
	private static Rashi createLibraRashi(ArrayList<Graha> grahas) {
		Libra libra = new Libra();
		libra.setGrahas(grahas);
		return libra;

	}
	
	private static Rashi createScorpioRashi(ArrayList<Graha> grahas) {
		Scorpio scorpio = new Scorpio();
		
		scorpio.setGrahas(grahas);
		return scorpio;

	}
	
	private static Rashi createSagittariusRashi(ArrayList<Graha> grahas) {
		Sagittaurius sagittarius = new Sagittaurius();
		
		sagittarius.setGrahas(grahas);
		return sagittarius;

	}
	
	private static Rashi createCapricornRashi(ArrayList<Graha> grahas) {
		Capricorn capricorn = new Capricorn();
		
		capricorn.setGrahas(grahas);
		return capricorn;

	}
	
	private static Rashi createAcquariusRashi(ArrayList<Graha> grahas) {
		Acquarius acquarius = new Acquarius();
		acquarius.setGrahas(grahas);
		return  acquarius;

	}
	
	private static Rashi createPiscesRashi(ArrayList<Graha> grahas) {
		Pisces pisces = new Pisces();
		pisces.setGrahas(grahas);
		return pisces;

	}
	
	
	

}
