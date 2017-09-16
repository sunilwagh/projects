package jyotish.analyze.bhavas.bhava9.dharma;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jyotish.analyze.bhavas.AnalyzeBhava;
import jyotish.analyze.bhavas.bhava11.labha.LabhaBhavaHelper;
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
import jyotish.horoscope.Horoscope;
import jyotish.rashis.RashiUtil;
import util.JyotishEnumUtil.Name_Of_Graha;

@Component("analyzeBhava9")
public class AnalyzeBhava9 implements AnalyzeBhava{

	@Autowired
	DharmaBhavaHelper dharmaBhavaHelper;
	
	public String analyzeBhava(Horoscope horoscope) {
		
		StringBuilder sbAnalyzeBhava9 = new StringBuilder();
		
		Bhava1 bhava1 = (Bhava1) horoscope.getBhava1();
		Bhava2 bhava2 = (Bhava2) horoscope.getBhava2();
		Bhava3 bhava3 = (Bhava3) horoscope.getBhava3();
		Bhava4 bhava4 = (Bhava4) horoscope.getBhava4();
		Bhava5 bhava5 = (Bhava5) horoscope.getBhava5();
		Bhava6 bhava6 = (Bhava6) horoscope.getBhava6();
		Bhava7 bhava7 = (Bhava7) horoscope.getBhava7();
		Bhava8 bhava8 = (Bhava8) horoscope.getBhava8();
		Bhava9 bhava9 = (Bhava9) horoscope.getBhava9();
		Bhava10 bhava10 = (Bhava10) horoscope.getBhava10();
		Bhava11 bhava11 = (Bhava11) horoscope.getBhava11();
		Bhava12 bhava12 = (Bhava12) horoscope.getBhava12();

		Name_Of_Graha lordOfRashi = RashiUtil.getRashiLordMap().get(RashiUtil.findRashiInBhava(bhava9.getRashi()));

		if (RashiUtil.getGrahasInRashi(bhava1.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava1.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 1 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava1(bhava9,bhava1));
		}

		if (RashiUtil.getGrahasInRashi(bhava2.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava2.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 2 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava2(bhava9, bhava2));
		}

		if (RashiUtil.getGrahasInRashi(bhava3.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava3.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 3 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava3(bhava9, bhava3));
		}

		if (RashiUtil.getGrahasInRashi(bhava4.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava4.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 4 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava4(bhava9, bhava4));
		}

		if (RashiUtil.getGrahasInRashi(bhava5.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava5.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 5 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava5(bhava9, bhava5));
		}

		if (RashiUtil.getGrahasInRashi(bhava6.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava6.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 6 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava6(bhava9, bhava6));
		}

		if (RashiUtil.getGrahasInRashi(bhava7.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava7.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 7 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava7(bhava9, bhava7));
		}

		if (RashiUtil.getGrahasInRashi(bhava8.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava8.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 8 \\n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava8(bhava9, bhava8));
		}

		if (RashiUtil.getGrahasInRashi(bhava9.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava9.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 9 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava9(bhava9));
		}

		if (RashiUtil.getGrahasInRashi(bhava10.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava10.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 10 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava10(bhava9, bhava10));
		}

		if (RashiUtil.getGrahasInRashi(bhava11.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava11.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 11 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava11(bhava9, bhava11));
		}

		if (RashiUtil.getGrahasInRashi(bhava12.getRashi()) != null
				&& RashiUtil.getGrahasInRashi(bhava12.getRashi()).contains(lordOfRashi)) {
			sbAnalyzeBhava9.append("Lord of 9 in 12 \n");
			sbAnalyzeBhava9.append(dharmaBhavaHelper.infoAboutLordOfBhava9InBhava12(bhava9, bhava12));
		}

		return sbAnalyzeBhava9.toString();

	}
}
