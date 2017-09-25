package dattatreya.jyotish.rashis.sagittaurius;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.GenderOfRashi;
import dattatreya.jyotish.util.MobilityOfRashi;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("sagittariusRashi")
@Order(value=9)
public final class Sagittaurius implements Rashi{
	
    private final RashiNames nameOfRashi = RashiNames.SAGITTAURIUS;
	private final MobilityOfRashi mobility=MobilityOfRashi.DWISVABHAVA;
	private final GenderOfRashi gender=GenderOfRashi.MALE;
	private final Tattva tattva=Tattva.AGNI;
	private final Direction direction=Direction.EAST;
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
