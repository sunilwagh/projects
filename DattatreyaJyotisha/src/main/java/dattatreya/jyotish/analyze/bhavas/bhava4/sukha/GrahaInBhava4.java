package dattatreya.jyotish.analyze.bhavas.bhava4.sukha;

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

@Component("grahaInBhava4")
@Order(value=4)
public class GrahaInBhava4 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava4")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava4")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava4")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava4")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava4")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava4")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava4")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava4")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava4")
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
