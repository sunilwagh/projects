package dattatreya.jyotish.rashis.libra;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.rashis.Rashi;
import dattatreya.jyotish.util.Direction;
import dattatreya.jyotish.util.EvenOdd;
import dattatreya.jyotish.util.GenderOfRashi;
import dattatreya.jyotish.util.MobilityOfRashi;
import dattatreya.jyotish.util.RashiNames;
import dattatreya.jyotish.util.Tattva;

@Component("libraRashi")
@Order(value=7)
public final class Libra implements Rashi{
	
    private final RashiNames nameOfRashi = RashiNames.LIBRA;
    private final MobilityOfRashi mobility=MobilityOfRashi.CHARA;
    private final GenderOfRashi gender=GenderOfRashi.MALE;
    private final Tattva tattva=Tattva.VAYU;
    private final Direction direction=Direction.WEST;
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
	public GenderOfRashi getGender() {
		return gender;
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
