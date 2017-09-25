package dattatreya.jyotish.rashis.capricorn;

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

@Component("grahasInCapricorn")
@Order(value=10)
public class GrahasInCapricorn implements GrahaInRashi{
	
	@Autowired
	@Qualifier("suryaInCapricorn")
	SuryaInRashi suryaInRashi;
	
	@Autowired
	@Qualifier("chandraInCapricorn")
	ChandraInRashi chandraInRashi;
	
	@Autowired
	@Qualifier("mangalInCapricorn")
	MangalInRashi mangalInRashi;
	
	@Autowired
	@Qualifier("budhaInCapricorn")
	BudhaInRashi budhaInRashi;
	
	@Autowired
	@Qualifier("guruInCapricorn")
	GuruInRashi guruInRashi;
	
	@Autowired
	@Qualifier("shukraInCapricorn")
	ShukraInRashi shukraInRashi;
	
	@Autowired
	@Qualifier("shaniInCapricorn")
	ShaniInRashi shaniInRashi;
	
	@Autowired
	@Qualifier("rahuInCapricorn")
	RahuInRashi rahuInRashi;
	
	@Autowired
	@Qualifier("ketuInCapricorn")
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
