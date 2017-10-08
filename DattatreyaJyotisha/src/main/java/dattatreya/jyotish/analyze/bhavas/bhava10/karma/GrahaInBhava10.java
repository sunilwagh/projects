package dattatreya.jyotish.analyze.bhavas.bhava10.karma;

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

@Component("grahaInBhava10")
@Order(value=10)
public class GrahaInBhava10 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava10")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava10")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava10")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava10")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava10")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava10")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava10")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava10")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava10")
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
