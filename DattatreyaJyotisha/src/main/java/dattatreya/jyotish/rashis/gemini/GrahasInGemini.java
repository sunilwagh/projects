package dattatreya.jyotish.rashis.gemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

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

@Component("grahasInGemini")
@Order(value=3)
public class GrahasInGemini implements GrahaInRashi{
	
	@Autowired
	@Qualifier("suryaInGemini")
	SuryaInRashi suryaInRashi;
	
	@Autowired
	@Qualifier("chandraInGemini")
	ChandraInRashi chandraInRashi;
	
	@Autowired
	@Qualifier("mangalInGemini")
	MangalInRashi mangalInRashi;
	
	@Autowired
	@Qualifier("budhaInGemini")
	BudhaInRashi budhaInRashi;
	
	@Autowired
	@Qualifier("guruInGemini")
	GuruInRashi guruInRashi;
	
	@Autowired
	@Qualifier("shukraInGemini")
	ShukraInRashi shukraInRashi;
	
	@Autowired
	@Qualifier("shaniInGemini")
	ShaniInRashi shaniInRashi;
	
	@Autowired
	@Qualifier("rahuInGemini")
	RahuInRashi rahuInRashi;
	
	@Autowired
	@Qualifier("ketuInGemini")
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
