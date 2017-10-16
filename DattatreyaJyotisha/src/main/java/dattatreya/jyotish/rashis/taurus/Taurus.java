package dattatreya.jyotish.rashis.taurus;

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

@Component("taurusRashi")
@Order(value=2)
public final class Taurus implements Rashi{
	
	private final RashiNames nameOfRashi = RashiNames.TAURUS;
	private final MobilityOfRashi mobility=MobilityOfRashi.STHIRA;
	private final GenderOfRashi gender=GenderOfRashi.FEMALE;
	private final EvenOdd evenOddSign = EvenOdd.EVEN;
	private final Goals goals = Goals.ARTHA;
	private final Tattva tattva= Tattva.PRITHVI;
	private final Direction direction = Direction.SOUTH;
	private List<Graha> grahas;
	
	
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
	public GenderOfRashi getGender() {
		return gender;
	}
	public Goals getGoals() {
		return goals;
	}
	public Tattva getTattva() {
		return tattva;
	}
	public Direction getDirection() {
		return direction;
	}
	public EvenOdd getEvenOddSign() {
		return evenOddSign;
	}
	
	
	
	
	
	
	
}
