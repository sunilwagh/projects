package dattatreya.jyotish.analyze.bhavas;

public interface Kundali {

	public String processD1(Chart chart);

	public String processD2(Chart d1Chart, Chart d2Chart);

	public String processD3(Chart d1Chart, Chart d3Chart);

	public String processD4(Chart d1Chart, Chart d4Chart);

	public String processD5(Chart d1Chart, Chart d5Chart);

	public String processD6(Chart d1Chart, Chart d6Chart);

	public String processD7(Chart d1Chart, Chart d7Chart);

	public String processD8(Chart d1Chart, Chart d8Chart);

	public String processD9(Chart d1Chart, Chart d9Chart);

	public String processD10(Chart d1Chart, Chart d10Chart);

	public String processD11(Chart d1Chart, Chart d11Chart);

	public String processD12(Chart d1Chart, Chart d12Chart);

	public String processD16(Chart d1Chart, Chart d16Chart);

	public String processD20(Chart d1Chart, Chart d20Chart);

	public String processD24(Chart d1Chart, Chart d24Chart);

	public String processD27(Chart d1Chart, Chart d27Chart);

	public String processD30(Chart d1Chart, Chart d27Chart);

	public String processD40(Chart d1Chart, Chart d40Chart);

	public String processD45(Chart d1Chart, Chart d45Chart);

	public String processD60(Chart d1Chart, Chart d60Chart);

}
