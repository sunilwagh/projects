package dattatreya.jyotish.horoscope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.Chart;
import dattatreya.jyotish.bhavas.Bhava;

@Component("d45AksavedamsaChart")
@Order(value=19)
public class D45AksavedamsaChart implements Chart{
	
	@Autowired
	Bhava bhava1;
	@Autowired
	Bhava bhava2;
	@Autowired
	Bhava bhava3;
	@Autowired
	Bhava bhava4;
	@Autowired
	Bhava bhava5;
	@Autowired
	Bhava bhava6;
	@Autowired
	Bhava bhava7;
	@Autowired
	Bhava bhava8;
	@Autowired
	Bhava bhava9;
	@Autowired
	Bhava bhava10;
	@Autowired
	Bhava bhava11;
	@Autowired
	Bhava bhava12;
	public Bhava getBhava1() {
		return bhava1;
	}
	public void setBhava1(Bhava bhava1) {
		this.bhava1 = bhava1;
	}
	public Bhava getBhava2() {
		return bhava2;
	}
	public void setBhava2(Bhava bhava2) {
		this.bhava2 = bhava2;
	}
	public Bhava getBhava3() {
		return bhava3;
	}
	public void setBhava3(Bhava bhava3) {
		this.bhava3 = bhava3;
	}
	public Bhava getBhava4() {
		return bhava4;
	}
	public void setBhava4(Bhava bhava4) {
		this.bhava4 = bhava4;
	}
	public Bhava getBhava5() {
		return bhava5;
	}
	public void setBhava5(Bhava bhava5) {
		this.bhava5 = bhava5;
	}
	public Bhava getBhava6() {
		return bhava6;
	}
	public void setBhava6(Bhava bhava6) {
		this.bhava6 = bhava6;
	}
	public Bhava getBhava7() {
		return bhava7;
	}
	public void setBhava7(Bhava bhava7) {
		this.bhava7 = bhava7;
	}
	public Bhava getBhava8() {
		return bhava8;
	}
	public void setBhava8(Bhava bhava8) {
		this.bhava8 = bhava8;
	}
	public Bhava getBhava9() {
		return bhava9;
	}
	public void setBhava9(Bhava bhava9) {
		this.bhava9 = bhava9;
	}
	public Bhava getBhava10() {
		return bhava10;
	}
	public void setBhava10(Bhava bhava10) {
		this.bhava10 = bhava10;
	}
	public Bhava getBhava11() {
		return bhava11;
	}
	public void setBhava11(Bhava bhava11) {
		this.bhava11 = bhava11;
	}
	public Bhava getBhava12() {
		return bhava12;
	}
	public void setBhava12(Bhava bhava12) {
		this.bhava12 = bhava12;
	}

}
