package dattatreya.jyotish.analyze.bhavas.bhava1.lagna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

	public String SuryaInBhava() {
		StringBuilder suryaInBhava1 = new StringBuilder();
		suryaInBhava1.append("\n");
		return suryaInBhava1.toString();
	}

	public String ChandraInBhava() {
		StringBuilder chandraInBhava3 = new StringBuilder();
		chandraInBhava3.append("\n");
		return chandraInBhava3.toString();
	}

	public String BudhaInBhava() {
		StringBuilder budhInBhava3 = new StringBuilder();
		budhInBhava3.append("\n");
		return budhInBhava3.toString();
	}

	public String MangalInBhava() {
		StringBuilder mangalInBhava3 = new StringBuilder();
		mangalInBhava3.append("\n");
		return mangalInBhava3.toString();
	}

	public String GuruInBhava() {
		return guruInBhava.getInfoAboutGuruInBhava();

	}

	public String ShukraInBhava() {
		StringBuilder shukraInBhava3 = new StringBuilder();
		shukraInBhava3.append("\n");
		return shukraInBhava3.toString();
	}

	public String ShaniInBhava() {
		StringBuilder shaniInBhava3 = new StringBuilder();
		shaniInBhava3.append("\n");
		return shaniInBhava3.toString();
	}

	public String RahuInBhava() {
		StringBuilder rahuInBhava3 = new StringBuilder();
		rahuInBhava3.append("\n");
		return rahuInBhava3.toString();
	}

	public String KetuInBhava() {
		StringBuilder ketuInBhava3 = new StringBuilder();
		ketuInBhava3.append("\n");
		return ketuInBhava3.toString();
	}

}
