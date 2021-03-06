package dattatreya.jyotish.util;

public class JyotishEnumUtil {

	public enum Name_Of_Graha {
		LAGNA, SURYA, CHANDRA, MANGAL, BUDHA, GURU, SHUKRA, SHANI, RAHU, KETU
	}

	public enum Tattva {
		APA, AGNI, VAYU, PRITHVI, AKASH
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

	public enum Gender_Of_Graha {

		MALE, FEMALE, BOTH
	}

	public enum EVEN_ODD {

		EVEN, ODD
	}

	public enum Direction {

		EAST, SOUTH, WEST, NORTH
	}

	public enum Caste {

		BRAHAMANA, KSHATRIYA, VAISHYA, SHUDRA
	}

	public enum Guna {
		SATTVIC, RAJASIC, TAMASIC
	}

	public enum GOALS {
		DHARMA, ARTHA, KAMA, MOKSHA
	}

	public enum TREES {
		PTEROCARPUS_SANTALINUS, ALSTONIA_SCOLARIS, WRIGHTIA_TINCTORIA, BUTIA_MONOSPERMA, ZIZIPHUS_MAURITIANA, MANGIFERA_INDICA, MIMUSOPS_ELENGI, ACACIA_CATECHU, FICUS_RELIGIOSA, DALBERGIA_SISSOO, PROSOPIS_CINERARIA, FICUS_BENGALENSIS
	}

	public enum Positive_Strength_Of_Graha {

		EXALTATION("100%"), MOOLTRIKONA("75%"), OWN_SIGN("50%"), GREAT_FRIENDS("37.5%"), FRIENDS("25%"), NUETRAL(
				"12.5%"), ENEMY("6.25%"), GREAT_ENEMY("3.25%"), DEBILITATION("0%");

		private final String str;

		private Positive_Strength_Of_Graha(String str) {
			this.str = str;
		}

		public String getPositiveStrenghtOfGraha() {
			return str;
		}
	}

}
