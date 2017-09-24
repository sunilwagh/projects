package dattatreya.jyotish.analyze.bhavas.bhava12.vyaha;

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

@Component("grahaInBhava12")
@Order(value=12)
public class GrahaInBhava12 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava12")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava12")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava12")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava12")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava12")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava12")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava12")
	ShaniInBhava shaniInBhava;

	@Autowired
	@Qualifier("rahuInBhava12")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava12")
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
