package dattatreya.jyotish.chart.processors;


import java.util.concurrent.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import dattatreya.jyotish.analyze.bhavas.AnalyzeBhava;
import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.analyze.bhavas.ChartProcessor;
import dattatreya.jyotish.horoscope.D1RashiChart;


@Component("d1RashiChartProcessor")
@Order(value=1)
public final class D1RashiChartProcessor implements ChartProcessor{
	
	
	@Autowired
	@Qualifier("d1RashiChart") 
	Chart horoscope;

	
	@Autowired
	@Qualifier("analyzeBhava1")
	AnalyzeBhava analyzeBhava1;
	
	@Autowired
	@Qualifier("analyzeBhava2")
	AnalyzeBhava analyzeBhava2;
	
	@Autowired
	@Qualifier("analyzeBhava3")
	AnalyzeBhava analyzeBhava3;
	
	@Autowired
	@Qualifier("analyzeBhava4")
	AnalyzeBhava analyzeBhava4;
	
	@Autowired
	@Qualifier("analyzeBhava5")
	AnalyzeBhava analyzeBhava5;
	
	@Autowired
	@Qualifier("analyzeBhava6")
	AnalyzeBhava analyzeBhava6;
	
	@Autowired
	@Qualifier("analyzeBhava7")
	AnalyzeBhava analyzeBhava7;
	
	@Autowired
	@Qualifier("analyzeBhava8")
	AnalyzeBhava analyzeBhava8;
	
	@Autowired
	@Qualifier("analyzeBhava9")
	AnalyzeBhava analyzeBhava9;
	
	@Autowired
	@Qualifier("analyzeBhava10")
	AnalyzeBhava analyzeBhava10;
	
	@Autowired
	@Qualifier("analyzeBhava11")
	AnalyzeBhava analyzeBhava11;
	
	@Autowired
	@Qualifier("analyzeBhava12")
	AnalyzeBhava analyzeBhava12;
	
	
	public String processChart(Chart horoscope) {
		
		

		String bhava1 = null;
		String bhava2 = null;
		String bhava3 = null;
		String bhava4 = null;
		String bhava5 = null;
		String bhava6 = null;
		String bhava7 = null;
		String bhava8 = null;
		String bhava9 = null;
		String bhava10 = null;
		String bhava11 = null;
		String bhava12 = null;

		StringBuffer processHoroscopeSb = new StringBuffer();

		ExecutorService executor = Executors.newFixedThreadPool(4);
		try {

			Future<String> result1 = executor.submit(new BhavaProcessingCallable(horoscope, 1));
			Future<String> result2 = executor.submit(new BhavaProcessingCallable(horoscope, 2));
			Future<String> result3 = executor.submit(new BhavaProcessingCallable(horoscope, 3));
			Future<String> result4 = executor.submit(new BhavaProcessingCallable(horoscope, 4));
			Future<String> result5 = executor.submit(new BhavaProcessingCallable(horoscope, 5));
			Future<String> result6 = executor.submit(new BhavaProcessingCallable(horoscope, 6));
			Future<String> result7 = executor.submit(new BhavaProcessingCallable(horoscope, 7));
			Future<String> result8 = executor.submit(new BhavaProcessingCallable(horoscope, 8));
			Future<String> result9 = executor.submit(new BhavaProcessingCallable(horoscope, 9));
			Future<String> result10 = executor.submit(new BhavaProcessingCallable(horoscope, 10));
			Future<String> result11 = executor.submit(new BhavaProcessingCallable(horoscope, 11));
			Future<String> result12 = executor.submit(new BhavaProcessingCallable(horoscope, 12));

			bhava1 = result1.get();
			bhava2 = result2.get();
			bhava3 = result3.get();
			bhava4 = result4.get();
			bhava5 = result5.get();
			bhava6 = result6.get();
			bhava7 = result7.get();
			bhava8 = result8.get();
			bhava9 = result9.get();
			bhava10 = result10.get();
			bhava11 = result11.get();
			bhava12 = result12.get();

			executor.shutdown();
			executor.awaitTermination(15, TimeUnit.SECONDS);

		} catch (Exception e) {
			System.err.println("tasks interrupted" + e + "\n" + e.getMessage());
			e.printStackTrace();
		} finally {
			if (!executor.isTerminated()) {
				System.err.println("cancel non-finished tasks");
			}
			executor.shutdownNow();
			//System.out.println("shutdown finished");
		}

		processHoroscopeSb.append("\n*************Report**************** \n" 
		+ bhava1 + "\n" 
	    + bhava2 + "\n" 
		+ bhava3 + "\n" 
	    + bhava4 + "\n" 
		+ bhava5 + "\n"
	    + bhava6 + "\n" 
		+ bhava7 + "\n"
	    + bhava8 + "\n"
		+ bhava9 + "\n" 
	    + bhava10 + "\n" 
		+ bhava11 + "\n"
		+ bhava12
		+ "\n ***************Report ******************************\n");
		return processHoroscopeSb.toString();

	}

	public class BhavaProcessingCallable implements Callable {

		int i;
		Chart horoscope;

		public BhavaProcessingCallable(Chart horoscope, int i) {
			this.horoscope = horoscope;
			this.i = i;
		}

		public String call() {
			switch (i) {
			case 1:
				return parseBhava1(horoscope);
			case 2:
				return parseBhava2(horoscope);
			case 3:
				return parseBhava3(horoscope);
			case 4:
				return parseBhava4(horoscope);
			case 5:
				return parseBhava5(horoscope);
			case 6:
				return parseBhava6(horoscope);
			case 7:
				return parseBhava7(horoscope);
			case 8:
				return parseBhava8(horoscope);
			case 9:
				return parseBhava9(horoscope);
			case 10:
				return parseBhava10(horoscope);
			case 11:
				return parseBhava11(horoscope);
			case 12:
				return parseBhava12(horoscope);

			default:
				return null;

			}
		}

		public void parseHoroscope(Chart horoscope) {
			StringBuffer readingForHoroscope = new StringBuffer();

			readingForHoroscope.append(parseBhava2(horoscope));
			readingForHoroscope.append(parseBhava3(horoscope));
			readingForHoroscope.append(parseBhava4(horoscope));
			readingForHoroscope.append(parseBhava5(horoscope));
			readingForHoroscope.append(parseBhava6(horoscope));
			readingForHoroscope.append(parseBhava7(horoscope));
			readingForHoroscope.append(parseBhava8(horoscope));
			readingForHoroscope.append(parseBhava9(horoscope));
			readingForHoroscope.append(parseBhava10(horoscope));
			readingForHoroscope.append(parseBhava11(horoscope));
			readingForHoroscope.append(parseBhava12(horoscope));

		}

		private String parseBhava1(Chart horoscope) {

			StringBuffer readingForBhava1 = new StringBuffer();
			readingForBhava1.append(analyzeBhava1.analyzeBhava(horoscope));
			return readingForBhava1.toString();

		}

		private String parseBhava2(Chart horoscope) {

			StringBuffer readingForBhava2 = new StringBuffer();
			readingForBhava2.append(analyzeBhava2.analyzeBhava(horoscope));
			return readingForBhava2.toString();
		}

		private String parseBhava3(Chart horoscope) {

			StringBuffer readingForBhava3 = new StringBuffer();
			readingForBhava3.append(analyzeBhava3.analyzeBhava(horoscope));
			return readingForBhava3.toString();
		}

		private String parseBhava4(Chart horoscope) {

			StringBuffer readingForBhava4 = new StringBuffer();
			readingForBhava4.append(analyzeBhava4.analyzeBhava(horoscope));
			return readingForBhava4.toString();
		}

		private String parseBhava5(Chart horoscope) {

			StringBuffer readingForBhava5 = new StringBuffer();
			readingForBhava5.append(analyzeBhava5.analyzeBhava(horoscope));
			return readingForBhava5.toString();
		}

		private String parseBhava6(Chart horoscope) {

			StringBuffer readingForBhava6 = new StringBuffer();
			readingForBhava6.append(analyzeBhava6.analyzeBhava(horoscope));
			return readingForBhava6.toString();
		}

		private String parseBhava7(Chart horoscope) {

			StringBuffer readingForBhava7 = new StringBuffer();
			readingForBhava7.append(analyzeBhava7.analyzeBhava(horoscope));
			return readingForBhava7.toString();
		}

		private String parseBhava8(Chart horoscope) {

			StringBuffer readingForBhava8 = new StringBuffer();
			readingForBhava8.append(analyzeBhava8.analyzeBhava(horoscope));
			return readingForBhava8.toString();
		}

		private String parseBhava9(Chart horoscope) {

			StringBuffer readingForBhava9 = new StringBuffer();
			readingForBhava9.append(analyzeBhava9.analyzeBhava(horoscope));
			return readingForBhava9.toString();
		}

		private String parseBhava10(Chart horoscope) {

			StringBuffer readingForBhava10 = new StringBuffer();
			readingForBhava10.append(analyzeBhava10.analyzeBhava(horoscope));
			return readingForBhava10.toString();
		}

		private String parseBhava11(Chart horoscope) {

			StringBuffer readingForBhava11 = new StringBuffer();
			readingForBhava11.append(analyzeBhava11.analyzeBhava(horoscope));
			return readingForBhava11.toString();
		}

		private String parseBhava12(Chart horoscope) {

			StringBuffer readingForBhava12 = new StringBuffer();
			readingForBhava12.append(analyzeBhava12.analyzeBhava(horoscope));
			return readingForBhava12.toString();
		}

		
		
		
		
		
		

	}
	
	public Chart getHoroscope() {
		return horoscope;
	}

	public void setHoroscope(Chart horoscope) {
		this.horoscope = horoscope;
		
	}

	

	

	
}
