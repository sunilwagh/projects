package jyotish.rashis;

import java.util.ArrayList;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public interface Rashi {
	
	public ArrayList<Graha> getGrahas();
	public void setGrahas(ArrayList<Graha> grahas);

}
