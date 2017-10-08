package dattatreya.jyotish.analyze.bhavas.bhava5.putra;

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

@Component("grahaInBhava5")
@Order(value=5)
public class GrahaInBhava5 implements GrahaInBhava{
	
	@Autowired
	@Qualifier("suryaInBhava5")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava5")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava5")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava5")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava5")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava5")
	ShukraInBhava shukraInBhava;

	@Autowired
	@Qualifier("shaniInBhava5")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava5")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava5")
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
