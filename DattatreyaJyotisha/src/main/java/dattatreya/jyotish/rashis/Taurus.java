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

@Component("taurusRashi")
@Order(value=2)
public final class Taurus implements Rashi{
	
	private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.TAURUS;
	private final Mobility_Of_Rashi mobility=Mobility_Of_Rashi.STHIRA;
	private final Gender_Of_Rashi gender=Gender_Of_Rashi.FEMALE;
	private final GOALS goals = GOALS.ARTHA;
	private final Tattva tattva= Tattva.PRITHVI;
	private final Direction direction = Direction.SOUTH;
	private ArrayList<Graha> grahas;
	
	
	public ArrayList<Graha> getGrahas() {
		return grahas;
	}
	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}
	
}