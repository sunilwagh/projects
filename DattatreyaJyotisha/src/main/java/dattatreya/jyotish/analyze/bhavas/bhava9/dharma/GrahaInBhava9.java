package dattatreya.jyotish.analyze.bhavas.bhava9.dharma;

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

@Component("grahaInBhava9")
@Order(value=9)
public class GrahaInBhava9 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava9")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava9")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava9")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava9")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava9")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava9")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava9")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava9")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava9")
	KetuInBhava ketuInBhava;

	public String suryaInBhava() {
		return suryaInBhava.getInfoAboutSuryaInBhava();
	}

	public String chandraInBhava() {
		return chandraInBhava.getInfoAboutChandraInBhava();
	}

	public String budhaInBhava() {
		return budhaInBhava.getInfoAboutBudhaInBhava();
	}

	public String mangalInBhava() {
		return mangalInBhava.getInfoAboutMangalInBhava();
	}

	public String guruInBhava() {
		return guruInBhava.getInfoAboutGuruInBhava();

	}

	public String shukraInBhava() {
		return shukraInBhava.getInfoAboutShukraInBhava();
	}

	public String shaniInBhava() {
		return shaniInBhava.getInfoAboutShaniInBhava();
	}

	public String rahuInBhava() {
		return rahuInBhava.getInfoAboutRahuInBhava();
	}

	public String ketuInBhava() {
		return ketuInBhava.getInfoAboutKetuInBhava();
	}


}
