package dattatreya.jyotish.rashis;

import java.util.ArrayList;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Direction;
import dattatreya.jyotish.util.JyotishEnumUtil.Gender_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Mobility_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;

@Component("libraRashi")
@Order(value=7)
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