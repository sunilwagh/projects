package dattatreya.jyotish;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import dattatreya.jyotish.analyze.bhavas.Chart;

/**
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
**/

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.ChartNames;
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

		/**
		 *  D1 Chart
		 */
		RashiNames d1RashiChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d1RashiChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.SCORPIO, 
				 chandra, RashiNames.ARIES,
				 mangal, RashiNames.VIRGO, 
				 budha, RashiNames.SCORPIO, 
				 guru, RashiNames.LIBRA, 
				 shukra,RashiNames.CAPRICORN, 
				 shani, RashiNames.VIRGO, 
				 rahu, RashiNames.CANCER, 
				 ketu, RashiNames.CAPRICORN);
		Chart d1Chart = HoroscopeFactory.createHoroscope(ChartNames.D1RashiChart, d1RashiChartLagna, d1RashiChartMap);
		String d1ChartAnalysis = kundali.processD1(d1Chart);
		System.out.println(d1ChartAnalysis);
		
		
		/**
		 *  D9 Chart
		 */
		RashiNames d9NavamsaChartLagna = RashiNames.LEO;
		Map<Graha, RashiNames> d9NavamsaChartMap = HoroscopeFactory.populateMap(
				surya, RashiNames.ACQUARIUS, 
				chandra, RashiNames.SCORPIO,
				mangal, RashiNames.CAPRICORN, 
				budha, RashiNames.CAPRICORN, 
				guru, RashiNames.SAGITTAURIUS, 
				shukra,RashiNames.PISCES, 
				shani, RashiNames.LEO, 
				rahu, RashiNames.CANCER, 
				ketu, RashiNames.CAPRICORN);
		Chart d9Chart = HoroscopeFactory.createHoroscope(ChartNames.D9NavamsaChart, d9NavamsaChartLagna, d9NavamsaChartMap);
		String d9ChartAnalysis= kundali.processD9(d1Chart,d9Chart);
		System.out.println(d9ChartAnalysis);

		/**
		 *  D2 Chart
		 */
		RashiNames d2HoraChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d2HoraChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
				 chandra, RashiNames.TAURUS,
				 mangal, RashiNames.PISCES, 
				 budha, RashiNames.GEMINI, 
				 guru, RashiNames.ARIES, 
				 shukra,RashiNames.SCORPIO, 
				 shani, RashiNames.ACQUARIUS, 
				 rahu, RashiNames.SCORPIO, 
				 ketu, RashiNames.SCORPIO);
		Chart d2Chart = HoroscopeFactory.createHoroscope(ChartNames.D2HoraChart, d2HoraChartLagna, d2HoraChartMap);
		String d2ChartAnalysis= kundali.processD2(d1Chart,d2Chart);
		System.out.println(d2ChartAnalysis);
		
		/**
		 *  D3 Chart
		 */
        RashiNames d3DrekannaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d3DrekannaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.CANCER, 
				 chandra, RashiNames.SAGITTAURIUS,
				 mangal, RashiNames.VIRGO, 
				 budha, RashiNames.CANCER, 
				 guru, RashiNames.LIBRA, 
				 shukra,RashiNames.CAPRICORN, 
				 shani, RashiNames.TAURUS, 
				 rahu, RashiNames.CANCER, 
				 ketu, RashiNames.CAPRICORN);
		Chart d3Chart = HoroscopeFactory.createHoroscope(ChartNames.D3DrekannaChart, d3DrekannaChartLagna, d3DrekannaChartMap);
		String d3ChartAnalysis= kundali.processD3(d1Chart,d3Chart);
		System.out.println(d3ChartAnalysis);


		/**
		 *  D4 Chart
		 */
		RashiNames d4ChaturthamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d4ChaturthamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.LEO, 
				 chandra,RashiNames.CAPRICORN, 
				 mangal, RashiNames.VIRGO, 
				 budha, RashiNames.LEO, 
				 guru, RashiNames.CAPRICORN, 
				 shukra,RashiNames.CAPRICORN, 
				 shani, RashiNames.GEMINI, 
				 rahu, RashiNames.CANCER, 
				 ketu, RashiNames.CAPRICORN);
		Chart d4Chart = HoroscopeFactory.createHoroscope(ChartNames.D4ChaturthamsaChart, d4ChaturthamsaChartLagna, d4ChaturthamsaChartMap);
		String d4ChartAnalysis= kundali.processD4(d1Chart,d4Chart);
		System.out.println(d4ChartAnalysis);
		
		/**
		 *  D5 Chart
		 */
		RashiNames d5PanchamshaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d5PanchamshaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.LEO, 
				 chandra,RashiNames.CAPRICORN, 
				 mangal, RashiNames.VIRGO, 
				 budha, RashiNames.LEO, 
				 guru, RashiNames.CAPRICORN, 
				 shukra,RashiNames.CAPRICORN, 
				 shani, RashiNames.GEMINI, 
				 rahu, RashiNames.CANCER, 
				 ketu, RashiNames.CAPRICORN);
		Chart d5Chart = HoroscopeFactory.createHoroscope(ChartNames.D5PanchamshaChart, d5PanchamshaChartLagna, d5PanchamshaChartMap);
		String d5ChartAnalysis= kundali.processD5(d1Chart,d5Chart);
		System.out.println(d5ChartAnalysis);
		
		
		/**
		 *  D6 Chart
		 */
		RashiNames d6ShasthamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d6ShasthamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.LEO, 
				 chandra,RashiNames.CAPRICORN, 
				 mangal, RashiNames.VIRGO, 
				 budha, RashiNames.LEO, 
				 guru, RashiNames.CAPRICORN, 
				 shukra,RashiNames.CAPRICORN, 
				 shani, RashiNames.GEMINI, 
				 rahu, RashiNames.CANCER, 
				 ketu, RashiNames.CAPRICORN);
		Chart d6Chart = HoroscopeFactory.createHoroscope(ChartNames.D6ShasthamsaChart, d6ShasthamsaChartLagna, d6ShasthamsaChartMap);
		String d6ChartAnalysis= kundali.processD6(d1Chart,d6Chart);
		System.out.println(d6ChartAnalysis);

		/**
		 *  D7 Chart
		 */
		RashiNames d7SaptamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d7SaptamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
				chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES, 
				budha, RashiNames.SCORPIO, 
				guru, RashiNames.LIBRA, 
				shukra,RashiNames.CAPRICORN, 
				shani, RashiNames.VIRGO, 
				rahu, RashiNames.CANCER, 
				ketu, RashiNames.CAPRICORN);
		Chart d7Chart = HoroscopeFactory.createHoroscope(ChartNames.D7SaptamsaChart, d7SaptamsaChartLagna, d7SaptamsaChartMap);
		String d7ChartAnalysis= kundali.processD6(d1Chart,d7Chart);
		System.out.println(d7ChartAnalysis);
		
		
		/**
		 *  D8 Chart
		 */
		RashiNames d8SaptamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d8SaptamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
				chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES,
				budha, RashiNames.SCORPIO,
				guru, RashiNames.LIBRA,
				shukra,RashiNames.CAPRICORN, 
				shani, RashiNames.VIRGO, 
				rahu, RashiNames.CANCER, 
				ketu, RashiNames.CAPRICORN);
		Chart d8Chart = HoroscopeFactory.createHoroscope(ChartNames.D8AshtamsaChart, d8SaptamsaChartLagna, d8SaptamsaChartMap);
		String d8ChartAnalysis= kundali.processD4(d1Chart,d8Chart);
		System.out.println(d8ChartAnalysis);
		
		
		/**
		 *  D10 Chart
		 */
		RashiNames d10DasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d10DasamsaChartMap =HoroscopeFactory.populateMap
				        (surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d10Chart = HoroscopeFactory.createHoroscope(ChartNames.D12DvadasamsaChart, d10DasamsaChartLagna, d10DasamsaChartMap);
		String d10ChartAnalysis= kundali.processD4(d1Chart,d10Chart);
		System.out.println(d10ChartAnalysis);
		
		/**
		 *  D11 Chart
		 */
		RashiNames d11RudramsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d11RudramsaChartMap =HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d11Chart = HoroscopeFactory.createHoroscope(ChartNames.D11RudramsaChart, d11RudramsaChartLagna, d11RudramsaChartMap);
		String d11ChartAnalysis= kundali.processD11(d1Chart,d11Chart);
		System.out.println(d11ChartAnalysis);
		
		
		/**
		 *  D12 Chart
		 */
		RashiNames d12DvadasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d12DvadasamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d12Chart = HoroscopeFactory.createHoroscope(ChartNames.D12DvadasamsaChart, d12DvadasamsaChartLagna, d12DvadasamsaChartMap);
		String d12ChartAnalysis= kundali.processD12(d1Chart,d12Chart);
		System.out.println(d12ChartAnalysis);
		
		
		/**
		 *  D16 Chart
		 */
		RashiNames d16SodasamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d16SodasamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d16Chart = HoroscopeFactory.createHoroscope(ChartNames.D16SodasamsaChart, d16SodasamsaChartLagna, d16SodasamsaChartMap);
		String d16ChartAnalysis= kundali.processD16(d1Chart,d16Chart);
		System.out.println(d16ChartAnalysis);
		
		
		/**
		 *  D20 Chart
		 */
		RashiNames d20VimsamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d20VimsamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d20Chart = HoroscopeFactory.createHoroscope(ChartNames.D20VimsamsaChart, d20VimsamsaChartLagna, d20VimsamsaChartMap);
		String d20ChartAnalysis= kundali.processD20(d1Chart,d20Chart);
		System.out.println(d20ChartAnalysis);
		
		
		/**
		 *  D24 Chart
		 */
		RashiNames d24SiddhamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d24SiddhamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d24Chart = HoroscopeFactory.createHoroscope(ChartNames.D24SiddhasamsaChart, d24SiddhamsaChartLagna, d24SiddhamsaChartMap);
		String d24ChartAnalysis= kundali.processD24(d1Chart,d24Chart);
		System.out.println(d24ChartAnalysis);
		
		
		/**
		 *  D27 Chart
		 */
		RashiNames d27BhamsaNakshatraChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d27BhamsaNakshatraChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d27Chart = HoroscopeFactory.createHoroscope(ChartNames.D27BhamsaNakshatraChart, d27BhamsaNakshatraChartLagna, d27BhamsaNakshatraChartMap);
		String d27ChartAnalysis= kundali.processD27(d1Chart,d27Chart);
		System.out.println(d27ChartAnalysis);

		/**
		 *  D30 Chart
		 */
		RashiNames d30TrimsamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d30TrimsamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
				chandra, RashiNames.TAURUS,
				mangal, RashiNames.PISCES,
				budha, RashiNames.SCORPIO,
				guru, RashiNames.LIBRA,
				shukra,RashiNames.CAPRICORN, 
				shani, RashiNames.VIRGO, 
				rahu, RashiNames.CANCER, 
				ketu, RashiNames.CAPRICORN);
		Chart d30Chart = HoroscopeFactory.createHoroscope(ChartNames.D30TrimsamsaChart, d30TrimsamsaChartLagna, d30TrimsamsaChartMap);
		String d30ChartAnalysis= kundali.processD30(d1Chart,d30Chart);
		System.out.println(d30ChartAnalysis);

		/**
		 *  D40 Chart
		 */
		RashiNames d40KhavedamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d40KhavedamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d40Chart = HoroscopeFactory.createHoroscope(ChartNames.D40KhavedamsaChart, d40KhavedamsaChartLagna, d40KhavedamsaChartMap);
		String d40ChartAnalysis= kundali.processD40(d1Chart,d40Chart);
		System.out.println(d40ChartAnalysis);
		
		/**
		 *  D45 Chart
		 */
		RashiNames d45AksavedamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d45AksavedamsaChartMap = new HashMap<Graha, RashiNames>();
		d45AksavedamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d45Chart = HoroscopeFactory.createHoroscope(ChartNames.D45AksavedamsaChart, d45AksavedamsaChartLagna, d45AksavedamsaChartMap);
		String d45ChartAnalysis= kundali.processD45(d1Chart,d45Chart);
		System.out.println(d45ChartAnalysis);

		/**
		 *  D60 Chart
		 */
		RashiNames d60SastamsaChartLagna = RashiNames.PISCES;
		Map<Graha, RashiNames> d60SastamsaChartMap = HoroscopeFactory.populateMap
				(surya, RashiNames.GEMINI, 
						chandra, RashiNames.TAURUS,
						mangal, RashiNames.PISCES,
						budha, RashiNames.SCORPIO,
						guru, RashiNames.LIBRA,
						shukra,RashiNames.CAPRICORN, 
						shani, RashiNames.VIRGO, 
						rahu, RashiNames.CANCER, 
						ketu, RashiNames.CAPRICORN);
		Chart d60Chart = HoroscopeFactory.createHoroscope(ChartNames.D60SastamsaChart, d60SastamsaChartLagna, d60SastamsaChartMap);
		String d60ChartAnalysis= kundali.processD60(d1Chart,d60Chart);
		System.out.println(d60ChartAnalysis);

	}

	
	

	
}