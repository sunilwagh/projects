package dattatreya.jyotish.rashis.leo;

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

@Component("grahasInLeo")
@Order(value=5)
public class GrahasInLeo implements GrahaInRashi{
	
	@Autowired
	@Qualifier("suryaInLeo")
	SuryaInRashi suryaInRashi;
	
	@Autowired
	@Qualifier("chandraInLeo")
	ChandraInRashi chandraInRashi;
	
	@Autowired
	@Qualifier("mangalInLeo")
	MangalInRashi mangalInRashi;
	
	@Autowired
	@Qualifier("budhaInLeo")
	BudhaInRashi budhaInRashi;
	
	@Autowired
	@Qualifier("guruInLeo")
	GuruInRashi guruInRashi;
	
	@Autowired
	@Qualifier("shukraInLeo")
	ShukraInRashi shukraInRashi;
	
	@Autowired
	@Qualifier("shaniInLeo")
	ShaniInRashi shaniInRashi;
	
	@Autowired
	@Qualifier("rahuInLeo")
	RahuInRashi rahuInRashi;
	
	@Autowired
	@Qualifier("ketuInLeo")
    KetuInRashi ketuInRashi;
	

	public String suryaInRashi() {
		
		return suryaInRashi.infoAboutSuryaInRashi();
	}

	public String chandraInRashi() {
		return chandraInRashi.infoAboutChandraInRashi();
	}

	public String budhaInRashi() {
		return budhaInRashi.infoAboutBudhaInRashi();
	}

	public String mangalInRashi() {
		return mangalInRashi.infoAboutMangalInRashi();
	}

	public String guruInRashi() {
		return guruInRashi.infoAboutGuruInRashi();
	}

	public String shukraInRashi() {
		return shukraInRashi.infoAboutShukraInRashi();
	}

	public String shaniInRashi() {
		return shaniInRashi.infoAboutShaniInRashi();
	}

	public String rahuInRashi() {
		return rahuInRashi.infoAboutRahuInRashi();
	}

	public String ketuInRashi() {
		return ketuInRashi.infoAboutKetuInRashi();
	}

}
