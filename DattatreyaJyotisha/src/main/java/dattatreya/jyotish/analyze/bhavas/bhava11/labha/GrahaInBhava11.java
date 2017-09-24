package dattatreya.jyotish.analyze.bhavas.bhava11.labha;

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

@Component("grahaInBhava11")
public class GrahaInBhava11 implements GrahaInBhava {

	@Autowired
	@Qualifier("suryaInBhava11")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava11")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava11")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava11")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava11")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava11")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava11")
	ShaniInBhava shaniInBhava;

	@Autowired
	@Qualifier("rahuInBhava11")
	RahuInBhava rahuInBhava;

	@Autowired
	@Qualifier("ketuInBhava11")
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
