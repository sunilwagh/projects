package jyotish.analyze.bhavas.bhava1.lagna;

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

@Component("lagnaBhavaHelper")
public class LagnaBhavaHelper implements HouseLordPlacedInBhava{

	public String infoAboutHouseLordPlacedInBhava1() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("This placement produces good health, long life , self belief, ambition and ability to lead. "
				+ "live abroad");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava2() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("This placement shows interest in music, education amd family wealth");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava3() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"The Lagna lord in third house indicates a need for self expression probably through writing or job which needs you to move.It shows a person who is motivated and self ambitious."
						+ "Changes in life will take place at regualar intervals.If Moon is the lagna lord then changes will take place every month, if sun then every year..so on ");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava4() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Great attachment to mother,home and inner emotions. It will link your wealth and property in some way.");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava5() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Your main focus will be on creativity whether by producing children or by other means (e.g.Writing painting acting) ");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava6() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Focus your attention on health and healing, Service to Others, Enemies or detractors will respect you");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava7() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("Your life would be focused on personal relationship.");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava8() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Great need to release Kundalini Energy. This process might involve powers which you will find difficult to control. Secretive Person. Your quest for hidden knowledge might "
						+ "involve work in hospital or in forensic sciences, history,archaelogy, antiques and pathology");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava9() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"If your Lagna ruler is here, you are especially blessed. Past Karma works favorably for you. You will travel to froeign lands and meet wise teachers."
						+ " In time you will become respected for your wisdom. Particularly benefical relationship with father \n");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava10() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append("");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava11() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"Good position, shows achievement and rewards for ambition. When the Lagna ruler is in the 11th house you will earn the rewards of your work done in the 10th house. The eleventh house deals with the material profit. On the spiritual level the 11th house may activate the Sahasra Chakra,"
						+ "enabling you to understand the true meaning of life.");
		return infoBuffer.toString();

	}

	public String infoAboutHouseLordPlacedInBhava12() {
		StringBuffer infoBuffer = new StringBuffer();
		infoBuffer.append(
				"The twelveth house is concerned with loss both emotional and financial. You may give yourselves to others but your selflessness will not be appreciated. You may work in a prison, be a loner or frequently retire to yourself. You might make strong foreign connections and settle abroad. It is the house where the efforts are not rewarded and energy is spent on wasteful pursuits."
						+ "The twelveth house is that of Moksha and you may have strong desire to achieve Moksha.");
		return infoBuffer.toString();

	}

	
}
