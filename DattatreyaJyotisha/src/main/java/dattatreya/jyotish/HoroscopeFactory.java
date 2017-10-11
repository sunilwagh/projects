package dattatreya.jyotish;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.chart.processors.D10DasamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D12DvadasamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D16SodasamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D1RashiChartProcessor;
import dattatreya.jyotish.chart.processors.D20VimsamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D24SiddhamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D27BhamsaNaksatramsaChartProcessor;
import dattatreya.jyotish.chart.processors.D2HoraChartProcessor;
import dattatreya.jyotish.chart.processors.D30TrimsamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D3DrekannaChartProcessor;
import dattatreya.jyotish.chart.processors.D40KhavedamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D45AksavedamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D4ChaturthamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D60SastamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D7SaptamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D9NavamsaChartProcessor;
import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.ChartNames;
import dattatreya.jyotish.util.RashiNames;

public class HoroscopeFactory {
	
	
	public static Chart createHoroscope(ChartNames chartName, RashiNames lagna, Map<Graha, RashiNames> rashiChartMap) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		ChartProcessor chartProcessor;
		chartProcessor = getChartProcessor(chartName, context);

		Rashi ariesRashi = (Rashi) context.getBean("ariesRashi");
		Rashi taurusRashi = (Rashi) context.getBean("taurusRashi");
		Rashi geminiRashi = (Rashi) context.getBean("geminiRashi");
		Rashi cancerRashi = (Rashi) context.getBean("cancerRashi");
		Rashi leoRashi = (Rashi) context.getBean("leoRashi");
		Rashi virgoRashi = (Rashi) context.getBean("virgoRashi");
		Rashi libraRashi = (Rashi) context.getBean("libraRashi");
		Rashi scorpioRashi = (Rashi) context.getBean("scorpioRashi");
		Rashi sagittariusRashi = (Rashi) context.getBean("sagittariusRashi");
		Rashi capricornRashi = (Rashi) context.getBean("capricornRashi");
		Rashi acquariusRashi = (Rashi) context.getBean("acquariusRashi");
		Rashi piscesRashi = (Rashi) context.getBean("piscesRashi");
		ArrayList<Graha> ariesGrahas = new ArrayList<Graha>();
		ArrayList<Graha> taurusGrahas = new ArrayList<Graha>();
		ArrayList<Graha> geminiGrahas = new ArrayList<Graha>();
		ArrayList<Graha> cancerGrahas = new ArrayList<Graha>();
		ArrayList<Graha> leoGrahas = new ArrayList<Graha>();
		ArrayList<Graha> virgoGrahas = new ArrayList<Graha>();
		ArrayList<Graha> libraGrahas = new ArrayList<Graha>();
		ArrayList<Graha> scorpioGrahas = new ArrayList<Graha>();
		ArrayList<Graha> sagittariusGrahas = new ArrayList<Graha>();
		ArrayList<Graha> capricornGrahas = new ArrayList<Graha>();
		ArrayList<Graha> acquariusGrahas = new ArrayList<Graha>();
		ArrayList<Graha> piscesGrahas = new ArrayList<Graha>();

		Graha key = null;

		Iterator it = rashiChartMap.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry pair = (Map.Entry) it.next();
			System.out.println(pair.getKey() + " = " + pair.getValue());
			addGrahaToRashi(rashiChartMap, ariesGrahas, taurusGrahas, geminiGrahas, cancerGrahas, leoGrahas,
					virgoGrahas, libraGrahas, scorpioGrahas, sagittariusGrahas, capricornGrahas, acquariusGrahas,
					piscesGrahas, (Graha) pair.getKey());

			it.remove(); // avoids a ConcurrentModificationException
		}

		ariesRashi.setGrahas(ariesGrahas);
		taurusRashi.setGrahas(taurusGrahas);
		geminiRashi.setGrahas(geminiGrahas);
		cancerRashi.setGrahas(cancerGrahas);
		leoRashi.setGrahas(leoGrahas);
		virgoRashi.setGrahas(virgoGrahas);
		libraRashi.setGrahas(libraGrahas);
		scorpioRashi.setGrahas(scorpioGrahas);
		sagittariusRashi.setGrahas(sagittariusGrahas);
		capricornRashi.setGrahas(capricornGrahas);
		acquariusRashi.setGrahas(acquariusGrahas);
		piscesRashi.setGrahas(piscesGrahas);

		return constructKundali(lagna, chartProcessor, ariesRashi, taurusRashi, geminiRashi, cancerRashi, leoRashi,
				virgoRashi, libraRashi, scorpioRashi, sagittariusRashi, capricornRashi, acquariusRashi, piscesRashi);

	}

	
	private static Chart constructKundali(RashiNames lagna, ChartProcessor chartProcessor, Rashi ariesRashi,
			Rashi taurusRashi, Rashi geminiRashi, Rashi cancerRashi, Rashi leoRashi, Rashi virgoRashi, Rashi libraRashi,
			Rashi scorpioRashi, Rashi sagittariusRashi, Rashi capricornRashi, Rashi acquariusRashi, Rashi piscesRashi) {
		if (RashiNames.ARIES == lagna) {

			chartProcessor.getHoroscope().getBhavas()[0].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(piscesRashi);
			return chartProcessor.getHoroscope();

		} else if (RashiNames.TAURUS == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(ariesRashi);
			return chartProcessor.getHoroscope();

		} else if (RashiNames.GEMINI == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(taurusRashi);
			return chartProcessor.getHoroscope();

		} else if (RashiNames.CANCER == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(geminiRashi);
			return chartProcessor.getHoroscope();

		} else if (RashiNames.LEO == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(cancerRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.VIRGO == lagna) {

			chartProcessor.getHoroscope().getBhavas()[0].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(leoRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.LIBRA == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(virgoRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.SCORPIO == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(libraRashi);

			return chartProcessor.getHoroscope();
		} else if (RashiNames.SAGITTAURIUS == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(scorpioRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.CAPRICORN == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(sagittariusRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.ACQUARIUS == lagna) {

			chartProcessor.getHoroscope().getBhavas()[0].setRashi(acquariusRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(capricornRashi);
			return chartProcessor.getHoroscope();
		} else if (RashiNames.PISCES == lagna) {
			chartProcessor.getHoroscope().getBhavas()[0].setRashi(piscesRashi);
			chartProcessor.getHoroscope().getBhavas()[1].setRashi(ariesRashi);
			chartProcessor.getHoroscope().getBhavas()[2].setRashi(taurusRashi);
			chartProcessor.getHoroscope().getBhavas()[3].setRashi(geminiRashi);
			chartProcessor.getHoroscope().getBhavas()[4].setRashi(cancerRashi);
			chartProcessor.getHoroscope().getBhavas()[5].setRashi(leoRashi);
			chartProcessor.getHoroscope().getBhavas()[6].setRashi(virgoRashi);
			chartProcessor.getHoroscope().getBhavas()[7].setRashi(libraRashi);
			chartProcessor.getHoroscope().getBhavas()[8].setRashi(scorpioRashi);
			chartProcessor.getHoroscope().getBhavas()[9].setRashi(sagittariusRashi);
			chartProcessor.getHoroscope().getBhavas()[10].setRashi(capricornRashi);
			chartProcessor.getHoroscope().getBhavas()[11].setRashi(acquariusRashi);
			return chartProcessor.getHoroscope();
		} else {
			return null;
		}
	}

	private static ChartProcessor getChartProcessor(ChartNames chartName, ApplicationContext context) {
		ChartProcessor chartProcessor;
		if (ChartNames.D1RashiChart == chartName) {
			chartProcessor = (D1RashiChartProcessor) context.getBean("d1RashiChartProcessor");
		} else if (ChartNames.D2HoraChart == chartName) {
			chartProcessor = (D2HoraChartProcessor) context.getBean("d2HoraChartProcessor");
		} else if (ChartNames.D3DrekannaChart == chartName) {
			chartProcessor = (D3DrekannaChartProcessor) context.getBean("d3DrekannaChartProcessor");
		} else if (ChartNames.D4ChaturthamsaChart == chartName) {
			chartProcessor = (D4ChaturthamsaChartProcessor) context.getBean("d4ChaturthamsaChartProcessor");
		} else if (ChartNames.D7SaptamsaChart == chartName) {
			chartProcessor = (D7SaptamsaChartProcessor) context.getBean("d7SaptamsaChartProcessor");
		} else if (ChartNames.D9NavamsaChart == chartName) {
			chartProcessor = (D9NavamsaChartProcessor) context.getBean("d9NavamsaChartProcessor");
		} else if (ChartNames.D10DasamsaChart == chartName) {
			chartProcessor = (D10DasamsaChartProcessor) context.getBean("d10DasamsaChartProcessor");
		} else if (ChartNames.D12DvadasamsaChart == chartName) {
			chartProcessor = (D12DvadasamsaChartProcessor) context.getBean("d12DvadasamsaChartProcessor");
		} else if (ChartNames.D16SodasamsaChart == chartName) {
			chartProcessor = (D16SodasamsaChartProcessor) context.getBean("d16SodasamsaChartProcessor");
		} else if (ChartNames.D20VimsamsaChart == chartName) {
			chartProcessor = (D20VimsamsaChartProcessor) context.getBean("d20VimsamsaChartProcessor");
		} else if (ChartNames.D24SiddhasamsaChart == chartName) {
			chartProcessor = (D24SiddhamsaChartProcessor) context.getBean("d24SiddhamsaChartProcessor");
		} else if (ChartNames.D27BhamsaNakshatraChart == chartName) {
			chartProcessor = (D27BhamsaNaksatramsaChartProcessor) context.getBean("d27BhamsaNaksatramsaChartProcessor");
		} else if (ChartNames.D30TrimsamsaChart == chartName) {
			chartProcessor = (D30TrimsamsaChartProcessor) context.getBean("d30TrimsamsaChartProcessor");
		} else if (ChartNames.D40KhavedamsaChart == chartName) {
			chartProcessor = (D40KhavedamsaChartProcessor) context.getBean("d40KhavedamsaChartProcessor");
		} else if (ChartNames.D45AksavedamsaChart == chartName) {
			chartProcessor = (D45AksavedamsaChartProcessor) context.getBean("d45AksavedamsaChartProcessor");
		} else if (ChartNames.D60SastamsaChart == chartName) {
			chartProcessor = (D60SastamsaChartProcessor) context.getBean("d60SastamsaChartProcessor");
		} else {
			chartProcessor = (D1RashiChartProcessor) context.getBean("d1RashiChartProcessor");
		}
		return chartProcessor;
	}

	public static Map<Graha, RashiNames> populateMap(Graha surya, RashiNames suryaRashi, Graha chandra,
			RashiNames chandraRashi, Graha mangal, RashiNames mangalRashi, Graha budha, RashiNames budhaRashi,
			Graha guru, RashiNames guruRashi, Graha shukra, RashiNames shukraRashi, Graha shani, RashiNames shaniRashi,
			Graha rahu, RashiNames rahuRashi, Graha ketu, RashiNames ketuRashi) {
		Map<Graha, RashiNames> map = new HashMap<Graha, RashiNames>();
		map.put(surya, suryaRashi);
		map.put(chandra, chandraRashi);
		map.put(mangal, mangalRashi);
		map.put(budha, budhaRashi);
		map.put(guru, guruRashi);
		map.put(shukra, shukraRashi);
		map.put(shani, shaniRashi);
		map.put(rahu, rahuRashi);
		map.put(ketu, ketuRashi);
		return map;
	}
	
	private static void addGrahaToRashi(Map<Graha, RashiNames> rashiChartMap, ArrayList<Graha> ariesGrahas,
			ArrayList<Graha> taurusGrahas, ArrayList<Graha> geminiGrahas, ArrayList<Graha> cancerGrahas,
			ArrayList<Graha> leoGrahas, ArrayList<Graha> virgoGrahas, ArrayList<Graha> libraGrahas,
			ArrayList<Graha> scorpioGrahas, ArrayList<Graha> sagittariusGrahas, ArrayList<Graha> capricornGrahas,
			ArrayList<Graha> acquariusGrahas, ArrayList<Graha> piscesGrahas, Graha key) {
		
		System.out.println("key"+key);
		if (RashiNames.ARIES == rashiChartMap.get(key)) {
			System.out.println("in aries");
			ariesGrahas.add(key);
		} else if (RashiNames.TAURUS == rashiChartMap.get(key)) {
			System.out.println("in taurus");
			taurusGrahas.add(key);
		} else if (RashiNames.GEMINI == rashiChartMap.get(key)) {
			System.out.println("in gemini");
			geminiGrahas.add(key);
		} else if (RashiNames.CANCER == rashiChartMap.get(key)) {
			System.out.println("in taurus");
			cancerGrahas.add(key);
		} else if (RashiNames.LEO == rashiChartMap.get(key)) {
			System.out.println("in gemini");
			leoGrahas.add(key);
		} else if (RashiNames.VIRGO == rashiChartMap.get(key)) {
			System.out.println("in virgo");
			virgoGrahas.add(key);
		} else if (RashiNames.LIBRA == rashiChartMap.get(key)) {
			System.out.println("in libra");
			libraGrahas.add(key);
		} else if (RashiNames.SCORPIO == rashiChartMap.get(key)) {
			System.out.println("in scorpio");
			scorpioGrahas.add(key);
		} else if (RashiNames.SAGITTAURIUS == rashiChartMap.get(key)) {
			System.out.println("in sagittarius");
			sagittariusGrahas.add(key);
		} else if (RashiNames.CAPRICORN == rashiChartMap.get(key)) {
			System.out.println("in capricorn");
			capricornGrahas.add(key);
		} else if (RashiNames.ACQUARIUS == rashiChartMap.get(key)) {
			System.out.println("in acquarius");
			acquariusGrahas.add(key);
		} else if (RashiNames.PISCES == rashiChartMap.get(key)) {
			System.out.println("in pisces");
			piscesGrahas.add(key);
		}
	}

}
