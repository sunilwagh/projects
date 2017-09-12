package jyotish.rashis;

import java.util.ArrayList;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public class Libra implements Rashi{
	
	Name_Of_Rashi nameOfRashi = Name_Of_Rashi.LIBRA;
	Mobility_Of_Rashi mobility;
	Gender_Of_Rashi gender;
	Tattva tattva;
	Direction direction;
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
