package dattatreya.jyotish.rashis;

import java.util.ArrayList;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import dattatreya.jyotish.grahas.Graha;
import dattatreya.jyotish.util.JyotishEnumUtil.Direction;
import dattatreya.jyotish.util.JyotishEnumUtil.Gender_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Mobility_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Name_Of_Rashi;
import dattatreya.jyotish.util.JyotishEnumUtil.Tattva;

@Component("cancerRashi")
@Order(value=4)
public final class Cancer implements Rashi{
		
	Name_Of_Rashi nameOfRashi = Name_Of_Rashi.CANCER;
	Mobility_Of_Rashi mobility=Mobility_Of_Rashi.CHARA;
	Gender_Of_Rashi gender=Gender_Of_Rashi.FEMALE;
	Tattva tattva=Tattva.APA;
	Direction direction=Direction.NORTH;
	ArrayList<Graha> grahas;
	
	public Mobility_Of_Rashi getMobility() {
		return mobility;
	}
	public void setMobility(Mobility_Of_Rashi mobility) {
		this.mobility = mobility;
	}
	public Gender_Of_Rashi getGender() {
		return gender;
	}
	public void setGender(Gender_Of_Rashi gender) {
		this.gender = gender;
	}
	public Tattva getTattva() {
		return tattva;
	}
	public void setTattva(Tattva tattva) {
		this.tattva = tattva;
	}
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public ArrayList<Graha> getGrahas() {
		return grahas;
	}
	public void setGrahas(ArrayList<Graha> grahas) {
		this.grahas = grahas;
	}
	
	public Name_Of_Rashi getNameOfRashi() {
		return nameOfRashi;
	}
	public void setNameOfRashi(Name_Of_Rashi nameOfRashi) {
		this.nameOfRashi = nameOfRashi;
	}
	
	

}