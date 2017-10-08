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
	
	

	public String AriesInBhava() {
		return ariesAscendant.getInfoOnLagnaRashi();
	}

	public String TaurusInBhava() {
		return taurusAscendant.getInfoOnLagnaRashi();
	}

	public String GeminiInBhava() {
		return geminiAscendant.getInfoOnLagnaRashi();
	}

	public String CancerInBhava() {
		return cancerAscendant.getInfoOnLagnaRashi();
	}

	public String LeoInBhava() {
		return leoAscendant.getInfoOnLagnaRashi();
	}

	public String VirgoInBhava() {
		return virgoAscendant.getInfoOnLagnaRashi();
	}

	public String LibraInBhava() {
		return libraAscendant.getInfoOnLagnaRashi();
	}

	public String ScorpioInBhava() {
		return scorpioAscendant.getInfoOnLagnaRashi();
	}

	public String SagittariusInBhava() {
		return sagittariusAscendant.getInfoOnLagnaRashi();
	}

	public String CapricornInBhava() {
		return capricornAscendant.getInfoOnLagnaRashi();
	}

	public String AcquariusInBhava() {
		return aquariusAscendant.getInfoOnLagnaRashi();
	}

	public String PiscesInBhava() {
		return piscesAscendant.getInfoOnLagnaRashi();
	}

}
