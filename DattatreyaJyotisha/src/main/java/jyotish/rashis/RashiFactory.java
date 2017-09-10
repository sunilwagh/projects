package jyotish.rashis;

import java.util.ArrayList;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;
;

/** http://vaidikasamhita.com/2015/09/25/characteristics-of-the-rashi-or-signs-in-astrology/**/

public final class RashiFactory {

	// use getShape method to get object of type shape
	public static Rashi getRashi(Name_Of_Rashi rashi,ArrayList<Graha> grahas) {

		
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
		aries.setGender(Gender_Of_Rashi.MALE);
		aries.setMobility(Mobility_Of_Rashi.CHARA);
		aries.setTattva(Tattva.AGNI);
		aries.setDirection(Direction.EAST);
		aries.setGrahas(grahas);
		return aries;

	}

	private static Rashi createTaurusRashi(ArrayList<Graha> grahas) {
		Taurus taurus = new Taurus();
		taurus.setGender(Gender_Of_Rashi.FEMALE);
		taurus.setMobility(Mobility_Of_Rashi.STHIRA);
		taurus.setTattva(Tattva.PRITHVI);
		taurus.setDirection(Direction.SOUTH);
		taurus.setGrahas(grahas);
		return taurus;

	}
	
	private static Rashi createGeminiRashi(ArrayList<Graha> grahas) {
		Gemini gemini = new Gemini();
		gemini.setGender(Gender_Of_Rashi.MALE);
		gemini.setMobility(Mobility_Of_Rashi.DWISVABHAVA);
		gemini.setTattva(Tattva.VAYU);
		gemini.setDirection(Direction.WEST);
		gemini.setGrahas(grahas);
		return gemini;

	}
	
	private static Rashi createCancerRashi(ArrayList<Graha> grahas) {
		Cancer cancer = new Cancer();
		cancer.setGender(Gender_Of_Rashi.FEMALE);
		cancer.setMobility(Mobility_Of_Rashi.CHARA);
		cancer.setTattva(Tattva.APA);
		cancer.setDirection(Direction.NORTH);
		cancer.setGrahas(grahas);
		return cancer;

	}
	
	private static Rashi createLeoRashi(ArrayList<Graha> grahas) {
		Leo leo = new Leo();
		leo.setGender(Gender_Of_Rashi.MALE);
		leo.setMobility(Mobility_Of_Rashi.STHIRA);
		leo.setTattva(Tattva.AGNI);
		leo.setDirection(Direction.EAST);
		leo.setGrahas(grahas);
		return leo;

	}
	
	private static Rashi createVirgoRashi(ArrayList<Graha> grahas) {
		Virgo virgo = new Virgo();
		virgo.setGender(Gender_Of_Rashi.FEMALE);
		virgo.setMobility(Mobility_Of_Rashi.DWISVABHAVA);
		virgo.setTattva(Tattva.PRITHVI);
		virgo.setDirection(Direction.SOUTH);
		virgo.setGrahas(grahas);
		return virgo;

	}
	
	private static Rashi createLibraRashi(ArrayList<Graha> grahas) {
		Libra libra = new Libra();
		libra.setGender(Gender_Of_Rashi.MALE);
		libra.setMobility(Mobility_Of_Rashi.CHARA);
		libra.setTattva(Tattva.VAYU);
		libra.setDirection(Direction.WEST);
		libra.setGrahas(grahas);
		return libra;

	}
	
	private static Rashi createScorpioRashi(ArrayList<Graha> grahas) {
		Scorpio scorpio = new Scorpio();
		scorpio.setGender(Gender_Of_Rashi.FEMALE);
		scorpio.setMobility(Mobility_Of_Rashi.STHIRA);
		scorpio.setTattva(Tattva.APA);
		scorpio.setDirection(Direction.NORTH);
		scorpio.setGrahas(grahas);
		return scorpio;

	}
	
	private static Rashi createSagittariusRashi(ArrayList<Graha> grahas) {
		Sagittaurius sagittarius = new Sagittaurius();
		sagittarius.setGender(Gender_Of_Rashi.MALE);
		sagittarius.setMobility(Mobility_Of_Rashi.DWISVABHAVA);
		sagittarius.setTattva(Tattva.AGNI);
		sagittarius.setDirection(Direction.EAST);
		sagittarius.setGrahas(grahas);
		return sagittarius;

	}
	
	private static Rashi createCapricornRashi(ArrayList<Graha> grahas) {
		Capricorn capricorn = new Capricorn();
		capricorn.setGender(Gender_Of_Rashi.FEMALE);
		capricorn.setMobility(Mobility_Of_Rashi.CHARA);
		capricorn.setTattva(Tattva.PRITHVI);
		capricorn.setDirection(Direction.SOUTH);
		capricorn.setGrahas(grahas);
		return capricorn;

	}
	
	private static Rashi createAcquariusRashi(ArrayList<Graha> grahas) {
		Acquarius acquarius = new Acquarius();
		acquarius.setGender(Gender_Of_Rashi.MALE);
		acquarius.setMobility(Mobility_Of_Rashi.STHIRA);
		acquarius.setTattva(Tattva.VAYU);
		acquarius.setDirection(Direction.WEST);
		acquarius.setGrahas(grahas);
		return  acquarius;

	}
	
	private static Rashi createPiscesRashi(ArrayList<Graha> grahas) {
		Pisces pisces = new Pisces();
		pisces.setGender(Gender_Of_Rashi.FEMALE);
		pisces.setMobility(Mobility_Of_Rashi.DWISVABHAVA);
		pisces.setTattva(Tattva.APA);
		pisces.setDirection(Direction.NORTH);
		pisces.setGrahas(grahas);
		return pisces;

	}
	
	
	

}
