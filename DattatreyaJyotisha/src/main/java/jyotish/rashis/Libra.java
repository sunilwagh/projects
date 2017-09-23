package jyotish.rashis;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

@Component("libraRashi")
public final class  Libra implements Rashi{
	
    private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.LIBRA;
    private final Mobility_Of_Rashi mobility=Mobility_Of_Rashi.CHARA;
    private final Gender_Of_Rashi gender=Gender_Of_Rashi.MALE;
    private final Tattva tattva=Tattva.VAYU;
    private final Direction direction=Direction.WEST;
	private ArrayList<Graha> grahas;
	
	public ArrayList<Graha> getGrahas() {
		return grahas;
	}
	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}
	
	
	
	

}
