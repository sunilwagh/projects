package dattatreya.jyotish.rashis.aquarius;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.EvenOdd;
import dattatreya.jyotish.util.Goals;
import dattatreya.jyotish.util.GenderOfRashi;
import dattatreya.jyotish.util.MobilityOfRashi;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("acquariusRashi")
@Order(value=11)
public final class Aquarius implements Rashi {

	private final RashiNames nameOfRashi = RashiNames.ACQUARIUS;
	private final MobilityOfRashi mobility = MobilityOfRashi.STHIRA;
	private final Tattva tattva = Tattva.VAYU;
	private final Goals goals = Goals.KAMA;
	private final Direction direction = Direction.WEST;
	private final GenderOfRashi gender = GenderOfRashi.MALE;
	private List<Graha> grahas;
	private final EvenOdd evenOddSign = EvenOdd.ODD;
	
	public List<Graha> getGrahas() {
		return grahas;
	}
	public void setGrahas(List<Graha> grahas) {
		this.grahas = grahas;
	}
	public RashiNames getNameOfRashi() {
		return nameOfRashi;
	}
	public MobilityOfRashi getMobility() {
		return mobility;
	}
	public Tattva getTattva() {
		return tattva;
	}
	public Goals getGoals() {
		return goals;
	}
	public Direction getDirection() {
		return direction;
	}
	public GenderOfRashi getGender() {
		return gender;
	}
	public EvenOdd getEvenOddSign() {
		return evenOddSign;
	}
	
	
	
	

	
	
	

}
