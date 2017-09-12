package util;

public class JyotishEnumUtil {

	public enum Name_Of_Nakshatra {
		ASHWINI(1), BHARANI(2), KRITTIKA(3), ROHINI(4), MRIGASHIRSHA(5), ARUDRA(6), PUNARVASU(7), PUSHYA(8), ASHLESHA(
				9), MAGHA(10), PURVA_PHALGUNI(11), UTTAR_PHALGUNI(12), HASTA(13), CHITRA(14), SWATI(
						15), VISHAKA(16), ANURADHA(17), JYESTHA(18), MULA(19), PURVA_ASHADA(20), UTTAR_ASHADA(
								21), SHRAVANA(22), DHANISHTA(
										23), SATABHISHA(24), PURVA_BHADRAPADA(25), UTTAR_BHADRAPADA(26), REVATI(27);

		private final int i;

		private Name_Of_Nakshatra(int i) {
			this.i = i;
		}

		public int getNumber() {
			return i;
		}
	}

	public enum Name_Of_Graha {
		LAGNA,SURYA,CHANDRA,MANGAL,BUDHA,GURU,SHUKRA,SHANI,RAHU,KETU
	}

	public enum Nakshatra_Type {
		KSHIPRA, UGRA, MISHRA, STHIRA, MRUDU, TIKSHNA, CHARA
	}

	public enum Gana {
		DEVA, MANUSHYA, RAKSHASA
	}

	public enum Tattva {
		APA, AGNI, VAYU, PRITHVI
	}

	public enum Diety {
		ASHWINI_KUMARS, YAMA, AGNI, BRAHMA, SOMA, SHIVA, ADITI, BRIHASPATI, NAGA, PIIRI, PUSHAA, BHAGA, SURYA, TWASTA, VAYU, INDRAGNI, MITRADEVA, INDRA, AAP, VISHWADEVA, VISHNU, ASTA_VASU, AJANMAA, AHIR_BUDHNYA, PUSHA
	}

	public enum Name_Of_Rashi {
		ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, LIBRA, SCORPIO, SAGITTAURIUS, CAPRICORN, ACQUARIUS, PISCES
	}

	public enum Name_Of_Bhava {
		BHAVA1, BHAVA2, BHAVA3, BHAVA4, BHAVA5, BHAVA6, BHAVA7, BHAVA8, BHAVA9, BHAVA10, BHAVA11, BHAVA12
	}

	public enum Mobility_Of_Rashi {

		CHARA, STHIRA, DWISVABHAVA
	}

	public enum Gender_Of_Rashi {

		MALE, FEMALE
	}

	public enum Direction {

		EAST, SOUTH, WEST, NORTH
	}

	public enum Caste {

		BRAHAMANA, KSHATRIYA, VAISHYA, SHUDRA
	}
	
	public enum Guna{
	SATTVIC,RAJASIC,TAMASIC
	}
	
	public enum Positive_Strength_Of_Graha{
	
     EXALTATION("100%"),MOOLTRIKONA("75%"),OWN_SIGN("50%"),GREAT_FRIENDS("37.5%"),FRIENDS("25%"),NUETRAL("12.5%"),ENEMY("6.25%"),GREAT_ENEMY("3.25%"),DEBILITATION("0%");
     
     private final String str;

		private Positive_Strength_Of_Graha(String str) {
			this.str = str;
		}

		public String getPositiveStrenghtOfGraha() {
			return str;
		}
	}
	
	

}
