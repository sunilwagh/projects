package dattatreya.jyotish.analyze.bhavas.bhava7.yuvati;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

@Component("grahaInBhava7")
public class GrahaInBhava7 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava7")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava7")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava7")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava7")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava7")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava7")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava7")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava7")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava7")
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
