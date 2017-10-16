package dattatreya.jyotish.util;

public enum Baladi_Avastas {
	
	Bala("One Fourth"),Kumara("Half"),Yuva("Full"),Vriddh("Negligible"),Mrit("Nil");
	
	private final String str;

	private Baladi_Avastas(String str) {
		this.str = str;
	}

	public String getBaladi_Avastas() {
		return str;
	}

}
