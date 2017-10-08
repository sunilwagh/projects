package dattatreya.jyotish.analyze.bhavas.bhava1.lagna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.RashiInBhava;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.AquariusAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.AriesAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.CancerAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.CapricornAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.GeminiAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.LeoAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.LibraAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.PiscesAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.SagittariusAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.ScorpioAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.TaurusAscendant;
import dattatreya.jyotish.analyze.bhavas.bhava1.lagna.ascendant.VirgoAscendant;

@Component("rashiInBhava1")
public class RashiInBhava1 implements RashiInBhava {

	@Autowired
	AriesAscendant ariesAscendant;

	@Autowired
	TaurusAscendant taurusAscendant;

	@Autowired
	GeminiAscendant geminiAscendant;

	@Autowired
	CancerAscendant cancerAscendant;

	@Autowired
	LeoAscendant leoAscendant;

	@Autowired
	VirgoAscendant virgoAscendant;

	@Autowired
	LibraAscendant libraAscendant;

	@Autowired
    ScorpioAscendant scorpioAscendant;

	@Autowired
	SagittariusAscendant sagittariusAscendant;
	
	@Autowired
	CapricornAscendant capricornAscendant;
	
	@Autowired
	AquariusAscendant aquariusAscendant;
	
	@Autowired
	PiscesAscendant piscesAscendant;
	
	

	public String ariesInBhava() {
		return ariesAscendant.getInfoOnLagnaRashi();
	}

	public String taurusInBhava() {
		return taurusAscendant.getInfoOnLagnaRashi();
	}

	public String geminiInBhava() {
		return geminiAscendant.getInfoOnLagnaRashi();
	}

	public String cancerInBhava() {
		return cancerAscendant.getInfoOnLagnaRashi();
	}

	public String leoInBhava() {
		return leoAscendant.getInfoOnLagnaRashi();
	}

	public String virgoInBhava() {
		return virgoAscendant.getInfoOnLagnaRashi();
	}

	public String libraInBhava() {
		return libraAscendant.getInfoOnLagnaRashi();
	}

	public String scorpioInBhava() {
		return scorpioAscendant.getInfoOnLagnaRashi();
	}

	public String sagittariusInBhava() {
		return sagittariusAscendant.getInfoOnLagnaRashi();
	}

	public String capricornInBhava() {
		return capricornAscendant.getInfoOnLagnaRashi();
	}

	public String aquariusInBhava() {
		return aquariusAscendant.getInfoOnLagnaRashi();
	}

	public String piscesInBhava() {
		return piscesAscendant.getInfoOnLagnaRashi();
	}

}
