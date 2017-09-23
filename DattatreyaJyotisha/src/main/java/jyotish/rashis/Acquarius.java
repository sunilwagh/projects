package jyotish.rashis;

import java.util.ArrayList;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;
import util.JyotishEnumUtil.GOALS;

@Component("acquariusRashi")
@Order(value=11)
public final class Acquarius implements Rashi {

	private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.ACQUARIUS;
	private final Mobility_Of_Rashi mobility = Mobility_Of_Rashi.STHIRA;
	private final Tattva tattva = Tattva.VAYU;
	private final GOALS goals = GOALS.KAMA;
	private final Direction direction = Direction.WEST;
	private final Gender_Of_Rashi gender = Gender_Of_Rashi.MALE;
	ArrayList<Graha> grahas;

	public ArrayList<Graha> getGrahas() {
		return grahas;
	}

	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}
	
	

}
