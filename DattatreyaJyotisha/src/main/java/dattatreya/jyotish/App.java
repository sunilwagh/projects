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

/**
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
**/

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.ChartNames;
import dattatreya.jyotish.util.GrahaNames;
import dattatreya.jyotish.util.RashiNames;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		Kundali kundali = (Kundali) context.getBean("kundali");
		Graha surya = (Graha) context.getBean("surya");
		Graha chandra = (Graha) context.getBean("chandra");
		Graha mangal = (Graha) context.getBean("mangal");
		Graha budha = (Graha) context.getBean("budha");
		Graha guru = (Graha) context.getBean("guru");
		Graha shukra = (Graha) context.getBean("shukra");
		Graha shani = (Graha) context.getBean("shani");
		Graha rahu = (Graha) context.getBean("rahu");
		Graha ketu = (Graha) context.getBean("ketu");

		RashiNames d1RashiChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d1RashiChartMap = HoroscopeFactory.populateMap(surya, RashiNames.SCORPIO, chandra, RashiNames.ARIES,
				mangal, RashiNames.VIRGO, budha, RashiNames.SCORPIO, guru, RashiNames.LIBRA, shukra,
				RashiNames.CAPRICORN, shani, RashiNames.VIRGO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d1Chart = HoroscopeFactory.createHoroscope(ChartNames.D1RashiChart, d1RashiChartLagna, d1RashiChartMap);
		//kundali.processD1(HoroscopeFactory.createHoroscope(ChartNames.D1RashiChart, d1RashiChartLagna, d1RashiChartMap));

		RashiNames d2HoraChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d2HoraChartMap = HoroscopeFactory.populateMap(surya, RashiNames.GEMINI, chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES, budha, RashiNames.SCORPIO, guru, RashiNames.LIBRA, shukra,
				RashiNames.CAPRICORN, shani, RashiNames.VIRGO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d2Chart = HoroscopeFactory.createHoroscope(ChartNames.D2HoraChart, d2HoraChartLagna, d2HoraChartMap);
		
		//kundali.processD2(HoroscopeFactory.createHoroscope(ChartNames.D2HoraChart, d2HoraChartLagna, d2HoraChartMap)));

		RashiNames d3DrekannaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d3DrekannaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.GEMINI, chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES, budha, RashiNames.SCORPIO, guru, RashiNames.LIBRA, shukra,
				RashiNames.CAPRICORN, shani, RashiNames.VIRGO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d3Chart = HoroscopeFactory.createHoroscope(ChartNames.D3DrekannaChart, d3DrekannaChartLagna, d3DrekannaChartMap);
		//kundali.processD3(HoroscopeFactory.createHoroscope(ChartNames.D3DrekannaChart, d3DrekannaChartLagna, d3DrekannaChartMap)));

		RashiNames d4ChaturthamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d4ChaturthamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.GEMINI, chandra,
				RashiNames.TAURUS, mangal, RashiNames.PISCES, budha, RashiNames.SCORPIO, guru, RashiNames.LIBRA, shukra,
				RashiNames.CAPRICORN, shani, RashiNames.VIRGO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d4Chart = HoroscopeFactory.createHoroscope(ChartNames.D4ChaturthamsaChart, d4ChaturthamsaChartLagna, d4ChaturthamsaChartMap);
		//kundali.processD4(HoroscopeFactory.createHoroscope(ChartNames.D4ChaturthamsaChart, d4ChaturthamsaChartLagna, d4ChaturthamsaChartMap)));

		RashiNames d7SaptamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d7SaptamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.GEMINI, chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES, budha, RashiNames.SCORPIO, guru, RashiNames.LIBRA, shukra,
				RashiNames.CAPRICORN, shani, RashiNames.VIRGO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d7Chart = HoroscopeFactory.createHoroscope(ChartNames.D7SaptamsaChart, d7SaptamsaChartLagna, d7SaptamsaChartMap);
		//kundali.processD7(HoroscopeFactory.createHoroscope(ChartNames.D7SaptamsaChart, d7SaptamsaChartLagna, d7SaptamsaChartMap)));

		RashiNames d9NavamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d9NavamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra, RashiNames.SCORPIO,
				mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru, RashiNames.SAGITTAURIUS, shukra,
				RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d9Chart = HoroscopeFactory.createHoroscope(ChartNames.D9NavamsaChart, d9NavamsaChartLagna, d9NavamsaChartMap);
		//kundali.processD9(HoroscopeFactory.createHoroscope(ChartNames.D9NavamsaChart, d9NavamsaChartLagna, d9NavamsaChartMap)));

		RashiNames d10DasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d10DasamsaChartMap =HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d10Chart = HoroscopeFactory.createHoroscope(ChartNames.D12DvadasamsaChart, d10DasamsaChartLagna, d10DasamsaChartMap);
		//kundali.processD10(HoroscopeFactory.createHoroscope(ChartNames.D12DvadasamsaChart, d10DasamsaChartLagna, d10DasamsaChartMap)));
		
		RashiNames d12DvadasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d12DvadasamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d12Chart = HoroscopeFactory.createHoroscope(ChartNames.D10DasamsaChart, d12DvadasamsaChartLagna, d12DvadasamsaChartMap);
		//kundali.processD12(HoroscopeFactory.createHoroscope(ChartNames.D10DasamsaChart, d12DvadasamsaChartLagna, d12DvadasamsaChartMap)));

		RashiNames d16SodasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d16SodasamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d16Chart = HoroscopeFactory.createHoroscope(ChartNames.D10DasamsaChart, d12DvadasamsaChartLagna, d12DvadasamsaChartMap);
		//kundali.processD16(HoroscopeFactory.createHoroscope(ChartNames.D16SodasamsaChart, d16SodasamsaChartLagna, d16SodasamsaChartMap)));

		RashiNames d20VimsamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d20VimsamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d20Chart = HoroscopeFactory.createHoroscope(ChartNames.D20VimsamsaChart, d20VimsamsaChartLagna, d20VimsamsaChartMap);
		//kundali.processD20(HoroscopeFactory.createHoroscope(ChartNames.D20VimsamsaChart, d20VimsamsaChartLagna, d20VimsamsaChartMap)));

		RashiNames d24SiddhamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d24SiddhamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d24Chart = HoroscopeFactory.createHoroscope(ChartNames.D24SiddhasamsaChart, d24SiddhamsaChartLagna, d24SiddhamsaChartMap);
		//kundali.processD24(HoroscopeFactory.createHoroscope(ChartNames.D24SiddhasamsaChart, d24SiddhamsaChartLagna, d24SiddhamsaChartMap)));

		RashiNames d27BhamsaNakshatraChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d27BhamsaNakshatraChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d27Chart = HoroscopeFactory.createHoroscope(ChartNames.D27BhamsaNakshatraChart, d27BhamsaNakshatraChartLagna, d27BhamsaNakshatraChartMap);
		//kundali.processD27(HoroscopeFactory.createHoroscope(ChartNames.D27BhamsaNakshatraChart, d27BhamsaNakshatraChartLagna, d27BhamsaNakshatraChartMap)));

		RashiNames d30TrimsamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d30TrimsamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d30Chart = HoroscopeFactory.createHoroscope(ChartNames.D30TrimsamsaChart, d30TrimsamsaChartLagna, d30TrimsamsaChartMap);
		//kundali.processD30(HoroscopeFactory.createHoroscope(ChartNames.D30TrimsamsaChart, d30TrimsamsaChartLagna, d30TrimsamsaChartMap)));

		RashiNames d40KhavedamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d40KhavedamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d40Chart = HoroscopeFactory.createHoroscope(ChartNames.D40KhavedamsaChart, d40KhavedamsaChartLagna, d40KhavedamsaChartMap);
		//kundali.processD40(HoroscopeFactory.createHoroscope(ChartNames.D40KhavedamsaChart, d40KhavedamsaChartLagna, d40KhavedamsaChartMap)));

		RashiNames d45AksavedamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d45AksavedamsaChartMap = new HashMap<Graha, RashiNames>();
		d45AksavedamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra, RashiNames.SCORPIO, mangal,
				RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru, RashiNames.SAGITTAURIUS, shukra,
				RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER, ketu, RashiNames.CAPRICORN);
		Chart d45Chart = HoroscopeFactory.createHoroscope(ChartNames.D45AksavedamsaChart, d45AksavedamsaChartLagna, d45AksavedamsaChartMap);
		//kundali.processD45(HoroscopeFactory.createHoroscope(ChartNames.D45AksavedamsaChart, d45AksavedamsaChartLagna, d45AksavedamsaChartMap)));

		RashiNames d60SastamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d60SastamsaChartMap = HoroscopeFactory.populateMap(surya, RashiNames.ACQUARIUS, chandra,
				RashiNames.SCORPIO, mangal, RashiNames.CAPRICORN, budha, RashiNames.CAPRICORN, guru,
				RashiNames.SAGITTAURIUS, shukra, RashiNames.PISCES, shani, RashiNames.LEO, rahu, RashiNames.CANCER,
				ketu, RashiNames.CAPRICORN);
		Chart d60Chart = HoroscopeFactory.createHoroscope(ChartNames.D60SastamsaChart, d60SastamsaChartLagna, d60SastamsaChartMap);
		//kundali.processD60(HoroscopeFactory.createHoroscope(ChartNames.D60SastamsaChart, d60SastamsaChartLagna, d60SastamsaChartMap)));

	}

	
	

	
}