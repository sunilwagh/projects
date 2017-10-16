package dattatreya.jyotish;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.chart.processors.D10DasamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D11RudramshaChartProcessor;
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
import dattatreya.jyotish.chart.processors.D5PanchamshaChartProcessor;
import dattatreya.jyotish.chart.processors.D60SastamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D6ShashthamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D7SaptamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D8AshtamsaChartProcessor;
import dattatreya.jyotish.chart.processors.D9NavamsaChartProcessor;

@Component("kundali")
public class Kundali {

	@Autowired
	D1RashiChartProcessor d1RashiChartProcessor;

	@Autowired
	D2HoraChartProcessor d2HoraChartProcessor;

	@Autowired
	D3DrekannaChartProcessor d3DrekannaChartProcessor;

	@Autowired
	D4ChaturthamsaChartProcessor d4ChaturthamsaChartProcessor;

	@Autowired
	D5PanchamshaChartProcessor d5PanchamshaChartProcessor;

	@Autowired
	D6ShashthamsaChartProcessor d6ShashthamsaChartProcessor;

	@Autowired
	D7SaptamsaChartProcessor d7SaptamsaChartProcessor;
	
	@Autowired
	D8AshtamsaChartProcessor d8AshtamsaChartProcessor;

	@Autowired
	D9NavamsaChartProcessor d9NavamsaChartProcessor;

	@Autowired
	D10DasamsaChartProcessor d10DasamsaChartProcessor;
	
	@Autowired
	D11RudramshaChartProcessor d11RudramshaChartProcessor;

	@Autowired
	D12DvadasamsaChartProcessor d12DvadasamsaChartProcessor;

	@Autowired
	D16SodasamsaChartProcessor d16SodasamsaChartProcessor;

	@Autowired
	D20VimsamsaChartProcessor d20VimsamsaChartProcessor;

	@Autowired
	D24SiddhamsaChartProcessor d24SiddhamsaChartProcessor;

	@Autowired
	D27BhamsaNaksatramsaChartProcessor d27BhamsaNaksatramsaChartProcessor;

	@Autowired
	D30TrimsamsaChartProcessor d30TrimsamsaChartProcessor;

	@Autowired
	D40KhavedamsaChartProcessor d40KhavedamsaChartProcessor;

	@Autowired
	D45AksavedamsaChartProcessor d45AksavedamsaChartProcessor;

	@Autowired
	D60SastamsaChartProcessor d60SastamsaChartProcessor;

	public String processD1(Chart chart) {

		return d1RashiChartProcessor.processChart(chart);

	}

	public String processD2(Chart d1Chart, Chart d2Chart) {

		return d2HoraChartProcessor.processChart(d1Chart, d2Chart);
	}

	public String processD3(Chart d1Chart, Chart d3Chart) {

		return d3DrekannaChartProcessor.processChart(d1Chart, d3Chart);
	}

	public String processD4(Chart d1Chart, Chart d4Chart) {

		return d4ChaturthamsaChartProcessor.processChart(d1Chart, d4Chart);

	}

	public String processD5(Chart d1Chart, Chart d5Chart) {

		return d5PanchamshaChartProcessor.processChart(d1Chart, d5Chart);

	}

	public String processD6(Chart d1Chart, Chart d6Chart) {

		return d6ShashthamsaChartProcessor.processChart(d1Chart, d6Chart);

	}

	public String processD7(Chart d1Chart, Chart d7Chart) {

		return d7SaptamsaChartProcessor.processChart(d1Chart, d7Chart);

	}

	public String processD8(Chart d1Chart, Chart d8Chart) {

		return d8AshtamsaChartProcessor.processChart(d1Chart, d8Chart);

	}

	public String processD9(Chart d1Chart, Chart d9Chart) {

		return d9NavamsaChartProcessor.processChart(d1Chart, d9Chart);

	}

	public String processD10(Chart d1Chart, Chart d10Chart) {

		return d10DasamsaChartProcessor.processChart(d1Chart, d10Chart);

	}

	public String processD11(Chart d1Chart, Chart d11Chart) {

		return d11RudramshaChartProcessor.processChart(d1Chart, d11Chart);

	}

	public String processD12(Chart d1Chart, Chart d12Chart) {

		return d12DvadasamsaChartProcessor.processChart(d1Chart, d12Chart);

	}

	public String processD16(Chart d1Chart, Chart d16Chart) {

		return d16SodasamsaChartProcessor.processChart(d1Chart, d16Chart);

	}

	public String processD20(Chart d1Chart, Chart d20Chart) {

		return d20VimsamsaChartProcessor.processChart(d1Chart, d20Chart);

	}

	public String processD24(Chart d1Chart, Chart d24Chart) {

		return d24SiddhamsaChartProcessor.processChart(d1Chart, d24Chart);

	}

	public String processD27(Chart d1Chart, Chart d27Chart) {

		return d24SiddhamsaChartProcessor.processChart(d1Chart, d27Chart);

	}

	public String processD30(Chart d1Chart, Chart d27Chart) {

		return d30TrimsamsaChartProcessor.processChart(d1Chart, d27Chart);

	}

	public String processD40(Chart d1Chart, Chart d40Chart) {

		return d40KhavedamsaChartProcessor.processChart(d1Chart, d40Chart);

	}

	public String processD45(Chart d1Chart, Chart d45Chart) {

		return d45AksavedamsaChartProcessor.processChart(d1Chart, d45Chart);
	}

	public String processD60(Chart d1Chart, Chart d60Chart) {

		return d60SastamsaChartProcessor.processChart(d1Chart, d60Chart);

	}

	public D1RashiChartProcessor getD1RashiChartProcessor() {
		return d1RashiChartProcessor;
	}

	public void setD1RashiChartProcessor(D1RashiChartProcessor d1RashiChartProcessor) {
		this.d1RashiChartProcessor = d1RashiChartProcessor;
	}

	public D2HoraChartProcessor getD2HoraChartProcessor() {
		return d2HoraChartProcessor;
	}

	public void setD2HoraChartProcessor(D2HoraChartProcessor d2HoraChartProcessor) {
		this.d2HoraChartProcessor = d2HoraChartProcessor;
	}

	public D3DrekannaChartProcessor getD3DrekannaChartProcessor() {
		return d3DrekannaChartProcessor;
	}

	public void setD3DrekannaChartProcessor(D3DrekannaChartProcessor d3DrekannaChartProcessor) {
		this.d3DrekannaChartProcessor = d3DrekannaChartProcessor;
	}

	public D4ChaturthamsaChartProcessor getD4ChaturthamsaChartProcessor() {
		return d4ChaturthamsaChartProcessor;
	}

	public void setD4ChaturthamsaChartProcessor(D4ChaturthamsaChartProcessor d4ChaturthamsaChartProcessor) {
		this.d4ChaturthamsaChartProcessor = d4ChaturthamsaChartProcessor;
	}

	public D7SaptamsaChartProcessor getD7SaptamsaChartProcessor() {
		return d7SaptamsaChartProcessor;
	}

	public void setD7SaptamsaChartProcessor(D7SaptamsaChartProcessor d7SaptamsaChartProcessor) {
		this.d7SaptamsaChartProcessor = d7SaptamsaChartProcessor;
	}

	public D9NavamsaChartProcessor getD9NavamsaChartProcessor() {
		return d9NavamsaChartProcessor;
	}

	public void setD9NavamsaChartProcessor(D9NavamsaChartProcessor d9NavamsaChartProcessor) {
		this.d9NavamsaChartProcessor = d9NavamsaChartProcessor;
	}

	public D10DasamsaChartProcessor getD10DasamsaChartProcessor() {
		return d10DasamsaChartProcessor;
	}

	public void setD10DasamsaChartProcessor(D10DasamsaChartProcessor d10DasamsaChartProcessor) {
		this.d10DasamsaChartProcessor = d10DasamsaChartProcessor;
	}

	public D12DvadasamsaChartProcessor getD12DvadasamsaChartProcessor() {
		return d12DvadasamsaChartProcessor;
	}

	public void setD12DvadasamsaChartProcessor(D12DvadasamsaChartProcessor d12DvadasamsaChartProcessor) {
		this.d12DvadasamsaChartProcessor = d12DvadasamsaChartProcessor;
	}

	public D16SodasamsaChartProcessor getD16SodasamsaChartProcessor() {
		return d16SodasamsaChartProcessor;
	}

	public void setD16SodasamsaChartProcessor(D16SodasamsaChartProcessor d16SodasamsaChartProcessor) {
		this.d16SodasamsaChartProcessor = d16SodasamsaChartProcessor;
	}

	public D20VimsamsaChartProcessor getD20VimsamsaChartProcessor() {
		return d20VimsamsaChartProcessor;
	}

	public void setD20VimsamsaChartProcessor(D20VimsamsaChartProcessor d20VimsamsaChartProcessor) {
		this.d20VimsamsaChartProcessor = d20VimsamsaChartProcessor;
	}

	public D24SiddhamsaChartProcessor getD24SiddhamsaChartProcessor() {
		return d24SiddhamsaChartProcessor;
	}

	public void setD24SiddhamsaChartProcessor(D24SiddhamsaChartProcessor d24SiddhamsaChartProcessor) {
		this.d24SiddhamsaChartProcessor = d24SiddhamsaChartProcessor;
	}

	public D27BhamsaNaksatramsaChartProcessor getD27BhamsaNaksatramsaChartProcessor() {
		return d27BhamsaNaksatramsaChartProcessor;
	}

	public void setD27BhamsaNaksatramsaChartProcessor(
			D27BhamsaNaksatramsaChartProcessor d27BhamsaNaksatramsaChartProcessor) {
		this.d27BhamsaNaksatramsaChartProcessor = d27BhamsaNaksatramsaChartProcessor;
	}

	public D30TrimsamsaChartProcessor getD30TrimsamsaChartProcessor() {
		return d30TrimsamsaChartProcessor;
	}

	public void setD30TrimsamsaChartProcessor(D30TrimsamsaChartProcessor d30TrimsamsaChartProcessor) {
		this.d30TrimsamsaChartProcessor = d30TrimsamsaChartProcessor;
	}

	public D40KhavedamsaChartProcessor getD40KhavedamsaChartProcessor() {
		return d40KhavedamsaChartProcessor;
	}

	public void setD40KhavedamsaChartProcessor(D40KhavedamsaChartProcessor d40KhavedamsaChartProcessor) {
		this.d40KhavedamsaChartProcessor = d40KhavedamsaChartProcessor;
	}

	public D45AksavedamsaChartProcessor getD45AksavedamsaChartProcessor() {
		return d45AksavedamsaChartProcessor;
	}

	public void setD45AksavedamsaChartProcessor(D45AksavedamsaChartProcessor d45AksavedamsaChartProcessor) {
		this.d45AksavedamsaChartProcessor = d45AksavedamsaChartProcessor;
	}

	public D60SastamsaChartProcessor getD60SastamsaChartProcessor() {
		return d60SastamsaChartProcessor;
	}

	public void setD60SastamsaChartProcessor(D60SastamsaChartProcessor d60SastamsaChartProcessor) {
		this.d60SastamsaChartProcessor = d60SastamsaChartProcessor;
	}

}
