package dattatreya.jyotish.bhavas;

import java.util.ArrayList;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.RashiFactory;
import dattatreya.jyotish.util.JyotishEnumUtil;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Bhava;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;

public final class BhavaFactory {

	
	public static Bhava getBhava(Name_Of_Bhava bhava,Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {

		switch (bhava) {
		case BHAVA1:
			return(createBhava1(rashi,grahaList));
		case BHAVA2:
			return(createBhava2(rashi,grahaList));
		case BHAVA3:
			return(createBhava3(rashi,grahaList));
		case BHAVA4:
			return(createBhava4(rashi,grahaList));
		case BHAVA5:
			return(createBhava5(rashi,grahaList));
		case BHAVA6:
			return(createBhava6(rashi,grahaList));
		case BHAVA7:
			return(createBhava7(rashi,grahaList));
		case BHAVA8:
			return(createBhava8(rashi,grahaList));
		case BHAVA9:
			return(createBhava9(rashi,grahaList));
		case BHAVA10:
			return(createBhava10(rashi,grahaList));
		case BHAVA11:
			return(createBhava11(rashi,grahaList));
		case BHAVA12:
			return(createBhava12(rashi,grahaList));
		
		default:
			return null;

		}
	}

	public static Bhava createBhava1(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava1 bhava1 = new Bhava1();
		bhava1.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava1;

	}

	
	public static Bhava createBhava2(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava2 bhava2 = new Bhava2();
		bhava2.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava2;

	}
	
	public static Bhava createBhava3(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava3 bhava3 = new Bhava3();
		bhava3.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava3;

	}
	
	public static Bhava createBhava4(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava4 bhava4 = new Bhava4();
		bhava4.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava4;

	}
	
	public static Bhava createBhava5(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava5 bhava5 = new Bhava5();
		bhava5.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava5;

	}
	
	public static Bhava createBhava6(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava6 bhava6 = new Bhava6();
		bhava6.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava6;

	}
	
	public static Bhava createBhava7(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava7 bhava7 = new Bhava7();
		bhava7.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava7;

	}
	
	public static Bhava createBhava8(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava8 bhava8 = new Bhava8();
		bhava8.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava8;

	}
	
	public static Bhava createBhava9(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava9 bhava9 = new Bhava9();
		bhava9.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava9;

	}
	
	public static Bhava createBhava10(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava10 bhava10 = new Bhava10();
		bhava10.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava10;

	}
	
	public static Bhava createBhava11(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava11 bhava11 = new Bhava11();
		bhava11.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava11;

	}
	
	public static Bhava createBhava12(Name_Of_Rashi rashi,ArrayList<Graha> grahaList) {
		Bhava12 bhava12 = new Bhava12();
		bhava12.setRashi(RashiFactory.getRashi(rashi,grahaList));
		return bhava12;

	}
	
	
	
	

}
