package dattatreya.jyotish.analyze.bhavas.bhava1.lagna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.GrahaInBhava;
import dattatreya.jyotish.bhavas.grahas.surya.SuryaInBhava;
import dattatreya.jyotish.bhavas.grahas.chandra.ChandraInBhava;
import dattatreya.jyotish.bhavas.grahas.mangal.MangalInBhava;
import dattatreya.jyotish.bhavas.grahas.budha.BudhaInBhava;
import dattatreya.jyotish.bhavas.grahas.guru.GuruInBhava;
import dattatreya.jyotish.bhavas.grahas.shukra.ShukraInBhava;
import dattatreya.jyotish.bhavas.grahas.shani.ShaniInBhava;
import dattatreya.jyotish.bhavas.grahas.rahu.RahuInBhava;
import dattatreya.jyotish.bhavas.grahas.ketu.KetuInBhava;

@Component("grahaInBhava1")
@Order(value=1)
public class GrahaInBhava1 implements GrahaInBhava {
	
	@Autowired
	@Qualifier("suryaInBhava1")
	SuryaInBhava suryaInBhava;

	@Autowired
	@Qualifier("chandraInBhava1")
	ChandraInBhava chandraInBhava;

	@Autowired
	@Qualifier("budhaInBhava1")
	BudhaInBhava budhaInBhava;

	@Autowired
	@Qualifier("mangalInBhava1")
	MangalInBhava mangalInBhava;

	@Autowired
	@Qualifier("guruInBhava1")
	GuruInBhava guruInBhava;

	@Autowired
	@Qualifier("shukraInBhava1")
	ShukraInBhava shukraInBhava;

	
	@Autowired
	@Qualifier("shaniInBhava1")
	ShaniInBhava shaniInBhava;


	@Autowired
	@Qualifier("rahuInBhava1")
	RahuInBhava rahuInBhava;
	
	@Autowired
	@Qualifier("ketuInBhava1")
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
