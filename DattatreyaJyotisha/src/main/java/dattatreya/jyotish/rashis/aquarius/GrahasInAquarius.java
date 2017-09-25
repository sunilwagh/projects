package dattatreya.jyotish.rashis.aquarius;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import dattatreya.jyotish.analyze.bhavas.GrahaInRashi;
import dattatreya.jyotish.rashis.grahas.surya.SuryaInRashi;
import dattatreya.jyotish.rashis.grahas.chandra.ChandraInRashi;
import dattatreya.jyotish.rashis.grahas.mangal.MangalInRashi;
import dattatreya.jyotish.rashis.grahas.budha.BudhaInRashi;
import dattatreya.jyotish.rashis.grahas.guru.GuruInRashi;
import dattatreya.jyotish.rashis.grahas.shukra.ShukraInRashi;
import dattatreya.jyotish.rashis.grahas.shani.ShaniInRashi;
import dattatreya.jyotish.rashis.grahas.rahu.RahuInRashi;
import dattatreya.jyotish.rashis.grahas.ketu.KetuInRashi;

public class GrahasInAquarius implements GrahaInRashi{
	
	@Autowired
	@Qualifier("suryaInAquarius")
	SuryaInRashi suryaInRashi;
	
	@Autowired
	@Qualifier("chandraInAquarius")
	ChandraInRashi chandraInRashi;
	
	@Autowired
	@Qualifier("mangalInAquarius")
	MangalInRashi mangalInRashi;
	
	@Autowired
	@Qualifier("budhaInAquarius")
	BudhaInRashi budhaInRashi;
	
	@Autowired
	@Qualifier("guruInAquarius")
	GuruInRashi guruInRashi;
	
	@Autowired
	@Qualifier("shukraInAquarius")
	ShukraInRashi shukraInRashi;
	
	@Autowired
	@Qualifier("shaniInAquarius")
	ShaniInRashi shaniInRashi;
	
	@Autowired
	@Qualifier("rahuInAquarius")
	RahuInRashi rahuInRashi;
	
	@Autowired
	@Qualifier("ketuInAquarius")
    KetuInRashi ketuInRashi;
	

	public String SuryaInRashi() {
		
		return suryaInRashi.infoAboutSuryaInRashi();
	}

	public String ChandraInRashi() {
		return chandraInRashi.infoAboutChandraInRashi();
	}

	public String BudhaInRashi() {
		return budhaInRashi.infoAboutBudhaInRashi();
	}

	public String MangalInRashi() {
		return mangalInRashi.infoAboutMangalInRashi();
	}

	public String GuruInRashi() {
		return guruInRashi.infoAboutGuruInRashi();
	}

	public String ShukraInRashi() {
		return shukraInRashi.infoAboutShukraInRashi();
	}

	public String ShaniInRashi() {
		return shaniInRashi.infoAboutShaniInRashi();
	}

	public String RahuInRashi() {
		return rahuInRashi.infoAboutRahuInRashi();
	}

	public String KetuInRashi() {
		return ketuInRashi.infoAboutKetuInRashi();
	}

}
