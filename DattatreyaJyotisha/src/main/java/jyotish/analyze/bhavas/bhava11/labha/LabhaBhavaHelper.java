package jyotish.analyze.bhavas.bhava11.labha;

import org.springframework.stereotype.Component;

import jyotish.analyze.bhavas.HouseLordPlacedInBhava;
import jyotish.bhavas.Bhava1;
import jyotish.bhavas.Bhava10;
import jyotish.bhavas.Bhava11;
import jyotish.bhavas.Bhava12;
import jyotish.bhavas.Bhava2;
import jyotish.bhavas.Bhava3;
import jyotish.bhavas.Bhava4;
import jyotish.bhavas.Bhava5;
import jyotish.bhavas.Bhava6;
import jyotish.bhavas.Bhava7;
import jyotish.bhavas.Bhava8;
import jyotish.bhavas.Bhava9;

@Component("labhaBhavaHelper")
public class LabhaBhavaHelper implements HouseLordPlacedInBhava {

	public  String infoAboutHouseLordPlacedInBhava1() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"The 11th lord in 1st house indicates that you profit from your own efforts and very concerned about the correct results of your efforts.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava2() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Material gain, ability to make money and save it. Your earnings and ability are linked.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava3(){
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("The 11th lord in the 3rd house indicates that you make money from own efforts");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava4() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Working from home or ability to make money from real estate");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava5() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"It enhances the creative connection of the earning. The 11th house ruler aspects its own house "
						+ "further enhancing the quality of gain. Direct link between creativity and money making");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava6() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Success through hardwork. Both sixth and eleven are Upachaya houses, so they improve with time but they put obstacles through difficulties or disease.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava7() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Relationship with your partner would be financially profitable, whether on personal level or through business. Ability to make money through efforts connected through partner.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava8() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Money can come from research,history,astrology or past life work. Secret manipulation of money or profits, or money used for control of power.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava9() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("The 11th lord in the 9th house,indicates luck. It creates a Dhana Yoga. Those who have amazing capacity to make money and are extremely wealthy have a connection between the 11th and the 9th house. ");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava10() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Your earnings are directly connected to your career.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava11() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Self made person who has knack of making money. It can also show a desire for spiritual progress.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava12() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"It shows how we spend money. You spend money as soon as you make it.");
		return infoBuffer.toString();

	}

	

}
