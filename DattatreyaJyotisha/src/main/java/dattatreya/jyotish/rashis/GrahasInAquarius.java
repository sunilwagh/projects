package dattatreya.jyotish.rashis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dattatreya.jyotish.analyze.bhavas.GrahaInRashi;

public class GrahasInAquarius implements GrahaInRashi{
	
	@Autowired
	@Qualifier("suryaInAquarius")
	dattatreya.jyotish.rashis.grahas.surya.SuryaInRashi suryaInRashi;

	public String SuryaInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String ChandraInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String BudhaInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String MangalInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String GuruInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String ShukraInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String ShaniInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String RahuInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

	public String KetuInRashi() {
		// TODO Auto-generated method stub
		return null;
	}

}
