package dattatreya.jyotish.analyze.bhavas.bhava6.ari;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.bhavas.grahas.budha.BudhaInBhava;
import dattatreya.jyotish.bhavas.grahas.chandra.ChandraInBhava;
import dattatreya.jyotish.bhavas.grahas.guru.GuruInBhava;
import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;
import dattatreya.jyotish.bhavas.grahas.mangal.MangalInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;
import dattatreya.jyotish.bhavas.grahas.shani.ShaniInBhava;
import dattatreya.jyotish.bhavas.grahas.shukra.ShukraInBhava;
import dattatreya.jyotish.bhavas.grahas.surya.SuryaInBhava;

@Component("grahaInBhava6")
@Order(value=6)
public class GrahaInBhava6 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava6")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava6")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava6")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava6")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava6")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava6")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava6")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava6")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava6")
	KetuInBhava ketuInBhava;

	public String SuryaInBhava() {
		return suryaInBhava.getInfoAboutSuryaInBhava();
	}

	public String ChandraInBhava() {
		return chandraInBhava.getInfoAboutChandraInBhava();
	}

	public String BudhaInBhava() {
		return budhaInBhava.getInfoAboutBudhaInBhava();
	}

	public String MangalInBhava() {
		return mangalInBhava.getInfoAboutMangalInBhava();
	}

	public String GuruInBhava() {
		return guruInBhava.getInfoAboutGuruInBhava();

	}

	public String ShukraInBhava() {
		return shukraInBhava.getInfoAboutShukraInBhava();
	}

	public String ShaniInBhava() {
		return shaniInBhava.getInfoAboutShaniInBhava();
	}

	public String RahuInBhava() {
		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String KetuInBhava() {
		return ketuInBhava.getInfoAboutKetuInBhava();
	}


	

	

	

}
