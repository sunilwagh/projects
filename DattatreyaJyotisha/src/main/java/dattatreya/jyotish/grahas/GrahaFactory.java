package dattatreya.jyotish.grahas;

import dattatreya.jyotish.util.NakshatraNames;
import dattatreya.jyotish.panchang.nakshatras.NakshatraFactory;
import dattatreya.jyotish.panchang.nakshatras.padas.Pada;
import dattatreya.jyotish.util.GrahaNames;




public final class GrahaFactory {

	// use getShape method to get object of type shape
	public static Graha getGraha(GrahaNames graha,NakshatraNames nakshatra,Pada pada,double degrees) {

		
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

	public static Graha createSuryaGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Surya surya = new Surya();
		
		return surya;

	}

	public static Graha createChandraGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		
		Chandra chandra = new Chandra();
		
		return chandra;

	}
	
	public static Graha createMangalGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Mangal mangal = new Mangal();
		
		return mangal;

	}
	
	public static Graha createBudhaGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Budha budha = new Budha();
		
		return budha;

	}
	
	public static Graha createGuruGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Guru guru = new Guru();
		
		return guru;

	}
	
	public static Graha createShukraGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Shukra shukra = new Shukra();
		
		return shukra;

	}
	
	public static Graha createShaniGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Shani shani = new Shani();
		
		return shani;

	}
	
	public static Graha createRahuGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Rahu rahu = new Rahu();
		return rahu;

	}
	
	public static Graha createKetuGraha(NakshatraNames nakshatra,Pada pada,double degrees) {
		Ketu ketu = new Ketu();
		return ketu;

	}
	
	
	
	

}
