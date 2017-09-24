package dattatreya.jyotish.nakshatras;

import dattatreya.jyotish.grahas.Ketu;
import dattatreya.jyotish.util.NakshatraNames;


public final class NakshatraFactory {

	// use getShape method to get object of type shape
	public static Nakshatra getNakshatra(NakshatraNames nakshatra) {

		int nakshatraNumber = nakshatra.getNumber();
		switch (nakshatraNumber) {
		case 1:
			return createAshwiniNakshatra();
		case 2:
			return createBharaniNakshatra();
		case 3:
			return createKrittikaNakshatra();
		case 4:
			return createRohiniNakshatra();
		case 5:
			return createMrighashirshaNakshatra();
		case 6:
			return createArudraNakshatra();
		case 7:
			return createPunarvasuNakshatra();
		case 8:
			return createPushyaNakshatra();
		case 9:
			return createAshleshaNakshatra();
		case 10:
			return createMaghaNakshatra();
		case 11:
			return createPurvaPhalguniNakshatra();
		case 12:
			return createUttarPhalguniNakshatra();
		case 13:
			return createHastaNakshatra();
		case 14:
			return createChitraNakshatra();
		case 15:
			return createSwatiNakshatra();
		case 16:
			return createVishakaNakshatra();
		case 17:
			return createAnuradhaNakshatra();
		case 18:
			return createJyesthaNakshatra();
		case 19:
			return createChitraNakshatra();
		case 20:
			return createPurvaAshadaNakshatra();
		case 21:
			return createUttarAshadaNakshatra();
		case 22:
			return createShravanaNakshatra();
		case 23:
			return createDhanishtaNakshatra();
		case 24:
			return createSatabhijaNakshatra();
		case 25:
			return createPurvaBhadrapadaNakshatra();
		case 26:
			return createUttarBhadrapadaNakshatra();
		case 27:
			return createRevatiNakshatra();
		default:
			return null;

		}
	}

	public static Nakshatra createAshwiniNakshatra() {
		Ashwini ashwini = new Ashwini();
		return ashwini;

	}

	public static Nakshatra createBharaniNakshatra() {
		Bharani bharani = new Bharani();
		return bharani;

	}

	public static Nakshatra createKrittikaNakshatra() {
		Krittika krittika = new Krittika();
		return krittika;

	}

	public static Nakshatra createRohiniNakshatra() {
		Rohini rohini = new Rohini();
		return rohini;

	}

	public static Nakshatra createMrighashirshaNakshatra() {
		Mrighashirsha mrighashirsha = new Mrighashirsha();
		return mrighashirsha;

	}

	public static Nakshatra createArudraNakshatra() {
		Arudra arudra = new Arudra();
		return arudra;

	}

	public static Nakshatra createPunarvasuNakshatra() {
		Punarvasu punarvasu = new Punarvasu();
		return punarvasu;

	}

	public static Nakshatra createPushyaNakshatra() {
		Pushya pushya = new Pushya();
		return pushya;

	}

	public static Nakshatra createAshleshaNakshatra() {
		Ashlesha ashlesha = new Ashlesha();
		return ashlesha;

	}

	public static Nakshatra createMaghaNakshatra() {
		Magha magha = new Magha();
		return magha;

	}
	
	public static Nakshatra createPurvaPhalguniNakshatra() {
		PurvaPhalguni purvaPhalguni= new PurvaPhalguni();
		return purvaPhalguni;

	}
	
	public static Nakshatra createUttarPhalguniNakshatra() {
		UttarPhalguni uttarphalguni = new UttarPhalguni();
		return uttarphalguni;

	}
	
	
	public static Nakshatra createHastaNakshatra() {
		Hasta hasta = new Hasta();
		return hasta;

	}
	
	public static Nakshatra createChitraNakshatra() {
		Chitra chitra = new Chitra();
		return chitra;

	}
	
	public static Nakshatra createSwatiNakshatra() {
		Swati swati = new Swati();
		return swati;

	}
	
	public static Nakshatra createVishakaNakshatra() {
		Vishaka vishaka = new Vishaka();
		return vishaka;

	}
	
	public static Nakshatra createAnuradhaNakshatra() {
		Anuradha anuradha = new Anuradha();
		return anuradha;

	}
	
	public static Nakshatra createJyesthaNakshatra() {
		Jyestha jyestha = new Jyestha();
		return jyestha;

	}
	
	public static Nakshatra createMulaNakshatra() {
		Mula mula = new Mula();
		return mula;

	}
	
	public static Nakshatra createPurvaAshadaNakshatra() {
		PurvaAshada purvaAshada = new PurvaAshada();
		return purvaAshada;

	}
	
	public static Nakshatra createUttarAshadaNakshatra() {
		UttarAshada jyestha = new UttarAshada();
		return jyestha;

	}
	
	public static Nakshatra createShravanaNakshatra() {
		Shravana shravana = new Shravana();
		return shravana;

	}
	
	public static Nakshatra createDhanishtaNakshatra() {
		Dhanishta dhanishta = new Dhanishta();
		return dhanishta;

	}
	
	public static Nakshatra createSatabhijaNakshatra() {
		Satabhija satabhija = new Satabhija();
		return satabhija;

	}
	
	public static Nakshatra createPurvaBhadrapadaNakshatra() {
		PurvaBhadrapada purvaBhadrapada = new PurvaBhadrapada();
		return purvaBhadrapada;

	}
	
	public static Nakshatra createUttarBhadrapadaNakshatra() {
		UttarBhadrapada uttarBhadrapada = new UttarBhadrapada();
		return uttarBhadrapada;

	}
	
	public static Nakshatra createRevatiNakshatra() {
		Revati revati = new Revati();
		return revati;

	}
	
	

}
