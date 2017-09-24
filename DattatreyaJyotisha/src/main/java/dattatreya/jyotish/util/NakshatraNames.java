package dattatreya.jyotish.util;

public enum NakshatraNames {
	ASHWINI(1), BHARANI(2), KRITTIKA(3), ROHINI(4), MRIGASHIRSHA(5), ARUDRA(6), PUNARVASU(7), PUSHYA(8), ASHLESHA(
			9), MAGHA(10), PURVA_PHALGUNI(11), UTTAR_PHALGUNI(12), HASTA(13), CHITRA(14), SWATI(
					15), VISHAKA(16), ANURADHA(17), JYESTHA(18), MULA(19), PURVA_ASHADA(20), UTTAR_ASHADA(
							21), SHRAVANA(22), DHANISHTA(
									23), SATABHISHA(24), PURVA_BHADRAPADA(25), UTTAR_BHADRAPADA(26), REVATI(27);

	private final int i;

	private NakshatraNames(int i) {
		this.i = i;
	}

	public int getNumber() {
		return i;
	}
}