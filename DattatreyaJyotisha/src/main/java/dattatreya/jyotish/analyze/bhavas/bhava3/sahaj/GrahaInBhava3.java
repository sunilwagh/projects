package dattatreya.jyotish.analyze.bhavas.bhava3.sahaj;

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

@Component("grahaInBhava3")
@Order(value=3)
public class GrahaInBhava3 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava3")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava3")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava3")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava3")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava3")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava3")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava3")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava3")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava3")
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
