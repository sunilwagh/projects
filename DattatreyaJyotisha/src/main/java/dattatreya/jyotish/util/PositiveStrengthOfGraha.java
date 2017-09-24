package dattatreya.jyotish.util;

public enum PositiveStrengthOfGraha {

	EXALTATION("100%"), MOOLTRIKONA("75%"), OWN_SIGN("50%"), GREAT_FRIENDS("37.5%"), FRIENDS("25%"), NUETRAL(
			"12.5%"), ENEMY("6.25%"), GREAT_ENEMY("3.25%"), DEBILITATION("0%");

	private final String str;

	private PositiveStrengthOfGraha(String str) {
		this.str = str;
	}

	public String getPositiveStrenghtOfGraha() {
		return str;
	}
}