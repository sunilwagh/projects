package dattatreya.jyotish.grahas;

import dattatreya.jyotish.nakshatras.NakshatraFactory;
import dattatreya.jyotish.nakshatras.padas.Pada;
import dattatreya.jyotish.util.JyotishEnumUtil;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Graha;
import dattatreya.jyotish.util.NakshatraEnumUtil.NAME_OF_NAKSHTRA;




public final class GrahaFactory {

	// use getShape method to get object of type shape
	public static Graha getGraha(Name_Of_Graha graha,NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {

		
		switch (graha) {
		case SURYA:
			return createSuryaGraha(nakshatra,pada,degrees);
		case CHANDRA:
			return createChandraGraha(nakshatra,pada,degrees);
		case MANGAL:
			return createMangalGraha(nakshatra,pada,degrees);
		case BUDHA:
			return createBudhaGraha(nakshatra,pada,degrees);
		case GURU:
			return createGuruGraha(nakshatra,pada,degrees);
		case SHUKRA:
			return createShukraGraha(nakshatra,pada,degrees);
		case SHANI:
			return createShaniGraha(nakshatra,pada,degrees);
		case RAHU:
			return createRahuGraha(nakshatra,pada,degrees);
		case KETU:
			return createKetuGraha(nakshatra,pada,degrees);
		
		default:
			return null;

		}
	}

	public static Graha createSuryaGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Surya surya = new Surya();
		surya.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		surya.setPada(pada);
		return surya;

	}

	public static Graha createChandraGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		
		Chandra chandra = new Chandra();
		chandra.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		chandra.setPada(pada);
		return chandra;

	}
	
	public static Graha createMangalGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Mangal mangal = new Mangal();
		mangal.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		mangal.setPada(pada);
		return mangal;

	}
	
	public static Graha createBudhaGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Budha budha = new Budha();
		budha.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		budha.setPada(pada);
		return budha;

	}
	
	public static Graha createGuruGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Guru guru = new Guru();
		guru.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		guru.setPada(pada);
		return guru;

	}
	
	public static Graha createShukraGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Shukra shukra = new Shukra();
		shukra.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		shukra.setPada(pada);
		return shukra;

	}
	
	public static Graha createShaniGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Shani shani = new Shani();
		//shani.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		//shani.setPada(pada);
		return shani;

	}
	
	public static Graha createRahuGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Rahu rahu = new Rahu();
		rahu.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		rahu.setPada(pada);
		return rahu;

	}
	
	public static Graha createKetuGraha(NAME_OF_NAKSHTRA nakshatra,Pada pada,double degrees) {
		Ketu ketu = new Ketu();
		ketu.setNakshatra(NakshatraFactory.getNakshatra(nakshatra));
		ketu.setPada(pada);
		return ketu;

	}
	
	
	
	

}