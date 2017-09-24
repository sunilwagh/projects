package dattatreya.jyotish.rashis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.GenderOfRashi;
import dattatreya.jyotish.util.MobilityOfRashi;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("scorpioRashi")
@Order(value=8)
public final class Scorpio implements Rashi{
	

	private final RashiNames nameOfRashi = RashiNames.SCORPIO;
	private final MobilityOfRashi mobility=MobilityOfRashi.STHIRA;
	private final GenderOfRashi gender=GenderOfRashi.FEMALE;
	private final Tattva tattva=Tattva.APA;
	private final Direction direction=Direction.NORTH;
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
	public Tattva getTattva() {
		return tattva;
	}
	public Direction getDirection() {
		return direction;
	}
	
	
	
	

}
