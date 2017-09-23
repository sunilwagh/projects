package jyotish.rashis;

import java.util.ArrayList;

import org.springframework.stereotype.Component;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

@Component("leoRashi")
public final class Leo implements Rashi {

	private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.LEO;
	private final Mobility_Of_Rashi mobility = Mobility_Of_Rashi.STHIRA;
	private final Gender_Of_Rashi gender = Gender_Of_Rashi.MALE;
	private final Tattva tattva = Tattva.AGNI;
	private final Direction direction = Direction.EAST;
    ArrayList<Graha> grahas;

	public ArrayList<Graha> getGrahas() {
		return grahas;
	}

	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}

}
