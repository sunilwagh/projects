package jyotish.grahas;

import jyotish.nakshatras.NakshatraFactory;
import jyotish.nakshatras.padas.Pada;
import util.JyotishEnumUtil;
import util.JyotishEnumUtil.Diety;
import util.JyotishEnumUtil.Name_Of_Graha;
import util.JyotishEnumUtil.Name_Of_Nakshatra;
;


public final class GrahaFactory {

	// use getShape method to get object of type shape
	public static Graha getGraha(Name_Of_Graha graha,Name_Of_Nakshatra nakshatra,Pada pada) {

		
		switch (graha) {
		case SURYA:
			return createSuryaGraha(nakshatra,pada);
		case CHANDRA:
			return createChandraGraha(nakshatra,pada);
		case MANGAL:
			return createMangalGraha(nakshatra,pada);
		case BUDHA:
			return createBudhaGraha(nakshatra,pada);
		case GURU:
			return createGuruGraha(nakshatra,pada);
		case SHUKRA:
			return createShukraGraha(nakshatra,pada);
		case SHANI:
			return createShaniGraha(nakshatra,pada);
		case RAHU:
			return createRahuGraha(nakshatra,pada);
		case KETU:
			return createKetuGraha(nakshatra,pada);
		
		default:
			return null;

		}
	}

	public static Graha createSuryaGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Surya surya = new Surya();
		surya.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		surya.setPada(pada);
		return surya;

	}

	public static Graha createChandraGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		
		Chandra chandra = new Chandra();
		chandra.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		chandra.setPada(pada);
		return chandra;

	}
	
	public static Graha createMangalGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Mangal mangal = new Mangal();
		mangal.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		mangal.setPada(pada);
		return mangal;

	}
	
	public static Graha createBudhaGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Budha budha = new Budha();
		budha.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		budha.setPada(pada);
		return budha;

	}
	
	public static Graha createGuruGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Guru guru = new Guru();
		guru.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		guru.setPada(pada);
		return guru;

	}
	
	public static Graha createShukraGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Shukra shukra = new Shukra();
		shukra.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		shukra.setPada(pada);
		return shukra;

	}
	
	public static Graha createShaniGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Shani shani = new Shani();
		shani.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		shani.setPada(pada);
		return shani;

	}
	
	public static Graha createRahuGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Rahu rahu = new Rahu();
		rahu.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		rahu.setPada(pada);
		return rahu;

	}
	
	public static Graha createKetuGraha(Name_Of_Nakshatra nakshatra,Pada pada) {
		Ketu ketu = new Ketu();
		ketu.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		ketu.setPada(pada);
		return ketu;

	}
	
	
	
	

}
