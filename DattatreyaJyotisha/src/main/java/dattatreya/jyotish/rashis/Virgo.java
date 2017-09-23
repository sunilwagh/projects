package dattatreya.jyotish.rashis;

import java.util.ArrayList;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Direction;
import dattatreya.jyotish.util.JyotishEnumUtil.GOALS;
import dattatreya.jyotish.util.JyotishEnumUtil.Gender_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Mobility_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;

@Component("virgoRashi")
@Order(value=6)
public final class Virgo implements Rashi {

	private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.VIRGO;
	private final Mobility_Of_Rashi mobility = Mobility_Of_Rashi.DWISVABHAVA;
	private final Gender_Of_Rashi gender = Gender_Of_Rashi.FEMALE;
	private final Tattva tattva = Tattva.PRITHVI;
	private final Direction direction = Direction.SOUTH;
	ArrayList<Graha> grahas;

	public ArrayList<Graha> getGrahas() {
		return grahas;
	}

	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}

}
