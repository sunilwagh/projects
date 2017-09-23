package dattatreya.jyotish.analyze.bhavas.bhava7.yuvati;

import org.springframework.stereotype.Component;

import dattatreya.jyotish.analyze.bhavas.HouseLordPlacedInBhava;
import dattatreya.jyotish.bhavas.Bhava1;
import dattatreya.jyotish.bhavas.Bhava10;
import dattatreya.jyotish.bhavas.Bhava11;
import dattatreya.jyotish.bhavas.Bhava12;
import dattatreya.jyotish.bhavas.Bhava2;
import dattatreya.jyotish.bhavas.Bhava3;
import dattatreya.jyotish.bhavas.Bhava4;
import dattatreya.jyotish.bhavas.Bhava5;
import dattatreya.jyotish.bhavas.Bhava6;
import dattatreya.jyotish.bhavas.Bhava7;
import dattatreya.jyotish.bhavas.Bhava8;
import dattatreya.jyotish.bhavas.Bhava9;

@Component("yuvatiBhavaHelper")
public class YuvatiBhavaHelper implements HouseLordPlacedInBhava {

	public  String infoAboutHouseLordPlacedInBhava1() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Relationships are very important. Your partner will be great influence in your life and the decisions you face");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava2() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Partner has great influence over you and they have some kind of family wealth.If the second house is mutable it indicates more than one marriage");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava3() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Partner works with you to achieve your ambition on material level");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava4() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Happy married life, good relationship. Home is important part of marriage");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava5() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Love Marriage.Romance is important. It can also mean more than one marriage");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava6() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Inimical relationship with partners. Fights possible and obstacles in marriage");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava7() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Good placement.Although planets are not considered to be good in the seventh house, the effect is nullified to some extent when it is the house ruler.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava8() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"You may lose your marriage partner through death or divorce.Issues of power can dominate your marital life.Partners may be secretive");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava9() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"This is very beneficial.It indicates fame,success and happiness from children and wealth.Partner may be interested in religion and philosophy");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava10(){
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Your partner will be interested and support you in the career. Increase in prosperity after marriage");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava11() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Beneficial Position. Chance to make money through partnership.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava12() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Marriage to foreign partner.Strong sexual energy");
		return infoBuffer.toString();

	}

	

}
