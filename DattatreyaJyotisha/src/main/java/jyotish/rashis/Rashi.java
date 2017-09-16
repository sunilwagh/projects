package jyotish.rashis;

import java.util.ArrayList;

import jyotish.grahas.Graha;
import util.JyotishEnumUtil.Direction;
import util.JyotishEnumUtil.Gender_Of_Rashi;
import util.JyotishEnumUtil.Mobility_Of_Rashi;
import util.JyotishEnumUtil.Name_Of_Rashi;
import util.JyotishEnumUtil.Tattva;

public interface Rashi {
	
	public Name_Of_Rashi getNameOfRashi();
	public void setNameOfRashi(Name_Of_Rashi nameOfRashi);
	public Mobility_Of_Rashi getMobility();
	public void setMobility(Mobility_Of_Rashi mobility);
	public Gender_Of_Rashi getGender();
	public void setGender(Gender_Of_Rashi gender);
	public Tattva getTattva();
	public void setTattva(Tattva tattva);
	public Direction getDirection();
	public void setDirection(Direction direction);
	public ArrayList<Graha> getGrahas();
	public void setGrahas(ArrayList<Graha> grahas);

}
