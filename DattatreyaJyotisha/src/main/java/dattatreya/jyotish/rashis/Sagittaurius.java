package dattatreya.jyotish.rashis;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Direction;
import dattatreya.jyotish.util.JyotishEnumUtil.Gender_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Mobility_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;

@Component("sagittariusRashi")
@Order(value=9)
public final class Sagittaurius implements Rashi{
	
    private final Name_Of_Rashi nameOfRashi = Name_Of_Rashi.SAGITTAURIUS;
	private final Mobility_Of_Rashi mobility=Mobility_Of_Rashi.DWISVABHAVA;
	private final Gender_Of_Rashi gender=Gender_Of_Rashi.MALE;
	private final Tattva tattva=Tattva.AGNI;
	private final Direction direction=Direction.EAST;
	private List<Graha> grahas;
	
	
	public List<Graha> getGrahas() {
		return grahas;
	}
	public void setGrahas(List<Graha> grahas) {
		this.grahas = grahas;
	}
	public Name_Of_Rashi getNameOfRashi() {
		return nameOfRashi;
	}
	public Mobility_Of_Rashi getMobility() {
		return mobility;
	}
	public Gender_Of_Rashi getGender() {
		return gender;
	}
	public Tattva getTattva() {
		return tattva;
	}
	public Direction getDirection() {
		return direction;
	}
	
	
	
	
	

}
