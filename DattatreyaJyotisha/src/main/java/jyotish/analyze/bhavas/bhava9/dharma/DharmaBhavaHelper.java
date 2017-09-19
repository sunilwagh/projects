package jyotish.analyze.bhavas.bhava9.dharma;

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
import jyotish.bhavas.Bhava9;

@Component("dharmaBhavaHelper")
public class DharmaBhavaHelper implements HouseLordPlacedInBhava{

	public  String infoAboutHouseLordPlacedInBhava1() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"You are an influential person. People find you attractive. Ethics, religion and Dharma are important for you.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava2(){
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append("Inheritance of property from father. Birth in a wealthy household.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava3() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"The third house signifies self motivation,courage,writing,short journeys and brothers. The 9th lord placed here aspects the 9th house, which is good and will increase the significators. Some kind of guru will guid you.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava4() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Happy married life. Strong attachment to mother. You will own a lot of property. Both parents will have strong influence on your thinking.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava5() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append("Very good position. Fortune and good luck. Knowledge and insight are highlighted.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava6() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Difficult relationship with father. There would be obstacles in course of finding your destiny. Struggles and hardwork required to get what is rightfully yours.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava7() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Good luck in marriage partners. Though in general no planet is good in 7th but the 9th lord reduces this to some extent.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava8() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Separation from father through loss. Inheritance of property or unexpected gains in life. You may follow a religion which may be unacceptable to the family");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava9() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"This is a great position. Fame,success,happiness from children,wealth. Extreme good fortune. You will be protected in life.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava10() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"This indicates Raja Yoga. Much success with your career. Past Karmas act positively to acheive your ambition.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava11() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Good position. Ability to make money without much hardwork. Money Yoga indicates financial success.");
		return infoBuffer.toString();

	}

	public  String infoAboutHouseLordPlacedInBhava12() {
		StringBuilder infoBuffer = new StringBuilder();
		infoBuffer.append(
				"Loss of father. Foreign settlement or making money through foreign countries. You are not concerned with worldly matters but are focussed on spiritual stuff.");
		return infoBuffer.toString();

	}

	
}
